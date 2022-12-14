package ru.mirea.task20;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class MinMax<T extends Number>  {
    public T[] arr;

    public MinMax(T[] a) {
        arr = a;
    }


    public T min() {
        T min = arr[0];

        for (int i=1;i<arr.length;i++) {
            if ((Double)arr[i]<(Double)min){
                min = arr[i];
            }

        }
        return min;

    }
    public T max() {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((Double) arr[i] > (Double) max) {
                max = arr[i];
            }
        }
        return max;
    }
public static void main(String [] args) {
    System.out.println("Введите количество элементов в массиве:");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.nextLine();
    Double[] a = new Double[n];
    System.out.println("Вводите элементы:");
    for (int i = 0; i < n; i++) {
        a[i] = Double.parseDouble(in.nextLine());
    }
    MinMax<Double> ob = new MinMax<>(a);
    System.out.println("Минимальное число в массиве: " + ob.min());
    System.out.println("Максимальное число в массиве: " + ob.max());

}

}
