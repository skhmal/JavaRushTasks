package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        List<Product> productList = new ArrayList<>();

        String str = "";
        if (args.length == 0){
            return;
        }

        switch (args[0]){
            case "-c":
              int id = 0;

              try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))){

              while (bufferedReader.ready()){
                    Product product = getProduct(bufferedReader.readLine());
                    productList.add(product);
                }

                for (Product product: productList
                     ) {
                    if (product.id > id){
                        id = product.id;
                    }
                }

                String name = args[1];
                if (name.length() > 30){
                   name =  name.substring(0,30);
                }

                String price = args[2];
                if (price.length() > 8){
                    price = price.substring(0, 8);
                }

                String quantity = args[3];
                if (quantity.length() > 4){
                    quantity = quantity.substring(0, 4);
                }

                Product product = new Product(++id, name.trim(), price, quantity);
                bufferedWriter.write("\n" + product);
                break;
            }
        }
    }

    public static class Product{
        int id;
        String price;
        String quantity;
        String productName;

        public Product(int id, String productName, String price, String quantity) {
            this.id = id;
            this.price = price;
            this.quantity = quantity;
            this.productName = productName;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, productName, price, quantity);
        }
    }

    public static Product getProduct(String productLine){
        String id = productLine.substring(0,8).trim();
        String productName = productLine.substring(8,38).trim();
        String price = productLine.substring(38,46).trim();
        String quantity = productLine.substring(46,50).trim();
        return new Product(Integer.parseInt(id), productName, price, quantity);
    }
}
