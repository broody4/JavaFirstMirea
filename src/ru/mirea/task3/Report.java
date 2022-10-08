package ru.mirea.task3;
import java.util.ArrayList;
public class Report {

    public static String generateReport(ArrayList<Employee> Employees){
        String s="";
        s += String.format("%15s%15s","Full Name","Salary" );
        s+="\n";
        for (int i=0;i<Employees.size();i++) {
            s += String.format("%15s%15.2f", Employees.get(i).getFullname(),Employees.get(i).getSalary());
            s+="\n";
        }
        return s;
        }

    public static void main(String[] args){
        ArrayList<Employee> Employees=new ArrayList<Employee>();
        Employees.add(new Employee("Егор Матолыгин", 12341.123));
        Employees.add(new Employee("Joe Williams", 85237.34));
        Employees.add(new Employee("David Grant", 45367.34));

        Report rep=new Report();
        System.out.println(generateReport(Employees));
    }





    //String.format("%50s\n", sc.nextLine()
}
