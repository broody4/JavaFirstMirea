package ru.mirea.task20;

import java.io.Serializable;

public class ThreeGen<T extends Comparable,V extends Serializable,K > {
    T ob1;
    V ob2;
    K ob3;

    public ThreeGen(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    public T getOb1() {
        return ob1;
    }
    public V getOb2() {
        return ob2;
    }
    public K getOb3() {
        return ob3;
    }

    public void showTypes(){
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
        System.out.println("Тип K: " + ob3.getClass().getName());
    }
    public static void main(String [] args){
        String s= "строка";
        Integer a = 12;
        Double d = 13.3;
        ThreeGen<String , Integer, Double> gen = new ThreeGen<>(s,a,d);
        gen.showTypes();

    }


}
