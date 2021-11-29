package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.PreparedStatement;
import java.util.Locale;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream adapter = new PrintStream(outputStream);
        System.setOut(adapter);
        testString.printSomething();
        String result = outputStream.toString().toUpperCase();
        System.setOut(console);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
