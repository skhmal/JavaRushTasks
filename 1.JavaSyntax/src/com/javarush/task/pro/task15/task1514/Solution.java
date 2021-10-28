package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишите тут ваш код
        Path firsPath = Path.of(str1);
        Path secondPath = Path.of(str2);

        try {
            System.out.println(firsPath.relativize(secondPath));
        } catch (Exception e) {
            try {
                System.out.println(secondPath.relativize(firsPath));
            } catch (Exception a) {
            }

        }
    }
}

