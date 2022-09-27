package ru.mirea.task2;
import java.util.Scanner;
public class BookTest {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        BookShell shell =new BookShell();
        System.out.println("Введите количество книг в полке: ");
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Введите автора книги: ");
            String Author=in.nextLine();
            System.out.println("Введите название книги: ");
            String title =in.nextLine();
            System.out.println("Введите год написания книги: ");
            int year=in.nextInt();
            in.nextLine();
            shell.add(Author,title,year);
        }

        shell.sort();
        for(int i=0;i<n;i++){
            System.out.println(shell.Shell.get(i).toString());
        }
    }
}
