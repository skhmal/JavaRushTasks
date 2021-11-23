package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set hashSet = new HashSet();
        List list = new ArrayList();
        try (Scanner scanner = new Scanner(System.in); FileInputStream fileInputStream = new FileInputStream(scanner.nextLine())){
            while (fileInputStream.available() > 0){
                hashSet.add(fileInputStream.read());
            }
            for (Object element:hashSet
                 ) {
                list.add(element);
            }
            Collections.sort(list);
            list.forEach((s) ->System.out.print(s + " ") );
        }

    }
}
