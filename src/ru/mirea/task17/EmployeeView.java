package ru.mirea.task17;

public class EmployeeView {
    public void printEmployeeDetails(String Name,int Age ,int WorkExp,int WorkHPW,int Risk,int Salary){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Work experience: "+WorkExp);
        System.out.println("Hours of work per week: "+WorkHPW);
        System.out.println("Risk: "+Risk+"out of 10");
        System.out.println("Salary: "+ Salary);
    }
}
