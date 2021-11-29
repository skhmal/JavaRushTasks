package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream adapter = new PrintStream(byteArrayOutputStream);
        System.setOut(adapter);
        testString.printSomething();
        String string = byteArrayOutputStream.toString();
        System.setOut(console);
        String[] strings = string.split(" ");
        int result = 0;
        if (strings[1].equals("+")){
            result = Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]);
        }else if (strings[1].equals("-")){
            result = Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]);
        }else if (strings[1].equals("*")){
            result = Integer.parseInt(strings[0]) * Integer.parseInt(strings[2]);
        }
        System.out.print(string + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

