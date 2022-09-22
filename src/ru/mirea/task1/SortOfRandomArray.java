package ru.mirea.task1;
import java.util.Random;
public class SortOfRandomArray {
    public static void main(String[] args) {
        int[] arr;
        int i, t;
        arr=new int [10];
        System.out.println("До сортировки\n");
        for (i=0;i<10;i++){
            arr[i]= (int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        for(i=0;i<10;i++){
            int minposition = i;
            for (int j =i+1; j<10;j++){
                if (arr[minposition]>arr[j])
                    minposition=j;
            }
            t=arr[minposition];
            arr[minposition]= arr[i];
            arr[i]=t;
        }
        System.out.println("После сортировки\n");
        for (i=0;i<10;i++){
            System.out.println(arr[i]);
        }

        System.out.println("//////////////////////\n");
        System.out.println("До сортировки\n");
        Random rnd=new Random();
        for (i=0;i<10;i++){
            arr[i]=rnd.nextInt(100);
            System.out.println(arr[i]);
        }

        for(i=0;i<10;i++){
            int minposition = i;
            for (int j =i+1; j<10;j++){
                if (arr[minposition]>arr[j])
                    minposition=j;
            }
            t=arr[minposition];
            arr[minposition]= arr[i];
            arr[i]=t;
        }
        System.out.println("После сортировки\n");
        for (i=0;i<10;i++){
            System.out.println(arr[i]);
        }

    }
}
