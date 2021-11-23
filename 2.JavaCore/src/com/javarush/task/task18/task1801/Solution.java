package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int counter = 0;
        try (Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine())){
            while (fileInputStream.available() > 0){
                int data = fileInputStream.read();
                if (counter < data){
                    counter = data;
                }
            }
        }
        System.out.println(counter);
    }
}
