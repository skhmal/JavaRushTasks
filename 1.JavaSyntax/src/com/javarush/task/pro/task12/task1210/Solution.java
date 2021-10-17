package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i,i);
        }
    }

    public static void reverse() {
       int coefficient = numbers.size()-1;
            for (int j = 0; j < numbers.size() / 2; j++) {
                int tmp = numbers.get(j);
                numbers.set(j, numbers.get(coefficient-j));
                numbers.set(coefficient - j, tmp);
            }
        }


    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
