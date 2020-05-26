package com.company;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) {

        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel = binFile.getChannel()) {

            byte[] outputBytes = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
            buffer.put(outputBytes);
            buffer.flip();
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was " + numBytes);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was " + numBytes);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();
            buffer.flip();
            channel.read(buffer);
            if (buffer.hasArray()) {
                System.out.println("Byte Buffer = " + new String(buffer.array()));
            }

            intBuffer.flip();
            channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));
            intBuffer.flip();
            channel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt(0));
            System.out.println(intBuffer.getInt());

            channel.close();
            ra.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
