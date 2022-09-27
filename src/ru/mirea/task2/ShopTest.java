package ru.mirea.task2;
import java.util.Scanner;
public class ShopTest {
    public static void main(String[] args){
        Shop shop=new Shop();
        System.out.println("Введите количество компьютеров, которое вы хотите добавить: ");
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        System.out.println("Введите названия компьютеров: ");
        String s="";
        in.nextLine();
        for(int i=0;i<n;i++){
            s=in.nextLine();
            shop.add(s);
        }
        System.out.println("Введите название компьютера, который нужно убрать: ");
        s=in.nextLine();
        shop.delete(s);
        System.out.println(shop.toString());
        System.out.println("Введите название компьютера, который нужно найти: ");
        s=in.nextLine();
        if (shop.search(s)) {
            System.out.println("такой есть");
        }else System.out.println("такого нет");
    }
}
