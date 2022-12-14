package ru.mirea.task18;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo4 {
    public void getKey() {
        while(true) {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception e ){
                System.out.println(e.getMessage()+". Try agan:");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }


    public static void main(String [] args){
        new ThrowsDemo4().getKey();
    }

}


