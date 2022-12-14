package ru.mirea.task18;

public class ThrowsDemo2 {
    public void printMessage(String key){
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key){
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e ){
            System.out.println( e.getMessage());
            return "";
        }
        return "data for "+key;
    }
    public static void main(String[] args){
        new ThrowsDemo2().printMessage(null);
    }
}
