package ru.mirea.task32;


import java.io.*;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {

        String filename = "data.dat";

        TableOrdersManager tableOrdersManager = new TableOrdersManager(4);
        Order tableOrder = new TableOrder();
        tableOrder.add(new Dish("Sausages", "Some description", 600));
        tableOrder.add(new Dish("Cookies", "Some description", 150));
        tableOrder.add(new Dish("Cake", "Some description", 140));
        tableOrdersManager.add(tableOrder,2);


        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
        Order internetOrder = new InternetOrder();
        internetOrder.add(new Dish("Sweets", "Some description", 600));
        internetOrder.add(new Dish("Tea", "Some description", 150));
        internetOrder.add(new Dish("Vodka", "Some description", 140));
        internetOrdersManager.add(internetOrder,
                new Customer(
                        "Alex",
                        "Dark",
                        12,
                        new Address(
                                "Moscow",
                                1,
                                "Lenina",
                                10,
                                2
                        )
                )
        );
        internetOrder = new InternetOrder();
        internetOrder.add(new Dish("Cupcake", "Some description", 100));
        internetOrder.add(new Dish("Lasagna", "Some description", 2550));
        internetOrder.add(new Dish("Krotovuha", "Some description", 3990));
        internetOrdersManager.add(internetOrder,
                new Customer(
                        "Felix",
                        "Shelberg",
                        32,
                        new Address(
                                "England",
                                2,
                                "Russian st",
                                1,
                                100
                        )
                )
        );
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(tableOrdersManager);
            out.writeObject(internetOrdersManager);
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        TableOrdersManager tableOrdersManagerFromFile = null;
        InternetOrdersManager internetOrdersManagerFromFile = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            tableOrdersManagerFromFile = (TableOrdersManager)in.readObject();
            internetOrdersManagerFromFile = (InternetOrdersManager)in.readObject();
            in.close();
        } catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        for(Order order: tableOrdersManagerFromFile.getOrders()){

            if (order != null){
                String[] menu = order.getMenu();
                for (int i = 0; i < menu.length; i++) {
                    System.out.println("\t" + menu[i]);
                }
            }
        }
        for(Order order: internetOrdersManagerFromFile.getOrders()){
            if (order != null) {
                System.out.println(order.getCustomer());
                String[] menu = order.getMenu();
                for (int i = 0; i < menu.length; i++) {
                    System.out.println("\t" + menu[i]);
                }
            }
        }
        System.out.println("Manager: " + Arrays.toString(tableOrdersManagerFromFile.getOrders()));
        System.out.println("Manager: " + Arrays.toString(internetOrdersManagerFromFile.getOrders()));
    }
}
