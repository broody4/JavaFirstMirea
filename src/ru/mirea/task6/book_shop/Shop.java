package ru.mirea.task6.book_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements Printable {
    ArrayList<Book> shop = new ArrayList<Book>();
    @Override
    public void print() {
        for (int i=0;i< shop.size();i++){
            shop.get(i).print();
        }
    }

    public void add(String Author,String Title,int year){
       Book book =new Book(Author, Title,year);
        shop.add(book);
    }

    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        Shop shop =new Shop();
        System.out.println("Введите количество книг в магазине: ");
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
            shop.add(Author,title,year);
        }
        shop.print();


    }

}
