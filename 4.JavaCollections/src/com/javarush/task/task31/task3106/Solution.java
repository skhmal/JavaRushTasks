package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String resultFile = args[0];

        List<String> list = new ArrayList<>(Arrays.asList(args).subList(1, args.length));
        Collections.sort(list);
        List<FileInputStream> fileInputStreams = new ArrayList<>();
        for (String nameInputStream:list
             ) {
            fileInputStreams.add(new FileInputStream(nameInputStream));
        }

        try (ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(Collections.enumeration(fileInputStreams)))){
            while (true){
                ZipEntry zipEntry = zipInputStream.getNextEntry();
                if (zipEntry == null) break;
               
                try (OutputStream os = new BufferedOutputStream(new FileOutputStream(resultFile))){
                    final int bufferSize = 1024;
                    byte[] buffer = new byte[bufferSize];
                    for (int i; (i = zipInputStream.read(buffer, 0 , bufferSize)) > -1;){
                       os.write(buffer, 0,i);
                   }
                   os.flush();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
