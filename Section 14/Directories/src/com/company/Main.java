package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {


    public static void main(String[] args) {

        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
//        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try {
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());

        } catch (IOException  e) {
            System.out.println(e.getMessage());
        }

//        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
//        for (FileStore store : stores) {
//            System.out.println(store.name());
//            System.out.println("Volume name/Drive letter" + store);
//        }

        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths) {
            System.out.println(path);
        }

        System.out.println("**************Walking tree for Dir2*************");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintFiles());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
