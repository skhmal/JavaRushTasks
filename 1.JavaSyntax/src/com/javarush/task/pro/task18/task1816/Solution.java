package com.javarush.task.pro.task18.task1816;

import java.util.Locale;
import java.util.stream.Stream;

/* 
Преобразование данных-2
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        //напишите тут ваш код
        Stream<String> stream = strings.map(String::toUpperCase);
        return stream;
    }
}
