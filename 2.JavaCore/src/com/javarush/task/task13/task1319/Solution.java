package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String fileoutputPath = String.valueOf(scanner.nextLine());

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
           try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileoutputPath))){
                String line;
                Boolean flag = true;
                while (flag == true){
                    line = reader.readLine();
                    writer.write(line + "\n");
                    if (line.equals("exit")){
                        flag = false;
                    }
                }
           }catch (Exception e){
               e.printStackTrace();
           }

       }catch (IOException e) {
           e.printStackTrace();
       }


    }
    }
