package ru.mirea.task31;

import ru.mirea.task17.Employee;
import ru.mirea.task17.EmployeeView;

public class EmployeeController_test {
    private Employee model;
    private EmployeeView view;
    public EmployeeController_test(Employee employee, EmployeeView employeeView){
        this.model=employee;
        this.view=employeeView;
    }
    public int getEmployeeRisk() {
        return model.getRisk();
    }

    public int getEmployeeWorkHPW() {
        return model.getWorkHPW();
    }

    public int getEmployeeWorkExp() {
        return model.getWorkExp();
    }

    public void setEmployeeRisk(int Risk) {
        model.setRisk(Risk);
    }

    public void setEmployeeWorkHPW(int WorkHPW) {
        model.setWorkHPW(WorkHPW);
    }

    public void setEmployeeWorkExp(int WorkExp) {
        model.setWorkExp(WorkExp);
    }

    public int getEmployeeAge() {
        return model.getAge();
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeAge(int age) {
        model.setAge(age);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public int getEmployeeSalary(){
        return model.getSalary();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getAge(),model.getWorkExp(), model.getWorkHPW(),
                model.getRisk(),model.getSalary());
    }



}
