package ru.mirea.task23.CalculatingExpressions;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    //public int evaluate(int x, int y, int z) {
    //  return name.equals("x") ? x : name.equals("y") ? y : name.equals("z") ? z : 0;
    //}
    public int evaluate(int x){
        return name.equals("x") ? x : 0;
    }

}
