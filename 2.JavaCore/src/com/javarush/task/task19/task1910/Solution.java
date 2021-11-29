package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        String firstFile = null;
        String secondFile = null;
        String result = "";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFile = bufferedReader.readLine();
            secondFile = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondFile));
        BufferedReader br = new BufferedReader(new FileReader(firstFile))){
            while (br.ready()){
                result += br.readLine();
            }
            String[] stringArray = result.split(" ");
            result = "";
            for (String string: stringArray
                 ) {
                result += string.replaceAll("\\W", "").replaceAll("_", "") + " ";
            }
            bufferedWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
