package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            String filePath = scanner.nextLine();
            if (filePath.equals("exit")){
                flag = false;
                break;
            }
            new ReadThread(filePath).start();
        }
    }

    public static class ReadThread extends Thread {
        private String filename;
        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
        }

        @Override
        public void run() {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
                int max = -1;
                int[] charArray = new int [256];
                while (bufferedReader.ready()){
                    charArray[bufferedReader.read()] += 1;
                }
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] > max){
                        max = charArray[i];
                    }
                }
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] == max){
                        resultMap.put(filename, i);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
