package ru.mirea.task2;
import java.util.Scanner;
public class HowMany {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s =in.nextLine();
        s=s.strip();
        int i=0,c=0;
        while( i <=s.length()-1) {
            char ch = s.charAt(i);

            while ((int) ch != 32) {
                if(i!=s.length()-1) {
                    i++;
                    ch = s.charAt(i);
                } else{
                    i++;
                    break;
                }
            }
            c+=1;

            while ((int) ch == 32) {
                i++;
                ch=s.charAt(i);

            }


        }
        System.out.println(c);

    }
}



