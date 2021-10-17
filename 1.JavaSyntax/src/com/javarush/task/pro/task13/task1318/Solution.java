package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        int monthId = month.ordinal();
        Month result = null;
        Month[] monthInfo = Month.values();
        for (Month current: monthInfo
             ) {
            if (monthId == Month.values().length-1){
                result = Month.values()[0];
                break;
            }else {
                result = Month.values()[monthId+1];
                break;
            }
        }

        return result;
    }
}
