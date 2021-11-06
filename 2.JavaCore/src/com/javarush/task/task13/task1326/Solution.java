package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String filepath = scanner.nextLine();
        List<Integer> list = new ArrayList<>();

        try (InputStream fileInputStream = new FileInputStream(filepath);
        Scanner sc = new Scanner(fileInputStream))
        {
            while (sc.hasNextInt()){
                list.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        for (Integer i:list
             ) {
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
