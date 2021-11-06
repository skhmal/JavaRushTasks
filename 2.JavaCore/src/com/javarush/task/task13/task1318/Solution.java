package com.javarush.task.task13.task1318;

import java.io.*;
import java.net.URLConnection;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        File file;
        try (InputStream inputStream = new FileInputStream(String.valueOf(Path.of(scanner.nextLine())));
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream))){
            while (bf.ready()){
                System.out.println(bf.readLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}