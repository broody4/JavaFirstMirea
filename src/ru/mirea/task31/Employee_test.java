package ru.mirea.task31;

public class Employee_test {
    private int WorkExp;
    private int WorkHPW;
    private int Risk;
    private String Name;
    private int Age;

    public int getRisk() {
        return Risk;
    }

    public int getWorkHPW() {
        return WorkHPW;
    }

    public int getWorkExp() {
        return WorkExp;
    }

    public void setRisk(int Risk) {
        this.Risk = Risk;
    }

    public void setWorkHPW(int WorkHPW) {
        this.WorkHPW = WorkHPW;
    }

    public void setWorkExp(int WorkExp) {
        this.WorkExp = WorkExp;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }
    public int getSalary(){
        return WorkExp*30000+WorkHPW*800+Risk*5000;
    }
}
