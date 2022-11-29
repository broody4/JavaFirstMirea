package ru.mirea.task10;

public class Student {
    private String FirstName;
    private String LastName;
    private String Specialization;
    private int year;
    private String group;
    private int iDNumber;
    private int GPA;
    public Student( int ID, String FirstName,String LastName,String Specialization,int year,String group,int GPA){
        this.group = group;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Specialization = Specialization;
        this.year =year;
        this.iDNumber = ID;
        this.GPA=GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public int getYear() {
        return year;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return LastName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
    public String toString(){
        return "Student{ iDNumber = "+this.iDNumber+", first name = "+this.FirstName+", last name = "+this.LastName+", Specialization = "
                +this.Specialization+", year = "+ this.year+", group = "+this.group+", GPA = "+this.GPA+" }";
    }
}
