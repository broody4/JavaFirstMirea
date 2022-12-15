package ru.mirea.task19;
import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;
import java.util.Objects;

public class LabClassUI extends JFrame{

        ArrayList<Student> students;
        JTextField searchingSurNameTextField = new JTextField("Фамилия");
        JTextField searchingFirstNameTextField = new JTextField("Имя");
        JTextField searchingMiddleNameTextField = new JTextField("Отчество");
        JButton searchButton = new JButton("Поиск");
        JButton sortButton = new JButton("Сортировка по баллам");
        JLabel label = new JLabel("Поиск");

        public LabClassUI(ArrayList<Student> students) {
            searchButton.setSize(50, 20);
            searchingSurNameTextField.setSize(80, 20);
            searchingFirstNameTextField.setSize(80, 20);
            searchingMiddleNameTextField.setSize(80, 20);
            this.students = students;

            DefaultListModel<String> model = new DefaultListModel<>();
            for (Student student : students) {
                model.addElement(student.toString());
            }
            JList<String> list = new JList<>(model);
            searchButton.addActionListener(e -> {

                if (Objects.equals(searchingSurNameTextField.getText(), "")
                        || Objects.equals(searchingSurNameTextField.getText(), "")
                        || Objects.equals(searchingSurNameTextField.getText(), "")) {
                    try {
                        throw new EmptyStringException("Empty field");
                    } catch (EmptyStringException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    Student nStudent = new Student(searchingSurNameTextField.getText(),
                            searchingFirstNameTextField.getText(), searchingMiddleNameTextField.getText());
                    if (students.contains(nStudent)) {
                        model.clear();
                        for (Student student : students) {
                            if (student.equals(nStudent))
                                model.addElement(student.toString());
                        }
                    } else {
                        try {
                            throw new StudentNotFoundException("Student -" + nStudent + "not found");
                        } catch (StudentNotFoundException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            sortButton.addActionListener(e -> {
                SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
                sortingStudentsByGPA.quickSort(students, 0, students.size() - 1);
                model.clear();
                for (Student student : students) {
                    model.addElement(student.toString());
                }
            });
            setLayout(new FlowLayout());
            add(label);
            add(searchingSurNameTextField);
            add(searchingFirstNameTextField);
            add(searchingMiddleNameTextField);
            add(searchButton);
            add(sortButton);
            add(list);
        }
        public static void main(String [] args){
            new LabClass();
        }
    }
