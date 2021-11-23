package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))){
            int spaceCounter = 0;
            int allCharCounter = 0;
            int data;

            while (bufferedReader.ready()){
               data = bufferedReader.read();
               if (data == 32){
                   spaceCounter++;
               }
               allCharCounter++;
            }
                if (allCharCounter != 0 && spaceCounter != 0) {
                double p =(double) spaceCounter / allCharCounter * 100;
                System.out.printf("%.2f", p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
