package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(createPassword(), 0, createPassword().length);

        return byteArrayOutputStream;
    }

    public static byte[] createPassword(){
        char[] lowerCase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] digits = "0123456789".toCharArray();
        byte[] password = new byte[8];

        int lowerCount = 0, upperCount = 0, digitsCounter = 0;
        for (int i = 0; i < 8; i++) {
            int label = getRandom(10);

            if (label%3 == 0){
                password[i] = (byte) upperCase[getRandom(25)];
                upperCount++;
            }else if (label%2 == 0){
                password[i] = (byte) lowerCase[getRandom(25)];
                lowerCount++;
            }else {
                password[i] = (byte) digits[getRandom(9)];
                digitsCounter++;
            }
        }

        if ((digitsCounter == 0) || (upperCount == 0) || (lowerCount == 0)){
            return createPassword();
        }

        return password;
    }


    public static int getRandom(int range){
        return (int)(Math.random()*range + 1);
    }
}
