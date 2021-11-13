package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        try(Scanner sc = new Scanner(System.in)){
            firstFileName = sc.nextLine();
            secondFileName = sc.nextLine();
        }
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
         private String filename;
         private String result="";

        @Override
        public void run() {
            try  {
                List<String> list = Files.readAllLines(Paths.get(filename));
                for (String str:list
                ) {
                    result += str + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        @Override
        public String getFileContent() {
            if (result.length() > 0){
                return result;
            }else{
                return  "";
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
