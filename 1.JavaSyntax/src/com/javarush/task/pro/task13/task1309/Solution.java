package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("s",3.2);
        grades.put("d", 4.2);
        grades.put("q", 2.3);
        grades.put("e", 1.4);
        grades.put("t", 2.9);
    }
}
