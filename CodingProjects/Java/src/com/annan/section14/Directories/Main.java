package com.annan.section14.Directories;

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


        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths) {
            System.out.println(path);
        }

        System.out.println("**************Walking tree for Dir2*************");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new com.company.PrintFiles());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("***********Copy Dir2 to Dir4\\Dir2Copy***********");
        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
        try {
            Files.walkFileTree(dir2Path, new com.company.CopyFiles(dir2Path, copyPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File file = new File("C:\\Examples\\file.txt");
        Path convertedPath = file.toPath();
        System.out.println("Converted Path = " + convertedPath);

        File parent = new File("C:\\Examples");
        File resolvedFile = new File(parent, "dir\\file.txt");
        System.out.println(resolvedFile.toPath());
        resolvedFile = new File("C:\\Examples", "dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("C:\\Examples");
        Path childRelativePath = Paths.get("dir\\file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        System.out.println("****************using list()**********************");
        File dir2File = new File(workingDirectory, "\\FileTree\\Dir2");
        String[] dir2Contents = dir2File.list();
        for (int i = 0; i < dir2Contents.length; i++) {
            System.out.println("i = " + i + ": " + dir2Contents[i]);
        }

        System.out.println("****************using listFiles()********************");
        File[] dir2Files = dir2File.listFiles();
        for (int i = 0; i < dir2Files.length; i++) {
            System.out.println("i = " + i + ": " + dir2Files[i].getName());
        }
    }
}
