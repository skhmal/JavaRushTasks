package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFilePath = bufferedReader.readLine();
        String secondFilePath = bufferedReader.readLine();
        int j = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(firstFilePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(secondFilePath))) {

            while (br.ready()){
                if (j%2 == 0){
                        bw.write(br.read());
                    }else{
                    br.read();
                }
                    j++;
                }
        }
    }
}
