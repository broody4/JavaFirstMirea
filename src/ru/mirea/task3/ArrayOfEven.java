package ru.mirea.task3;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class ArrayOfEven {
    public static void main(String[] args) throws IOException{
        Random gen=new Random();
        Scanner in = new Scanner(System.in);
        int n=0;
        while(true) {
            try {
                System.out.println("Введите число n: ");
                 n = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Некоректное значение");
                in.next();
            }
        }
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=gen.nextInt(n+1);
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                arr1.add(arr[i]);
            }
        }
        for (int i=0;i<arr1.size();i++){
            System.out.print(arr1.get(i)+" ");
        }

    }
}
