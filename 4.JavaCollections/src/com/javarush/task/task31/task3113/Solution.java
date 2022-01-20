package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Path path = Paths.get(bufferedReader.readLine());
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        if (!Files.isDirectory(path)){
            System.out.println(path + " - не папка");
            return;
        }

        Files.walkFileTree(path, searchFileVisitor);
        System.out.println("Всего папок - " + (searchFileVisitor.getDirectoryCounter()-1));
        System.out.println("Всего файлов - "  + searchFileVisitor.getFileCounter());
        System.out.println("Общий размер - " + searchFileVisitor.getSizeOfDirectory());

    }


}
