package com.company;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("Hello");
        Path path1 = FileSystems.getDefault().getPath("Hello.enc");
        File file = path.toFile();
        File file1 = path1.toFile();
        WoodStaff.encrypt(file, file1, 4);
        WoodStaff.decrypt();
    }
}
