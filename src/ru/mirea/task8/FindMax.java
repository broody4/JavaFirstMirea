package ru.mirea.task8;

import java.util.Scanner;

import java.lang.Math;

public class FindMax {

    public int rec(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a==0){
            return 0;
        }
        return Math.max(a,rec());

    }
    public static void main(String []args){
        FindMax a = new FindMax();
        System.out.println(a.rec());
    }

}
