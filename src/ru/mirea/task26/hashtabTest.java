package ru.mirea.task26;

import java.util.ArrayList;

public class hashtabTest {
    public static void main(String []args){
        hashtab tab = new hashtab();
        System.out.println("используем hashtabInit");
        ArrayList<Integer> keys = new ArrayList<Integer>();
        ArrayList<String> values = new ArrayList<String>();
        keys.add(1);
        keys.add(2);
        keys.add(3);
        keys.add(4);
        values.add("hash");
        values.add("set");
        values.add("tab");
        values.add("key");
        tab.hashtabInit(keys,values);
        for (int i=0;i<4;i++){
            System.out.println(tab.keys.get(i)+" "+tab.values.get(i));
        }
        System.out.println("используем hashtabAdd");
        tab.hashtabAdd(12,"added");
        for (int i=0;i<5;i++){
            System.out.println(tab.keys.get(i)+" "+tab.values.get(i));
        }
        System.out.println("найдем хэш слова set с помощью hashtabHash");
        System.out.println(tab.hashtabHash("set"));
        System.out.println("удалим элемент с помощью hashtabDelete");
        tab.hashtubDelete(2);
        for (int i=0;i<4;i++){
            System.out.println(tab.keys.get(i)+" "+tab.values.get(i));
        }
        System.out.println("найдем слово по хэшу 3 c помощью hashtabLookup");
        System.out.println(tab.hashtabLookup(3));

    }
}
