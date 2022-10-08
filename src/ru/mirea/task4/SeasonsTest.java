package ru.mirea.task4;

public class SeasonsTest {
    public static void main(String [] args){
        seasons op;
        op=seasons.Spring;
        System.out.println(op.AvgTemp);
        System.out.println(op.getDescription());
    }

}
enum seasons{
    Winter(-5.4),
    Spring(5.8),
    Summer(20.7),
    Autumn(6.4);
    public Double AvgTemp;
    public static String favoriteSeason(seasons op){
        switch (op){
            case Autumn ->{ return("Я люблю осень");}
            case Winter -> {return("Я люблю зиму");}
            case Summer -> {return("Я люблю лето");}
            case Spring -> {return "Я люблю весну";}
        }

        return "Вы не ввели время года";
    }
    public  String getDescription(){
        if(this==Summer){
            return "Теплое время года";
        }
        return "Холодное время года";
    }
    seasons(Double x){
        AvgTemp=x;
    }
}