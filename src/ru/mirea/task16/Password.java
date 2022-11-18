package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Password  extends JFrame {

public Password() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container container = getContentPane();
    SpringLayout layout = new SpringLayout();
    container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    container.setLayout(layout);

    JLabel service = new JLabel("Service:");
    JTextField serviceField = new JTextField(20);
    JLabel UserName = new JLabel("User name:");
    JTextField UserNameField = new JTextField(20);
    JLabel Password = new JLabel("Password:");
    JTextField PasswordField = new JTextField(20);
    JButton Try = new JButton("Try");
    container.add(service);
    container.add(serviceField);
    container.add(UserName);
    container.add(UserNameField);
    container.add(Password);
    container.add(PasswordField);

    layout.putConstraint(SpringLayout.EAST,service,-95,SpringLayout.HORIZONTAL_CENTER,container);
    layout.putConstraint(SpringLayout.NORTH , service, 10, SpringLayout.NORTH , container);

    layout.putConstraint(SpringLayout.WEST, serviceField, 10, SpringLayout.EAST,  service);
    layout.putConstraint(SpringLayout.NORTH, serviceField,4,SpringLayout.NORTH,container);

    layout.putConstraint(SpringLayout.NORTH, UserName , 8, SpringLayout.SOUTH , service);
    layout.putConstraint(SpringLayout.EAST,UserName,-95,SpringLayout.HORIZONTAL_CENTER,container);

    layout.putConstraint(SpringLayout.NORTH , UserNameField , 4 , SpringLayout.SOUTH, service);
    layout.putConstraint(SpringLayout.WEST, UserNameField , 10, SpringLayout.EAST , UserName);

    layout.putConstraint(SpringLayout.EAST,Password,-95,SpringLayout.HORIZONTAL_CENTER,container);
    layout.putConstraint(SpringLayout.NORTH,Password , 8, SpringLayout.SOUTH , UserName);

    layout.putConstraint(SpringLayout.NORTH , PasswordField , 4 , SpringLayout.SOUTH, UserName);
    layout.putConstraint(SpringLayout.WEST, PasswordField , 10, SpringLayout.EAST , Password);




    setSize(350, 160);

    setVisible(true);
    }

    public static void main(String [] args){
    new Password();
    }
}
