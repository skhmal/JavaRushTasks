package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {

    public static class Product{
        int id;
        String productName;
        double price;
        int quantity;

        public Product(int id, String productName, double price, int quantity) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        int id = Integer.parseInt(args[0]);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String str;
            while (bufferedReader.ready()){
                str = bufferedReader.readLine();
                String[] stringArray = str.split(" ");
                if (Integer.parseInt(stringArray[0]) == id){
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
