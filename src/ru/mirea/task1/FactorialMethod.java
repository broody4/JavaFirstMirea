package ru.mirea.task1;
import java.util.Scanner;
public class FactorialMethod {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        FactorialMethod obj;
        obj=new FactorialMethod();
        System.out.println("Факториал равен: "+ obj.factorial(a));
    }
    public int factorial(int a){
        int p=1;
        while (a>0){
            p*=a;
            a-=1;
        }
        return p;
    }

}
