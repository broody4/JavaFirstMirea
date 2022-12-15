package ru.mirea.task19;
import java.util.ArrayList;
import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o2.getScore(), o1.getScore());
    }

    public void quickSort(ArrayList<Student> students, int low, int high) {
        if (students.size() == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opora = students.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (compare(students.get(i), opora) > 0) {
                i++;
            }

            while (compare(students.get(j), opora) < 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }
}
