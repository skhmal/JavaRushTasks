package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        this.capacity = (int)(capacity *1.5);
        String[] newElements = new String[capacity];
        newElements = Arrays.copyOfRange(elements, 0 , newElements.length);
        this.elements = newElements;
    }

}
