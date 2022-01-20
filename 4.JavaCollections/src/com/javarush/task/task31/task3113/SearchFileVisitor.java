package com.javarush.task.task31.task3113;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private int fileCounter;
    private int directoryCounter;
    private long sizeOfDirectory;

    public int getFileCounter() {
        return fileCounter;
    }

    public int getDirectoryCounter() {
        return directoryCounter;
    }

    public long getSizeOfDirectory() {
        return sizeOfDirectory;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        if (Files.isDirectory(dir)){
            directoryCounter++;
        }
        return super.preVisitDirectory(dir, attrs);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (Files.isRegularFile(file)){
            fileCounter++;
            sizeOfDirectory += Files.size(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
