package com.javarush.task.task19.task1902;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Base64;

/* 
Адаптер
*/

public class AdapterFileOutputStream implements AmigoStringWriter{
    private FileOutputStream fileOutputStream;
    public static void main(String[] args) {
        String string = "+380(50)123-4567" ;
        byte[] array = string.getBytes();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 47) && (array[i] < 58)){
                j++;
            }
        }
        byte[] array2 = new byte[j];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 47) && (array[i] < 58)){
               array2[a++] += array[i];
            }
        }

        String result = new String(array2);
        System.out.println(""+result);
//        System.out.println(string.replaceAll("\\D", ""));

    }


    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}

