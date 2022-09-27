package ru.mirea.task2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private ArrayList<String>computers=new ArrayList<String>();
    public void add(String s){
        computers.add(s);
    }
    public void delete(String s){
        computers.remove(s);
    }
    public boolean search(String s ){
        for (int i=0;i<computers.size();i++){
            if (Objects.equals(s, computers.get(i))){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String s="Shop{ ";
        for (int i=0;i<computers.size()-1;i++){
        s+=computers.get(i)+", ";
        }
        s+=computers.get(computers.size()-1);
        s+=" }";
        return s;
    }
}
