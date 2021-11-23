package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstFilePath = scanner.nextLine();
        String secondFilePath = scanner.nextLine();

        ArrayList<Integer> data = new ArrayList<>();

        try (BufferedReader bufferedReaderFirstFile = new BufferedReader(new FileReader(firstFilePath));
        BufferedReader bufferedReaderSecondFile = new BufferedReader(new FileReader(secondFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(firstFilePath))){

            while (bufferedReaderFirstFile.ready()){
                data.add(bufferedReaderFirstFile.read());
            }

            while (bufferedReaderSecondFile.ready()){
                bufferedWriter.write(bufferedReaderSecondFile.read());
            }

            for (Integer element: data
                 ) {
                bufferedWriter.write(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
