package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            String filename = scanner.nextLine();
            try (FileInputStream fileInputStream = new FileInputStream(filename);) {
                if (fileInputStream.available() < 1000) {
                    flag = false;
                    throw new DownloadException();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static class DownloadException extends Exception {

    }
}
