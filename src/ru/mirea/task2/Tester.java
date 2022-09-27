package ru.mirea.task2;
import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
    private ArrayList<Circle> Circles = new ArrayList<Circle>();
    private int n;
    public void SetCircle(double x,double y,double r){
        Circle c =new Circle(x,y,r);
        Circles.add(c);
        n+=1;
    }
    public String toString(){
        String s="";
        for (int i=0;i<n;i++){
            s=s+"Circle "+(i+1)+"{x = "+ Circles.get(i).getX()+", y = "+Circles.get(i).getY()+
                    ", R = "+Circles.get(i).getRadius()+"}\n";
        }
        return s;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        Tester test =new Tester();
        System.out.println("Введите координату x, координату y и радиус окружности");
        double x=in.nextDouble();
        double y=in.nextDouble();
        double r=in.nextDouble();
        test.SetCircle(x,y,r);
        System.out.println("Введите координату x, координату y и радиус второй окружности");
        x=in.nextDouble();
        y=in.nextDouble();
        r=in.nextDouble();
        test.SetCircle(x,y,r);
        System.out.println("Введите координату x, координату y и радиус третьей окружности");
        x=in.nextDouble();
        y=in.nextDouble();
        r=in.nextDouble();
        test.SetCircle(x,y,r);
        System.out.println(test.toString());
    }
}
