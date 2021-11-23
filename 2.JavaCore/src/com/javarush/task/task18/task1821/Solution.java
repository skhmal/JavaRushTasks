package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        if (args.length == 0){
        return;
    }
    try (FileInputStream inputStream = new FileInputStream(args[0])){
        int[] array = new int[256];

        while (inputStream.available() > 0){
            array[inputStream.read()] += 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                System.out.println((char)i + " " + array[i]);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
