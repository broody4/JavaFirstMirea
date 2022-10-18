package ru.mirea.task7.string;
import java.lang.String;
import java.util.Scanner;

public class NewString implements NString{

    @Override
    public int length(String s) {
        return s.length();
    }

    @Override
    public String Odd(String s) {
        String s1="";
        for (int i=1;i<s.length();i+=2){
            s1+=s.charAt(i);
        }
        return s1;
    }

    @Override
    public String reverse(String s) {
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }

    public static void main(String []args){
        NewString NS = new NewString();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = in.nextLine();
        System.out.println("Длина строки: "+NS.length(s));
        System.out.println("Строка из нечетных элементов: "+NS.Odd(s));
        System.out.println("Перевернутая строка: "+NS.reverse(s));

    }
}
