package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object object){
        if((object == null) || (!(object instanceof Iphone)) || (object == this))  return false;

        Iphone iphone = (Iphone) object;
        return (price == iphone.price) && (model.equals(iphone.model)) && (color.equals(iphone.color));
//        if ((this.model.equals(iphone.model)) && (this.color.equals(iphone.color))
//                && (this.price == iphone.price)) {return true;}
//        else {return false;}
     }

    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
