package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {

        File path = new File(args[0]);
        File resultFile = new File(args[1]);;
        File renameResultFile = new File(resultFile.getParentFile() + "\\allFilesContent.txt");


        if (FileUtils.isExist(renameResultFile)){
             FileUtils.deleteFile(renameResultFile);
        }

        FileUtils.renameFile(resultFile, renameResultFile);

        Map<String, String> map = new HashMap<>();
        Queue<File> fileQueue = new PriorityQueue<>();
        Collections.addAll(fileQueue, path.listFiles());

        while (!fileQueue.isEmpty()){
            File currentFile = fileQueue.remove();
            if (currentFile.isDirectory()){
                Collections.addAll(fileQueue, currentFile.listFiles());
            }else{
                if (currentFile.isFile() && currentFile.length() <= 50){
                    map.put(currentFile.getName(), currentFile.getAbsolutePath());
                }
            }
        }

       Map<String, String> sortedMap =  new TreeMap<>(map);
       try (FileOutputStream fileWriter = new FileOutputStream(renameResultFile)){
            for (String fileBody:sortedMap.values()
            ) {
                try (FileInputStream fileReader = new FileInputStream(fileBody)){
                    byte[] buffer = new byte[50];
                    int i = fileReader.read(buffer);
                    fileWriter.write(buffer, 0, i);
                    fileWriter.write("\n".getBytes(StandardCharsets.UTF_8));

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
