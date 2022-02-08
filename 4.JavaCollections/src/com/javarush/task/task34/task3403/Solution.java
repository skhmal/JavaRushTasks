package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/

public class Solution {
    public  static void main (String[] args){
       Solution solution = new Solution();
       solution.recurse(132);
    }

    public void recurse(int n) {
        if (n <= 1 ) return;
        for (int i = 2; i <=n ; i++) {
            if (n % i == 0){
                System.out.println(i);
                recurse(n / i);
                break;
            }
        }


//        if ((n % 2) == 0 ){
//            System.out.print(2 + " ");
//            n = n / 2;
//            recurse(n);
//        }else if ((n % 3) == 0){
//            System.out.print(3 + " ");
//            n = n / 3;
//            recurse( n);
//        }else {
//            System.out.print(n);
//        }
    }
}
