package com.annan.section14.InputOutput;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static final Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Locations.dat")))) {
            for (Location location : locations.values()) {
                locFile.writeObject(location);
            }
        }
    }

    static {
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Locations.dat")))) {
            boolean eof = false;
            while (!eof) {
                try {
                    Location location = (Location) locFile.readObject();
                    locations.put(location.getLocationID(), location);
                } catch (EOFException e) {
                    eof = true;
                }
            }

        } catch (InvalidClassException e) {
            System.out.println("Invalid Class Exception " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found Exception" + e.getMessage());
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
