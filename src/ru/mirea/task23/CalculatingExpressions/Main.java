package ru.mirea.task23.CalculatingExpressions;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int ans = new Add(new Multiply(new Variable("x"), new Variable("x")),
                new Subtract(new Const(1), new Multiply(new Const(2), new Variable("x")))).evaluate(x);
        System.out.println(ans);
    }
}
