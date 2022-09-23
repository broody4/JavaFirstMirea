package ru.mirea.task1;
import java.util.Scanner;
public class SumAndMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        int i, n,s=0;
        n=in.nextInt();
        arr=new int [n];
        for (i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for (i=0;i<n;i++){
            s+=arr[i];
        }
        double mean= (double)s/n;
        System.out.println("сумма элементов массива: "+s);
        System.out.println("среднее арифметическое элементов массива: "+mean);
    }
}
