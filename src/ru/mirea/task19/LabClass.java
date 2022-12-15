package ru.mirea.task19;

import java.util.ArrayList;

class LabClass {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    LabClass() {
        studentArrayList.add(new Student("Валенский", "Ибрагим", "Петрович", 2.9F));
        studentArrayList.add(new Student("Брагин", "Александр", "Владимирович", 3.9F));
        studentArrayList.add(new Student("Борзиков", "Иван", "Кантемирович", 3.1F));
        studentArrayList.add(new Student("Мацокина", "Александра", "Ивановна", 4.9F));
        studentArrayList.add(new Student("Луковников", "Дмитрий", "Петрович", 5.0F));
        studentArrayList.add(new Student("Елькин", "Александр", "Иосифович", 1.4F));
        studentArrayList.add(new Student("Трушин", "Борис", "Викторович", 4.1F));
        studentArrayList.add(new Student("Жириновский", "Владимир", "Вольфович", 3.2F));
        studentArrayList.add(new Student("Жидков", "Павел", "Александрович", 4.4F));
        studentArrayList.add(new Student("Черных", "Александр", "Владимирович", 5.0F));

        LabClassUI labClassUI = new LabClassUI(studentArrayList);
        labClassUI.setSize(1200, 300);
        labClassUI.setVisible(true);
    }
}