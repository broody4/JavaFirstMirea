package ru.mirea.task2;
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите координаты центра и радиус первой окружности");
        int x=in.nextInt(),y= in.nextInt(),r= in.nextInt();
        Circle2 circle1=new Circle2(x,y,r);
        System.out.println("Введите координаты центра и радиус второй окружности");
        x=in.nextInt();
        y=in.nextInt();
        r=in.nextInt();
        Circle2 circle2=new Circle2(x,y,r);
        if(circle1.equal(circle2)){
            System.out.println("Окружности равны");
        }else {System.out.println("Окружности не равны");}
        System.out.println("Длина первой окружности: "+circle1.length());
        System.out.println("Площадь первой окружности: "+circle1.square());
        System.out.println("Длина второй окружности: "+circle2.length());
        System.out.println("Площадь второй окружности: "+circle2.square());
    }
}
