package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        String filePath = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
               filePath = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream adapter = new PrintStream(byteArrayOutputStream);
        System.setOut(adapter);
        testString.printSomething();
        String result = byteArrayOutputStream.toString();
        System.setOut(console);

        try (FileOutputStream bufferedWriter = new FileOutputStream(filePath)){
            bufferedWriter.write(result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

