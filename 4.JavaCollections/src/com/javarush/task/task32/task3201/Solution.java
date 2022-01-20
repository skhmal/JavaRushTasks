package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args)  {
        try (RandomAccessFile raf = new RandomAccessFile(args[0],"rw")){
            long number = Long.parseLong(args[1]);
            long length = raf.length();
            
            if (number > length){
                raf.seek(raf.length());
                raf.write(args[2].getBytes());
                raf.close();
                
            }else{
                raf.seek(Long.parseLong(args[1]));
                raf.write(args[2].getBytes());
                raf.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
