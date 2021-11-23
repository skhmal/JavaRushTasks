package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1Path = scanner.nextLine();
        String file2Path = scanner.nextLine();
        List<Byte> list = new ArrayList();


        try (FileInputStream fileInputStream = new FileInputStream(file1Path); FileOutputStream fileOutputStream = new FileOutputStream(file2Path)) {
            while (fileInputStream.available() > 0){
                list.add((byte) fileInputStream.read());
            }
            Collections.reverse(list);
            for (Byte elementByte:list
                 ) {
                fileOutputStream.write(elementByte);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
