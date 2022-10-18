package ru.mirea.task8;

import java.util.Scanner;

public class OneToN {
    public void rec(int n){
        if (n-1>0) {
            rec(n - 1);
        }
        System.out.println(n);
    }
    public static void main(String [] args){
        OneToN a = new OneToN();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a.rec(n);
    }
}
