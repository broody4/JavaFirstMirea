package ru.mirea.task3;

public class Employee {
    private String fullname;
    private Double Salary;
    public Employee(String name , double salary){
        fullname=name;
        Salary=salary;
    }

    public Double getSalary() {
        return Salary;
    }

    public String getFullname() {
        return fullname;
    }
}
