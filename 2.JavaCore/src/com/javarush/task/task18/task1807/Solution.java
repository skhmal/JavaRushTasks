package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        int counter = 0;

        try (Scanner scanner = new Scanner(System.in); FileInputStream fileInputStream = new FileInputStream(scanner.nextLine())){
            while (fileInputStream.available() > 0){
                int count = fileInputStream.read();
                if (count == 44){
                    counter ++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
