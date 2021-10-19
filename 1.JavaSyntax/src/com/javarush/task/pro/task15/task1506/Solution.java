package com.javarush.task.pro.task15.task1506;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут вашScanner scanner = new Scanner(System.in); код


        try(Scanner scanner = new Scanner(System.in);) {
            List<String> stringList = Files.readAllLines(Paths.get(scanner.nextLine()));


            for (String str:stringList
                 ) {
                str = str.replaceAll("\\.|,|\\s", "");
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

