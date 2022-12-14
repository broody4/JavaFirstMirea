package ru.mirea.task21;

import java.util.LinkedList;
import java.util.List;

public class AnyArrToList {

    public void toList(String [] a) {


        List<String> list = new LinkedList();

        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String [] args) {

     new AnyArrToList().toList(new String[]{"1", "2", "3","4","5"});
    }
    }



