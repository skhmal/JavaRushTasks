package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int count = 0;
        try (Scanner scanner = new Scanner(System.in); ){
            List <String> stringList = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String string:stringList
                 ) {
                if (count%2==0){
                    System.out.println(string);
                }
                count= count + 1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

