package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String str =  url.substring(url.indexOf("?")+1);
        String tmp;
        String[] strings = str.split("&");
        String result = "";

        for (String string:strings
             ) {
            int i;
            if (( i =string.indexOf("=")) != -1){
                tmp = string.substring(0,i);
                result += tmp + " ";
            }else{
                result += string + " ";
            }
        }
        System.out.println(result);

        for (String string:strings
             ) {
            if (string.contains("obj")){
                tmp = string.substring(string.indexOf("=")+1);
                try {
                    alert(Double.parseDouble(tmp));
                }catch (Exception e){
                    alert(tmp);
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
