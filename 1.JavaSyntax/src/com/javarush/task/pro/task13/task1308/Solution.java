package com.javarush.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        Integer minimum = Collections.min(list);
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = Collections.max(list);
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        Integer frequency = Collections.frequency(list, element);
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        Collections.sort(list);
        Integer index = Collections.binarySearch(list, key);
        return index;
    }
}
