package ru.mirea.task4.task4_1;
import java.util.Scanner;
public class Matrix {
    private double[][] a;
    private int X,Y;
    public void Sum(Matrix b){
        for (int i=0;i<this.X;i++)
            for(int j=0;j<this.Y;j++)
                this.a[i][j]+=b.a[i][j];

    }

    public void MultByNumber(double q){
        for (int i=0;i<this.X;i++)
            for(int j=0;j<this.Y;j++)
                this.a[i][j]*=q;

    }
    public String Print(){
        String s="";
        for (int i=0;i<this.X;i++) {
            for (int j = 0; j < this.Y; j++) {
                s += this.a[i][j] ;
                for (int k=0;k<7-String.valueOf(this.a[i][j]).length();k++){
                    s+=" ";
                }
            }
            s+="\n";
        }
        return s;
    }

    public Matrix(double[][] d){
        X=d.length;
        Y=d[0].length;
        a=d;
    }

    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размеры матрицы");
        int n=in.nextInt();
        int m=in.nextInt();
        double[][] d=new double[n][m];
        System.out.println("Введите матрицу:");
        for (int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                d[i][j]=in.nextDouble();
        Matrix M=new Matrix(d);
        System.out.println(M.X+" "+ M.Y+" "+"\n\n"+M.Print());

    }


}
