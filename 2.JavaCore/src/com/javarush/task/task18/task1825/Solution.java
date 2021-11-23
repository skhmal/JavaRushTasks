package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> pathList = new ArrayList<>();
        Map <String, Integer> dataPairs = new HashMap<>();

        while(true){
            String pathFile = scan.nextLine();
            if (pathFile.equals("end")){
                    break;
            }
            pathList.add(pathFile);
        }
        //Collections.sort(pathList);
        int id;
        String fileName;

        for (String s:pathList
             ) {
            id = Integer.parseInt(s.substring(s.lastIndexOf(".")+5));
           dataPairs.put(s,id);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(dataPairs.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> el:list
             ) {
           String filepath = el.getKey();
           fileName = filepath.substring(0, filepath.lastIndexOf("."));

           try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))){

                while (bufferedReader.ready()){
                    bufferedWriter.write(bufferedReader.read());
                }

           } catch (IOException e) {
               e.printStackTrace();
           }
        }
    }
}

