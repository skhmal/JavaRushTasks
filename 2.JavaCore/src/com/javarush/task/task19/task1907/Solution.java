package com.javarush.task.task19.task1907;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        String filepath = null;
        List<String> array = new ArrayList<>();
        int counter = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));){
            filepath = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))){
            while (br.ready()){
                array.add(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String str:array
             ) {
         String l = str.replaceAll("\\W", " ").replaceAll("\\d", " ");
         String[] strArray = l.split(" ");
            for (String s:strArray
                 ) {
                if (s.trim().equals("world")){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
