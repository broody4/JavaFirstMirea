package ru.mirea.task23.CalculatingExpressions;

public class Add extends Operation {
    public Add(SingleExpression left, SingleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left + right;
    }

    protected double evaluate(double left, double right) {
        return left + right;
    }


}