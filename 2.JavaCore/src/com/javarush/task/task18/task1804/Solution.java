package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] valueArray = new int [256];
        int minValue = 256;
        ArrayList<Integer> resultList = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in); FileInputStream fileInputStream = new FileInputStream(scanner.nextLine())){
            while (fileInputStream.available() > 0){
                valueArray[fileInputStream.read()] += 1;
            }

            for (Integer value:valueArray
                 ) {
                if (minValue > value && value > 0){
                    minValue = value;

                }
            }

            for (int i = 0; i < valueArray.length; i++) {
                if (valueArray[i] == minValue && valueArray[i] > 0){
                    resultList.add(i);
                }
            }

            for (Integer it:resultList
                 ) {
                System.out.print(it + " ");
            }
        }
    }
}
