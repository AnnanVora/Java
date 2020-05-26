package com.company;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new LinkedHashMap<>();
    private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile rao = new RandomAccessFile("Locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size());
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
            rao.writeInt(locationStart);

            long indexStart = rao.getFilePointer();
            int startPointer = locationStart;
            rao.seek(startPointer);

            for (Location location : locations.values()) {
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder = new StringBuilder();
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                    }
                }
                rao.writeUTF(builder.toString());
                IndexRecord record = new IndexRecord(startPointer, (int) (rao.getFilePointer() - startPointer));
                index.put(location.getLocationID(), record);
                    startPointer = (int) rao.getFilePointer();
                }

            rao.seek(indexStart);
            for (Integer locationID : index.keySet()) {
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }
        }
    }

    public void close() throws IOException {
        ra.close();
    }

    public Location getLocation(int locationID) throws IOException {
        IndexRecord record = index.get(locationID);
        ra.seek(record.getStartByte());
        int id = ra.readInt();
        String description = ra.readUTF();
        String exits = ra.readUTF();
        String[] exitPart = exits.split(",");

        Location location = new Location(locationID, description, null);

        if (locationID != 0) {
            for (int i = 0; i < exitPart.length; i++) {
                String direction = exitPart[i];
                int destination = Integer.parseInt(exitPart[++i]);
                location.addExit(direction, destination);
            }
        }
        return location;
    }

    static {
        try {
            ra = new RandomAccessFile("Locations_rand.dat", "rwd");
            int numLocations = ra.readInt();
            long locationStartPoint = ra.readInt();

            while (ra.getFilePointer() < locationStartPoint) {
                int locationID = ra.readInt();
                int locationStart = ra.readInt();
                int locationLength = ra.readInt();

                IndexRecord record = new IndexRecord(locationStart, locationLength);
                index.put(locationID, record);
            }

        } catch (IOException e) {
            System.out.println("IO Exception in static initializer");
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    } // Override Map methods
}
