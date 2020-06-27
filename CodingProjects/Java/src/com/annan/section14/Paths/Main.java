package com.annan.section14.Paths;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

        try {
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Files.move(fileToMove, destination);
//
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);
//
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
//
//            Path directoryToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(directoryToCreate);
//
//            Path directoryToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//            Files.createDirectories(directoryToCreate);

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("Size = " + attributes.size());
            System.out.println("Last Modified = " + attributes.lastModifiedTime());
            System.out.println("Created = " + attributes.creationTime());
            System.out.println("isDirectory = " + attributes.isDirectory());
            System.out.println("isRegularFile = " + attributes.isRegularFile());


        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

//      Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
////        Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
//        Path filePath = Paths.get(".", "files", "SubdirectoryFile.txt");
//        printFile(filePath);
//        filePath = Paths.get("D:\\Desktop\\annan\\Java\\Section 14\\OutThere.txt");
//        printFile(filePath);
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
//        System.out.println(path.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("ThisFileDoesntExist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("Z:\\abcde", "whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(path4));
//        System.out.println("Exists = " + Files.exists(filePath));
//    }
//
//    private static void printFile(Path path) {
//        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println();
//    }
    }
}
