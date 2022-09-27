package ru.mirea.task2;
import java.util.ArrayList;
import java.util.Scanner;
public class DogKennel {
    ArrayList<Dog>Dogs=new ArrayList<Dog>();
    private void addDog(String name,int age){
        Dog dog=new Dog(name,age);
        Dogs.add(dog);
    }
    public  void addDogs(int n){
        Scanner in =new Scanner(System.in);
        System.out.println("Вводите сначала кличку,потом возраст собаки");
        String name;
        int age;
        for(int i=0;i<n;i++){
            name=in.nextLine();
            age=in.nextInt();
            in.nextLine();
            this.addDog(name,age);
        }

    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Сколько собак вы хотите добавить: ");
        int n=in.nextInt();
        DogKennel obj=new DogKennel();
        obj.addDogs(n);
        for (int i=0;i<n;i++){
            System.out.println(obj.Dogs.get(i).toString());
        }

    }
}
