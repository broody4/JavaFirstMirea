package ru.mirea.task9;

import java.util.Scanner;

public class SortByGPA  {
    public void quickSort(Student[] source, int leftBorder, int rightBorder) {
        StudentComparator comp = new StudentComparator();
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (comp.compare( source[leftMarker], pivot)<0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (comp.compare(source[rightMarker],pivot)>0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }


    public static void main(String [] args){
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
        SortByGPA S = new SortByGPA();
        S.quickSort(list,0,n-1);
        for(int i =0 ;i<n;i++) {
            System.out.println(list[i].GPA);
        }

    }
    }
