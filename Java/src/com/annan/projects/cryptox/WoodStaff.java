package com.annan.projects.cryptox;

import java.io.*;

public class WoodStaff {

    public static void encrypt(File inputFile, File outputFile, int staffS) {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] chars = line.replaceAll(" ", "").toUpperCase().split("");
                int length = chars.length;

                for (int i = 0; i < staffS; i++) {
                    for (int j = i; j < length; j += staffS) {
                        sb.append(chars[j]);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void decrypt(String input, int staffS) {
        String[] chars = input.toLowerCase().split("");
        int length = input.length();
        String[] output = new String[length];

        int readIndex = 0;
        for (int i = 0; i < staffS; i++) {
            int writeIndex = i;
            while (readIndex < length && writeIndex < length) {
                output[writeIndex] = chars[readIndex];
                readIndex++;
                writeIndex += staffS;
            }

        }
    }

}
