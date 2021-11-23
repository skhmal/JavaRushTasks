package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
            ArrayList<Integer>  valueList = new ArrayList<>();
            Map <Integer, Integer> result = new HashMap<>();
            int maxValue = 0;

        try (Scanner scanner = new Scanner(System.in); FileInputStream fileInputStream = new FileInputStream(scanner.nextLine())){
            while (fileInputStream.available() > 0){
                valueList.add(fileInputStream.read());
            }

            Collections.addAll(valueList);

            for (Integer element:valueList
                 ) {
                result.put(element,Collections.frequency(valueList, element));
            }

            for (Integer key: result.keySet())
            {
                Integer value = result.get(key);
                if (value > maxValue){
                    maxValue = value;
                }
            }

            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                if (maxValue == entry.getValue()) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }
}
