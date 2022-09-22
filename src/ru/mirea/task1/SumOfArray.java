package ru.mirea.task1;
import java.util.Scanner;
public class SumOfArray {
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
        System.out.println("Сумма элементов массива, посчитанная при помощи цикла for: "+s);
        s=0;
        i=0;
        while(i<n){
            s+=arr[i];
            i++;
        }
        System.out.println("Сумма элементов массива, посчитанная при помощи цикла while: "+s);
        s=0;
        i=0;
        do{
            s+=arr[i];
            i++;
        }while(i<n);
        System.out.println("Сумма элементов массива, посчитанная при помощи цикла do while: "+s);
    }
}
