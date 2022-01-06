package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
       List<String> list = new ArrayList<>();
       File folder = new File(root);
       Queue<File> fileQueue = new PriorityQueue<>();
       Collections.addAll(fileQueue, Objects.requireNonNull(folder.listFiles()));

       while (!fileQueue.isEmpty()){
           File currentFile = fileQueue.remove();
           if (currentFile.isDirectory()){
               Collections.addAll(fileQueue, Objects.requireNonNull(currentFile.listFiles()));
           }else{
               list.add(currentFile.getAbsolutePath());
           }
       }
        System.out.println(list);
        return list;

    }

    public static void main(String[] args) throws IOException {
        getFileTree("C:\\Users");
    }
}
