package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {


    //    Requirements:
//            1. В классе Solution должно быть объявлено поле intVar типа int.
//            2. В классе Solution должно быть объявлено поле doubleVar типа double.
//            3. В классе Solution должно быть объявлено поле DoubleVar типа Double.
//            4. В классе Solution должно быть объявлено поле booleanVar типа boolean.
//            5. В классе Solution должно быть объявлено поле ObjectVar типа Object.
//            6. В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
//            7. В классе Solution должно быть объявлено поле StringVar типа String.
//            8. Метод main должен выводить значения полей на экран (каждое — с новой строки или через пробел) в заданном порядке. Инициализировать переменные не нужно.

        public int intVar;
        public double doubleVar;
        public Double DoubleVar;
        public boolean booleanVar;
        public Object ObjectVar;
        public Exception ExceptionVar;
        public String StringVar;


    public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(solution.intVar + "\n" + solution.doubleVar + "\n" + solution.DoubleVar + "\n" +
              solution.booleanVar + "\n" + solution.ObjectVar + "\n" + solution.ExceptionVar + "\n" +
              solution.StringVar);
    }
}
