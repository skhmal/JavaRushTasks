package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";

        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String binary = "";
        if (decimalNumber > 0) {
            while (decimalNumber > 0){
                binary = (decimalNumber%2) + binary;
                decimalNumber = decimalNumber / 2;
            }
        }else
        {
            return "";
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int result = 0;
        if (binaryNumber == null){
            return 0;
        }
        int h = 0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                int valueChar = 0;
                h = binaryNumber.charAt(i);
                if (h==49) { valueChar =1;} else { valueChar = 0; }
                result = (int) (result + (valueChar * (Math.pow(2, (binaryNumber.length()-1)-i ) ) ) );
            }
        return result;
}}
