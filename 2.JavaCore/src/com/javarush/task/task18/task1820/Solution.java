package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String firstFilePath = scanner.nextLine();
    String secondFilePath = scanner.nextLine();


    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(firstFilePath));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondFilePath))){
        String  inputString = null;

        while (bufferedReader.ready()){
         inputString = bufferedReader.readLine();
        }

        StringTokenizer tokenizer = new StringTokenizer(inputString, " ");
        while (tokenizer.hasMoreTokens()){
            String token =  tokenizer.nextToken();
            bufferedWriter.write((int) Math.round(Double.parseDouble(token)) + " ");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
