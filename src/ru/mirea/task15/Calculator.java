package ru.mirea.task15;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(13);
    JTextField jta2 = new JTextField(13);
    JButton button1 = new JButton(" Add them");
    JButton button2 = new JButton(" Subtract them");
    JButton button3 = new JButton(" Multiply them");
    JButton button4 = new JButton(" Divide them");
    Font fnt = new Font("Times new roman",Font.BOLD,20); //начало конструктора класса
    Calculator() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(270, 170);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);
        // добавляем кнопку
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    if (x2==0){throw new NullPointerException("Exception in method");}
                    JOptionPane.showMessageDialog(null,
                            "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

        public static void main(String [] args){
            new Calculator();
        }
    }


