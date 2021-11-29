package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        String firstFilepath = null, secondFilepath = null;
        List<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
        {
            firstFilepath = bufferedReader.readLine();
            secondFilepath = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(firstFilepath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondFilepath))) {
            while (br.ready()){
                list.add(br.readLine());
            }

            for (String element:list
                 ) {
                String[] str = element.split(" ");
                for (String strElement:str
                     ) {
                    if (strElement.chars().allMatch(Character::isDigit)){
                        bufferedWriter.write(strElement + " ");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
