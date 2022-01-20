package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter stringWriter = new StringWriter();

        if (is != null) {
            try (Reader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
                char[] buffer = new char[4096];
                int n;
                while ((n = bufferedReader.read(buffer)) != -1){
                    stringWriter.write(buffer, 0, n);
                }
            }
        }

        return stringWriter;
    }
}
