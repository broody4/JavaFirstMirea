package ru.mirea.task9;

import java.util.Scanner;

public class SortById {

    public void Sort(Comparable[] list){
        for (int left = 0; left < list.length; left++) {
            // Вытаскиваем значение элемента
            Comparable value = list[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(list[i])<0) {
                    list[i + 1] = list[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            list[i + 1] = value;
        }
    }

    public static void main(String args[]){
        System.out.println("Введите количество студентов");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student [] list = new Student[n];
        for(int i =0 ;i<n;i++){
            System.out.println("Введите ID и баллы студента");
            int id =in.nextInt();
            int gpa = in.nextInt();
            list[i] = new Student(id,gpa);
        }
        SortById S = new SortById();
        S.Sort(list);
        for(int i =0 ;i<n;i++) {
            System.out.println(list[i].iDNumber);
        }

    }

}
