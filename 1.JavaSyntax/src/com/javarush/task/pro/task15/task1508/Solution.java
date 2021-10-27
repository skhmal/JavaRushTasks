package com.javarush.task.pro.task15.task1508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
            InputStreamReader inputStreamReader = new InputStreamReader(stream)) {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String string = bufferedReader.readLine();
            for (int i = 0; i < string.length(); i++) {
               char ch = string.charAt(i);
                if (i % 2 == 1) {
                    System.out.print(Character.toUpperCase(ch));
                } else {
                    System.out.print(Character.toLowerCase(ch));
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

