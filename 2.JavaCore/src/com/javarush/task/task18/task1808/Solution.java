package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1Path = scanner.nextLine();
        String file2Path = scanner.nextLine();
        String file3Path = scanner.nextLine();

        try (FileInputStream fileInputStream = new FileInputStream(file1Path); FileOutputStream fileOutputStreamFile2 = new FileOutputStream(file2Path);
        FileOutputStream fileOutputStreamFile3 = new FileOutputStream(file3Path)){
            int availableBytes = fileInputStream.available();
            int file2Length;
            int file3Length;

            if (!(availableBytes%2==0)){
                 file2Length = Math.round((fileInputStream.available()/2)+1);
                 file3Length = fileInputStream.available() - file2Length;
            }else
            {
                 file2Length = availableBytes/2;
                 file3Length = availableBytes - file2Length;
            }

            while (fileInputStream.available() > 0){
                byte [] buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                fileOutputStreamFile2.write(buffer,0,file2Length);
                fileOutputStreamFile3.write(buffer,file2Length,file3Length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
