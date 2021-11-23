package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allLinesPath = scanner.nextLine();
        String forRemoveLinesPath = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(allLinesPath));
             BufferedReader bufferedReaderforRemove = new BufferedReader(new FileReader(forRemoveLinesPath))){
            while (bufferedReader.ready()){
                allLines.add(bufferedReader.readLine());
            }
            while (bufferedReaderforRemove.ready()){
                forRemoveLines.add(bufferedReaderforRemove.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        int counter = 0;
        for (String allLinesString: allLines
        ) {
            for (String forRemoveLinesString: forRemoveLines
            ) {
                if (allLinesString.equals(forRemoveLinesString)){
                    counter++;
                }
            }
        }

        if (counter == forRemoveLines.size()){
            for (String string: forRemoveLines
                 ) {
                allLines.remove(string);
            }
            }else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
