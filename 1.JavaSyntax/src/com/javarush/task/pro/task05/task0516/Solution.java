package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[7];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        int ch = array.length/2;
        int nch = (int) Math.ceil(array.length/2);

        if (array.length%2==0){
            Arrays.fill(array, 0,ch,valueStart);
            Arrays.fill(array,ch,array.length,valueEnd);
        }else{
            Arrays.fill(array,0,nch+1,valueStart);
            Arrays.fill(array,nch+1,array.length,valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
