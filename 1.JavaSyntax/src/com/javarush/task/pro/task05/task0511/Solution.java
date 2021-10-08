package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        multiArray = new int[n][];
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int literal = sc.nextInt();
                array[i] = literal;
            }
            for (int i = 0; i < multiArray.length; i++) multiArray[i] = new int[array[i]];
                for (int i = 0; i < multiArray.length; i++) {
                    for (int j = 0; j < multiArray[i].length; j++) {
                        System.out.print("[] ");
                    }
                    System.out.println();
                }

            }


        }
    }
