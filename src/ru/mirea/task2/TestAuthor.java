package ru.mirea.task2;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args ){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name=in.nextLine();
        System.out.println("Введите email: ");
        String email=in.nextLine();
        System.out.println("Введите пол: ");
        char gender=in.next().charAt(0);
        Author obj=new Author(name,email,gender);
        System.out.println(obj.toString());
        System.out.println("Введите email на который нужно заменить: ");
        in.nextLine();
        email=in.nextLine();
        obj.setEmail(email);
        System.out.println("Author{"+" name = "+obj.getName()+
                ", email = "+obj.getEmail()+", gender = "+obj.getGender()+"}");
    }
}
