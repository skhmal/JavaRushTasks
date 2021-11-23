package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstFilePath = scanner.nextLine();
        String secondFilePath = scanner.nextLine();
        String thirdFilePath = scanner.nextLine();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(firstFilePath, true));
        BufferedReader bufferedReaderFileTwo = new BufferedReader(new FileReader(secondFilePath));
        BufferedReader bufferedReaderFileThree = new BufferedReader(new FileReader(thirdFilePath))){
            while (bufferedReaderFileTwo.ready()){
                bufferedWriter.write(bufferedReaderFileTwo.read());
            }

            while (bufferedReaderFileThree.ready()){
                bufferedWriter.write(bufferedReaderFileThree.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
