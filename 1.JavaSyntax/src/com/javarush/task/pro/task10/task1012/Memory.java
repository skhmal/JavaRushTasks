package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, "object2", "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        int index =0;
        String[] arr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                arr[index] = array[i];
                index++;
                 }
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=arr[i];
        }
    }
}
