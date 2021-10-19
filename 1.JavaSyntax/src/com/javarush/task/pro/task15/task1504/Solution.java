package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in); InputStream fileInputStream = Files.newInputStream(Path.of(scanner.nextLine()));
        OutputStream fileOutputStream = Files.newOutputStream(Path.of(scanner.nextLine()))){
            byte[] data = fileInputStream.readAllBytes();
            for (int i = 0; i < data.length; i++) {
                if (i%2 == 0 && i != data.length-1){
                    fileOutputStream.write(data[i+1]);
                }else if ((i != data.length) && (i % 2 != 0)) {
                    fileOutputStream.write(data[i-1]);
                }else if(i%2==0 && i== data.length-1){
                    fileOutputStream.write(data[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

