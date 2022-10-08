package ru.mirea.task3;
import ru.mirea.task2.Book;
import ru.mirea.task2.Circle;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Tester2 {
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

    public Circle max(){
        double max=Circles.get(0).getRadius();
        int maxi=0;
        for(int i=1;i<n;i++){
            if (Circles.get(i).getRadius()>max){
                max=Circles.get(i).getRadius();
                maxi=i;
            } 
        }
        return Circles.get(maxi);
    }

    public Circle min(){
        double min=Circles.get(0).getRadius();
        int mini=0;
        for(int i=1;i<n;i++){
            if (Circles.get(i).getRadius()>min){
                min=Circles.get(i).getRadius();
                min=i;
            }
        }
        return Circles.get(mini);
    }

    public void Sort(){
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (Circles.get(j).getRadius() > Circles.get(j+1).getRadius()) {
                    // swap arr[j+1] and arr[j]
                    Circle temp = Circles.get(j);
                    Circles.set(j,Circles.get(j+1));
                    Circles.set(j+1,temp);
                }
    }


    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        Tester2 test =new Tester2();
        Random gen=new Random();

        test.SetCircle(gen.nextDouble()*100, gen.nextDouble()*100, gen.nextDouble()*100);
        test.SetCircle(gen.nextDouble()*100, gen.nextDouble()*100, gen.nextDouble()*100);
        test.SetCircle(gen.nextDouble()*100, gen.nextDouble()*100, gen.nextDouble()*100);
        test.SetCircle(gen.nextDouble()*100, gen.nextDouble()*100, gen.nextDouble()*100);
        test.SetCircle(gen.nextDouble()*100, gen.nextDouble()*100, gen.nextDouble()*100);
        System.out.println(test.toString());
        test.Sort();
        System.out.println(test.toString());
    }
}
