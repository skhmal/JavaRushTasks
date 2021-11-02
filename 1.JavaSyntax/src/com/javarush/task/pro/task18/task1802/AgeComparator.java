package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {
    //напишите тут ваш код

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()-o2.getAge() > 0){
            return -1;
        }else if (o1.getAge()-o2.getAge() < 0){
            return 1;
        }else {
            return 0;
        }
    }
}
