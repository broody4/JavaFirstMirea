package ru.mirea.task18;

public class ThrowsDemo {
    public void getDetails(String key){
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e ){
           System.out.println( e.getMessage());
        }
    }

    public static void main(String[] args){
        new ThrowsDemo().getDetails(null);
    }
}
