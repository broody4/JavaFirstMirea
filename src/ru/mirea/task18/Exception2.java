package ru.mirea.task18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        }catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        catch (Exception e){
            System.out.println("Ошибка");
        }
    }
    public static void main(String[ ] args){
        new Exception2().exceptionDemo();
    }
}

