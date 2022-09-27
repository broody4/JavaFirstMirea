package ru.mirea.task2;
import java.util.Random;
import java.util.Scanner;
public class Poker {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Введите количество игроков");
        Boolean [][]deck=new Boolean[4][13];
        for(int i=0;i<4;i++)
            for(int j=0;j<13;j++)
                deck[i][j]=true;

        int n=in.nextInt();
        int i,j;
        Random generator = new Random();
        for (int k=0;k<n;k++) {
            for (int c = 0; c < 5; c++) {
                do {
                    i = generator.nextInt(4);
                    j = generator.nextInt(13);

                } while (!deck[i][j]);
                deck[i][j]=false;
                if (j==9){System.out.print("J ");}
                else if(j==10){System.out.print("Q ");}
                else if(j==11){System.out.print("K ");}
                else if(j==12){System.out.print("T ");}
                else {System.out.print((j+2)+" ");}
                if (i==0){System.out.print("буби");}
                if (i==1){System.out.print("крести");}
                if (i==2){System.out.print("пики");}
                if (i==3){System.out.print("черви");}
                System.out.print(", ");
                }
            System.out.println("\n");
            }
        }
    }

