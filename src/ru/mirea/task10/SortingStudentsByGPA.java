package ru.mirea.task10;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private ArrayList<Student> array = new ArrayList<Student>();

    public void setArray(){
        System.out.println("Введите количество студентов:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0 ;i<n;i++){
            System.out.println("Введите ID студента:");
            int id =in.nextInt();
            System.out.println("Введите имя студента:");
            in.next();
            String firstName= in.nextLine();
            System.out.println("Введите фамилию студента:");
            String lastName= in.nextLine();
            System.out.println("Введите специальность студента:");
            String spec = in.nextLine();
            System.out.println("Введите на каком курсе студент:");
            int year = in.nextInt();
            System.out.println("Введите группу студента:");
            in.next();
            String group = in.nextLine();
            System.out.println("Введите средний бал студента:");
            int gpa = in.nextInt();
            array.add( new Student(id,firstName,lastName, spec,year,group,gpa));
        }
    }

    public void quickSort(int left, int right) {
        Comparator<Student> comp = new StudentComparatorByGPA().thenComparing(new StudentComparatorByID());
        if ( left >= right )
            return;

        Student tmp = array.get(left);
        array.add(left,array.get((left+right)/2));
        array.add((left+right)/2,tmp);
        int last = left;
        for ( int i = last + 1; i <= right; ++i )
            if (comp.compare(array.get(i) , array.get(left))>=0) {
                last++;
                tmp = array.get(last);
                array.add(last ,array.get(i));
                array.add(i, tmp);
            }
        tmp = array.get(left);
        array.add(left , array.get(last));
        array.add(last, tmp);
        quickSort( left, last - 1);
        quickSort(last + 1, right);
    }
    public static void mergeSort( ArrayList<Student> a,int n) {

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        ArrayList<Student>l =new ArrayList<Student>();
        ArrayList<Student> r = new ArrayList<Student>();

        for (int i = 0; i < mid; i++) {
            l.set(i,a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.set(i - mid , a.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            ArrayList<Student> a, ArrayList<Student> l,ArrayList<Student> r, int left, int right) {
        Comparator<Student> comp = new StudentComparatorByGPA().thenComparing(new StudentComparatorByID());
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comp.compare(l.get(i) , r.get(j))<=0) {
                a.set(k++, l.get(i++));
            }
            else {
                a.set(k++,  r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++ ,l.get(i++));
        }
        while (j < right) {
            a.set(k++ , r.get(j++));
        }
    }
    public void outArray(){
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i).toString());
            System.out.println("_______________________________________________");
        }
    }

    public static void main(String []args){
        SortingStudentsByGPA students = new SortingStudentsByGPA();
        students.setArray();

        students.quickSort( 0,students.array.size()-1);
        students.outArray();
    }

    

}
