package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")){
            long number = Long.parseLong(args[1]);
            String text = args[2];
            byte[] buffer = new byte[text.length()];

            raf.seek(number);
            raf.read(buffer, 0, text.length());

            raf.seek(raf.length());
            String readString = new String(buffer);
            if (readString.equals(text)){
                raf.write("true".getBytes());
            }else{
                raf.write("false".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
