package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static void main(String[] args) {
        getWinterMonths();
    }


    public static Month[] getWinterMonths(){
        Month[] winterMonths = new Month[]{DECEMBER, JANUARY, FEBRUARY};
        return winterMonths;
    }

    public static Month[] getSpringMonths(){
        Month[] springMonths = new Month[]{MARCH, APRIL, MAY};
        return  springMonths;
    }

    public static Month[] getSummerMonths() {
        Month[] summerMonths = new Month[]{JUNE, JULY, AUGUST};
        return summerMonths;
    }

    public static Month[] getAutumnMonths() {
        Month[] autumnMonths = new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
        return autumnMonths;
    }
        //напишите тут ваш код


}
