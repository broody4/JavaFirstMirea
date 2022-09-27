package ru.mirea.task2;

public class Dog {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public Dog(String name,int age ){
        this.name=name;
        this.age=age;
    }
    public int AgeToHuman(){
        return this.age*8;
    }
    public String toString(){
        String s="Dog { ";
        s+="Name = "+this.name+", Age = "+this.age+" }";
        return s;
    }

}
