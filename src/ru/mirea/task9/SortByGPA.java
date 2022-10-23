package ru.mirea.task9;

import java.util.Scanner;

public class SortByGPA  {
    public void quickSort(Student[] array, int left, int right) {
        StudentComparator comp = new StudentComparator();
        if ( left >= right )
            return;

        Student tmp = array[left];
        array[left] = array[(left+right)/2];
        array[(left+right)/2] = tmp;
        int last = left;
        for ( int i = last + 1; i <= right; ++i )
            if (comp.compare(array[i] , array[left] )>=0) {
                last++;
                tmp = array[last];
                array[last] = array[i];
                array[i] = tmp;
            }
        tmp = array[left];
        array[left] = array[last];
        array[last] = tmp;
        quickSort(array, left, last - 1);
        quickSort(array, last + 1, right);
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
