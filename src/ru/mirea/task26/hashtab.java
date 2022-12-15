package ru.mirea.task26;
import java.util.ArrayList;
public class hashtab {
    public ArrayList<Integer> keys = new ArrayList<Integer>();
    public ArrayList<String> values = new ArrayList<String>();
    public int hashtabHash(String a){
        return (keys.get(values.indexOf(a)));
    }
    public void hashtabInit(ArrayList<Integer>keys, ArrayList<String> values){
        this.keys.addAll(keys);
        this.values.addAll(values);
    }
    public void hashtabAdd(int key,String value){
        keys.add(key);
        values.add(value);
    }
    public String hashtabLookup (int key){
        return values.get(keys.indexOf(key));
    }
    public void hashtubDelete(int key){
        values.remove(keys.indexOf(key));
        keys.remove(keys.indexOf(key));
    }

}
