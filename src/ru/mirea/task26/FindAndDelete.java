package ru.mirea.task26;

import java.util.ArrayList;
import java.util.Hashtable;

public class FindAndDelete {
public static void main(String [] args) {
    Hashtable<Integer, String>
            hm = new Hashtable<Integer, String>();

    // Input the values
    hm.put(1, "abc");
    hm.put(12, "cba");
    hm.put(15, "123");
    hm.put(3, "321");

    // Printing the Hashtable
    System.out.println("До удаления:");
    System.out.println(hm);
    hm.remove(1);
    System.out.println("После удаления:");
    System.out.println(hm);
    System.out.println("Элемент по ключу \"12\": "+hm.get(12));

}

}

