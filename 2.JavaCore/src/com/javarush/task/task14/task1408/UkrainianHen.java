package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription(){
        String str = super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу "
                + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        return  str;
    }
}