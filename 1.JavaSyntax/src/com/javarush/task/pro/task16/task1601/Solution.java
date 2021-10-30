package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(90, 2, 13);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", new Locale("ru"));
        String dateRus = simpleDateFormat.format(date);
        return dateRus;
    }
}
