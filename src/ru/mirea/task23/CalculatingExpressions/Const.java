package ru.mirea.task23.CalculatingExpressions;

public class Const implements Expression {
    private final int iVal;
    private final double dVal;

    public Const(int value) {
        iVal = value;
        dVal = value;
    }

    public Const(double value) {
        iVal = 0;
        dVal = value;
    }

    public int evaluate(int x) {
        return iVal;
    }

    public double evaluate(double x) {
        return dVal;
    }

    //public int evaluate(int x, int y, int z) {
    //  return iVal;
    //}

}