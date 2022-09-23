package ru.mirea.task1;
import java.util.Random;
import java.util.Scanner;
public class SumMinAndMax{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        int i=0, n,s=0;
        int min,max;
        n=in.nextInt();
        arr=new int [n];
        while (i<n){
            arr[i]=in.nextInt();
            i++;
        }
        min=arr[0];
        max=arr[0];
        i=0;
        do {
            s+=arr[i];

            if(arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
            i++;
        }while(i<n);

        double mean= (double)s/n;
        System.out.println("Сумма элементов массива: "+s);
        System.out.println("Среднее арифметическое элементов массива: "+mean);
        System.out.println("Максимальное число в массиве: "+max);
        System.out.println("Минимальное число в массиве: "+min);

    }
}
