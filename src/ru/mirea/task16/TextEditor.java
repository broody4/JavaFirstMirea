package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    public TextEditor(){
        String[]colors =new String[]{"Черный", "Синий","Красный"};
        String[] typefaces = new String[]{"Times New Roman","MS Sans Serif", "Courier New"};
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        SpringLayout layout = new SpringLayout();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        container.setLayout(layout);

        JComboBox<String> cbColor;
        DefaultComboBoxModel<String> cbModel;
        cbModel = new DefaultComboBoxModel<String>();
        for (String element : colors) cbModel.addElement((String) element);
        cbColor = new JComboBox<String>(cbModel);

        JComboBox<String> cbFont;
        cbModel = new DefaultComboBoxModel<String>();
        for (String element : typefaces) cbModel.addElement((String) element);
        cbFont = new JComboBox<String>(cbModel);

        JTextArea area = new JTextArea();
        area.setFont(new Font("Times New Roman",Font.TRUETYPE_FONT, 15));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        container.add(cbColor);
        container.add(cbFont);
        container.add(area);

        layout.putConstraint(SpringLayout.WEST , cbFont , 10 , SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH , cbFont, 10 , SpringLayout.NORTH, container);

        layout.putConstraint(SpringLayout.WEST, cbColor ,10 , SpringLayout.EAST , cbFont);
        layout.putConstraint(SpringLayout.NORTH , cbColor , 10 , SpringLayout.NORTH, container);

        layout.putConstraint(SpringLayout.NORTH, area, 10, SpringLayout.SOUTH, cbFont );
        layout.putConstraint(SpringLayout.EAST , area , -10 , SpringLayout.EAST , container);
        layout.putConstraint(SpringLayout.WEST , area , 10 , SpringLayout.WEST , container);
        layout.putConstraint(SpringLayout.SOUTH, area , -10 , SpringLayout.SOUTH , container);


        cbFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( cbFont.getSelectedIndex() == 0) {
                    Font f = new Font("Times New Roman",Font.TRUETYPE_FONT, 15);
                    area.setFont(f);
                }
                if (cbFont.getSelectedIndex() == 1){
                    Font f = new Font("MS Sans Serif",Font.TRUETYPE_FONT, 15);
                    area.setFont(f);
                }
                if (cbFont.getSelectedIndex() == 2){
                    Font f = new Font("Courier New",Font.TRUETYPE_FONT, 15);
                    area.setFont(f);
                }
            }
        });

        cbColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( cbColor.getSelectedIndex() == 0) {
                    area.setForeground(Color.black);
                }
                if ( cbColor.getSelectedIndex() == 1) {
                    area.setForeground(Color.blue);
                }
                if ( cbColor.getSelectedIndex() == 2) {
                    area.setForeground(Color.red);
                }
            }
        });


        setSize(500,300);
        setVisible(true);

    }

    public static void main(String[] args){
        new TextEditor();
    }

}
