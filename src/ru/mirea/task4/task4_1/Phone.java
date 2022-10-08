package ru.mirea.task4.task4_1;
import java.util.Scanner;
public class Phone {
    public int weight;
    String number;
    public String model;
    public Phone(String n,String m,int w)
    {
         this(n,m);
        weight=w;
    }
    public Phone(String n,String m){
        number=n;
        model=m;
    }
    public Phone(){}

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public void receiveCall(String name,String number){
        System.out.println("Звонит "+name+" с номера "+number);
    }

    public String getNumber() {
        return number;
    }

    public String sendMessage(String ...vars){
        String s="";
        for (String x :vars){
            s+=x+" ";
        }
        return s;
    }


    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите номер, модель, и вес первого телефона");
        String n= in.nextLine();
        String m=in.nextLine();
        int w = in.nextInt();
        in.nextLine();
        Phone ph1 = new Phone(n,m,w);
        System.out.println("Введите номер, модель, и вес второго телефона");
        n= in.nextLine();
        m=in.nextLine();
        w = in.nextInt();
        in.nextLine();
        Phone ph2 = new Phone(n,m,w);
        System.out.println("Введите номер, модель, и вес третьего телефона");
        n= in.nextLine();
        m=in.nextLine();
        w = in.nextInt();
        in.nextLine();
        Phone ph3 = new Phone(n,m,w);
        System.out.println("Phone №1: " +ph1.number+" "+ph1.model+" "+ph1.weight);
        System.out.println("Phone №2: " +ph2.number+" "+ph2.model+" "+ph2.weight);
        System.out.println("Phone №3: " +ph3.number+" "+ph3.model+" "+ph3.weight);
        ph1.receiveCall("Иван");
        ph2.receiveCall("Игорь");
        ph3.receiveCall("Захар");
        System.out.println("Номер первого телефона "+ph1.getNumber());
        System.out.println("Номер второго телефона "+ph2.getNumber());
        System.out.println("Номер третьего телефона "+ph3.getNumber());
        ph1.receiveCall("Ярослав","89158234523");

    }

}
