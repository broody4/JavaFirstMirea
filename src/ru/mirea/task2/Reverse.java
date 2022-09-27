package ru.mirea.task2;
import java.util.Scanner;
public class Reverse {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Сколько элементов в массиве");
        int n= in.nextInt();
        String [] arr=new String[n];
        in.nextLine();
        for (int i=0;i<n;i++){
            arr[i]=in.nextLine();
        }
        for (int i=0;i<(int)arr.length/2;i++){
            String t;
            t=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=t;
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
