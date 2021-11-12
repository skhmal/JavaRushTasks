package com.javarush.task.task15.task1522;

import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
static {
    readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try (Scanner scanner = new Scanner(System.in)){
            String str = scanner.nextLine();
            if (Planet.SUN.equals(str)){
                thePlanet = Sun.getInstance();
            }else if (Planet.MOON.equals(str)){
                thePlanet = Moon.getInstance();
            }else if (Planet.EARTH.equals(str)){
                thePlanet = Earth.getInstance();
            }else {
                thePlanet = null;
            }
        }
    }
}
