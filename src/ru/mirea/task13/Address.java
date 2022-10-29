package ru.mirea.task13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;
    public Address(String address,boolean tokenizer){
        if(tokenizer) {
            StringTokenizer st = new StringTokenizer(address, ",.;", false);
            this.country = st.nextToken().strip();
            this.region = st.nextToken().strip();
            this.city = st.nextToken().strip();
            this.street = st.nextToken().strip();
            this.house = st.nextToken().strip();
            this.building = st.nextToken().strip();
            this.apartment = st.nextToken().strip();
        }else{
            String[] arr= address.split(",");
            this.country = arr[0].strip();
            this.region = arr[1].strip();
            this.city = arr[2].strip();
            this.street = arr[3].strip();
            this.house = arr[4].strip();
            this.building = arr[5].strip();
            this.apartment = arr[6].strip();
        }
    }
    public String toString(){
        return "Address{ country = "+this.country+ ", region = "+this.region+", city = "+this.city+
                ", street = "+this.street+", house = "+this.house+", building = "+ this.building+
                ", apartment = " +this.apartment+" }";
    }
    public static void main(String [] args){
        Address a1 = new Address("Russia, Moscow region; Moscow. Vernadsky Avenue, 78, 1, 102",true);
        System.out.println(a1.toString());
        Address a2 = new Address("Russia, Moscow region, Moscow, Vernadsky Avenue, 78, 1, 102",false);
        System.out.println(a2.toString());
        Address a3 = new Address("Russia, Moscow region, Moscow, Vernadsky Avenue, 86, 1, 401",false);
        System.out.println(a3.toString());
        Address a4 = new Address("Russia; Moscow region. Moscow; Vernadsky Avenue, 86, 1. 401",true);
        System.out.println(a3.toString());
    }
}
