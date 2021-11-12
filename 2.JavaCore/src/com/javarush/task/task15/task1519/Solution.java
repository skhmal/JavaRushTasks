package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        String str;
        int i;
        try (Scanner scanner = new Scanner(System.in)){

            while (!(str = scanner.nextLine()).equals("exit")){

                try {
                   if (!(str.indexOf('.') == -1)) {
                        print(Double.parseDouble(str));
                   }else if  (((i = Integer.parseInt(str)) > 0) && i < 128){
                       print((short) i);
                   } else if (i <= 0) {
                       print(Integer.valueOf(i));
                   } else if (i >= 128) {
                       print(Integer.valueOf(i));
                   }
                }catch (NumberFormatException e){
                    print(str);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
