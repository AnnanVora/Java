package com.company;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("HelloWorld.txt");
        File file = path.toFile();
        RailFence.encrypt(file);
    }
}
