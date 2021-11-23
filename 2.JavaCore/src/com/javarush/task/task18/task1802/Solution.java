package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int min = 255;
       try (Scanner scanner = new Scanner(System.in);
       FileInputStream fileInputStream = new FileInputStream(scanner.nextLine())){
           while (fileInputStream.available() > 0){
               int data = fileInputStream.read();
               if (min > data){
                   min = data;
               }
           }
           System.out.println(min);
       }

    }
}
