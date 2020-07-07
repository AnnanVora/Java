package com.company;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class RailFence {


    public static void encrypt(File file) {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] chars = sb.toString().replaceAll(" ", "").replaceAll("[.,!]", "").split("");
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < (chars.length % 2 == 0 ? chars.length - 1 : chars.length); i += 2) {
            encryptedText.append(chars[i]);
        }
        for (int i = 1; i < chars.length; i += 2) {
            encryptedText.append(chars[i]);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(FileSystems.getDefault().getPath(file + ".rfe"))))) {
            bw.write(encryptedText.toString().toUpperCase());
            Files.delete(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File " + file.getAbsolutePath() + " successfully encrypted with Rail Fence algorithm.");
    }

    public static void decrypt(File file) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] chars = sb.toString().split("");
        StringBuilder decryptedText = new StringBuilder();

        int length = chars.length % 2 == 0 ? chars.length / 2 : (chars.length / 2 - 1);
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(chars).subList(0, length));
        ArrayList<String> a2 = new ArrayList<>(Arrays.asList(chars).subList(length, chars.length));

        for (int i = 0; i < length; i++) {

            decryptedText.append(a1.get(i));
            decryptedText.append(a2.get(i));
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(String.valueOf(FileSystems.getDefault().getPath(file + ".txt"))))) {
            bw.write(decryptedText.toString().toLowerCase());
            Files.delete(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File " + file.getAbsolutePath() + " successfully decrypted with Rail Fence algorithm.");
    }
}
