package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int [n];

        for (int i = 0; i < n; i++){
            array[i]= sc.nextInt();
        }
        int max = array[0];

        for (int i = 0; i < n; i++){
            if (max < array[i])
                max = array[i];
        }
        System.out.println(max);
    }
}
