package com.javarush.task.task18.task1824;

import java.io.*;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String filePath = scanner.nextLine();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){

            } catch (FileNotFoundException e) {
                System.out.println(filePath);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
