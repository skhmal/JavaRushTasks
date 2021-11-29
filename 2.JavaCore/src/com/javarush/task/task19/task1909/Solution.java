package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        String firstFilePath = null;
        String secondFilePath = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            firstFilePath = bufferedReader.readLine();
            secondFilePath = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(firstFilePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(secondFilePath))) {
            while (br.ready()){
                bw.write(br.readLine().replaceAll("\\.","!"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
