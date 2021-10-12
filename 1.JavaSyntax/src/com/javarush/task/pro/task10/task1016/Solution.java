package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код

        String name = city.getName();
        int t = city.getTemperature();
        System.out.println("В городе " + name +" сегодня температура воздуха " + t);

    }

    public static void main(String[] args) {
        //напишите тут ваш код
        City city = new City("Dubai",40);
        showWeather(city);
    }
}
