package ru.mirea.task6.computer_shop;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ComputerShop implements Report{
    ArrayList<Computer> computers = new ArrayList<Computer>();
    public void add(Computer computer){
        computers.add(computer);
    }
    public boolean search(String s ){
        for (Computer computer : computers) {
            if (Objects.equals(s, computer.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void print(){
        for(Computer comp:computers){
            comp.print();
            System.out.println();
        }
    }
    public void delete(String computer){
        computers.removeIf(i -> Objects.equals(i.name, computer));
    }



    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Computer Computer1=new Computer("computer 1",500,Models.Samsung,"1920x1080",
                144,Models.Samsung,Models.Intel, 3600,4, Models.Nvidia );
        Computer Computer2=new Computer("computer 2",2000,Models.Samsung,"3840×2160",
                144,Models.Samsung,Models.Intel, 5000,16, Models.Nvidia );
        ComputerShop shop = new ComputerShop();
        shop.add(Computer1);
        shop.add(Computer2);
        shop.print();
        System.out.println("Введите название компьютера, который нужно удалить: ");
        String s = in.nextLine();
        shop.delete(s);
        System.out.println("Введите название компьютера, который нужно найти: ");
        s = in.nextLine();
        if (shop.search(s)) {
            System.out.println("такой есть");
        }else System.out.println("такого нет");


    }
}
