package ru.mirea.task31;

import ru.mirea.task17.Employee;
import ru.mirea.task17.EmployeeController;
import ru.mirea.task17.EmployeeView;

public class Demo_test {
    public static void main(String [] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model,view);
        controller.updateView();
        controller.setEmployeeWorkHPW(20);
        System.out.println("После изменения:");
        controller.updateView();
    }
    private static Employee retriveEmployeeFromDatabase(){
        Employee emp = new Employee();
        emp.setName("Bob");
        emp.setAge(23);
        emp.setWorkExp(3);
        emp.setWorkHPW(40);
        emp.setRisk(0);
        return emp;
    }
}
