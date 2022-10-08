package ru.mirea.task3;
import java.util.Random;
public class Increasing {
    public static void main(String [] args){
        Random gen =new Random();
        int []arr=new int[4];
        for (int i=0; i<4;i++){
            arr[i]=gen.nextInt(90)+10;
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        boolean f=true;
        for(int i=0;i<3;i++){
            if (arr[i]<arr[i+1]) {
                continue;
            }
            f=false;
        }
        if (f){
            System.out.println("Последовательность строго возрастающая");
        }else {System.out.println("Последовательность не строго возрастающая");}

    }
}
