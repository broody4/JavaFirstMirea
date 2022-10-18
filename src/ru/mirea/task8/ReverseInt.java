package ru.mirea.task8;

import java.util.Scanner;

public class ReverseInt {
    public static void rec(int a){
        System.out.println(a%10+" ");
        if ((int)(a/10)>0) {
            rec((int) (a / 10));
        }
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        rec(a);
    }
}
