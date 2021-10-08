package com.javarush.task.pro.task08.task0809;

/* 
Counter

*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
            if (i<9){ Thread.sleep(1, 300000); }
        }
    }
}
