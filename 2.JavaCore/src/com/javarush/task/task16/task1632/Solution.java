package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Клубок
*/

public class Solution extends Thread{
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourThread());
        threads.add(new FifthThread());
    }

    public static class FirstThread extends Thread{
        @Override
        public void run(){
            while (true){

            }
        }
    }

    public static class SecondThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(0);
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }

        }
    }

    public static class ThirdThread extends Thread{
        @Override
        public void run(){
            while (!isInterrupted()){
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class FourThread extends Thread implements Message{
        @Override
        public void run() {
            try {
                while (isAlive()) {
                    Thread.sleep(0);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class FifthThread extends Thread{
        @Override
        public void run() {
            String string;
            int sum = 0;

           try (Scanner scanner = new Scanner(System.in)) {
               while (!(string = scanner.nextLine()).equals("N")) {
                   sum += Integer.parseInt(string);
               }
           }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
    }
}