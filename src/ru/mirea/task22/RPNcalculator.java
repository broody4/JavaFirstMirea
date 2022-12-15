package ru.mirea.task22;
import java.awt.List;
import java.util.*;
import java.lang.*;
public class RPNcalculator{

    static String result;
    static Stack <Integer> temp = new Stack<>();
    static int countOfOperator = 0;
    static int countOfElement = 0;


    private static boolean isOperator(Character input)
    {
        return "+-/*()".indexOf(input) != -1;
    }


    private static boolean isDelimiter(Character input){
        return (" ".indexOf(input)) != -1;
    }


    public static String Computation(String inputString) throws Exception {
        String reverseString = inputString;


        for (int i = 0; i < reverseString.length(); i++) {

            if (Character.isDigit(reverseString.charAt(i))) {
                StringBuilder tempString = new StringBuilder();

                while (!isOperator(reverseString.charAt(i)) && !isDelimiter(reverseString.charAt(i))) {
                    tempString.append(reverseString.charAt(i));
                    i++;
                    if (i == reverseString.length())
                        break;
                }
                temp.push(Integer.parseInt(tempString.toString()));
                countOfElement++;
                i--;
            }


            if (isOperator(reverseString.charAt(i))) {

                if ("+-*/".indexOf(reverseString.charAt(i)) != -1) {
                    countOfOperator++;
                }
                if (countOfOperator >= countOfElement)
                    throw new Exception("Невозможно выполнить POP для пустого стека");

                int a = temp.pop();
                int b = temp.pop();

                switch (reverseString.charAt(i)) {
                    case '+' -> result = String.valueOf(b + a);
                    case '-' -> result = String.valueOf(b - a);
                    case '*' -> result = String.valueOf(b * a);
                    case '/' -> result = String.valueOf(b / a);
                }
                temp.push(Integer.parseInt(result));
            }
        }


        return result;
    }
    public static void main(String [] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String s = in.nextLine();
        System.out.println(Computation(s));
    }
}



