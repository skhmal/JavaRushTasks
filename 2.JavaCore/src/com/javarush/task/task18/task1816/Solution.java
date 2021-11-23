package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            int counter = 0;
            int data;
            while (bufferedReader.ready()){
              data = bufferedReader.read();
              if ((data > 64 && data < 91) || (data > 96 && data < 123)){
                  counter++;
              }
            }
            System.out.println(counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
