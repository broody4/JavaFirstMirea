package ru.mirea.task23.CalculatingExpressions;

public abstract class Operation implements Expression {
    private final SingleExpression left;
    private final SingleExpression right;

    public Operation(SingleExpression left, SingleExpression right) {
        this.left = left;
        this.right = right;
    }

    protected abstract int evaluate(int left, int right);


    //public int evaluate(int x, int y, int z) {
    //    return evaluate(left.evaluate(x, y, z), right.evaluate(x, y, z));
    //}
    public int evaluate(int x){
        return evaluate(left.evaluate(x), right.evaluate(x));
    }

}
