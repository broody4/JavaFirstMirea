package ru.mirea.task15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Countries extends JFrame {
    public String[] elements = new String[] {"Австралия","Китай","Англия","Россия"};
    private JComboBox<String> cbFirst;
    private DefaultComboBoxModel<String> cbModel;
    public Countries(){
        super("Пример JComboBox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cbModel = new DefaultComboBoxModel<String>();
        JTextArea text = new JTextArea("""
                """,33, 28);

        for (String element : elements) cbModel.addElement((String) element);
        cbFirst = new JComboBox<String>(cbModel);
        cbFirst.setSize(400,10);
        cbFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( cbFirst.getSelectedIndex() == 0) {
                    String read;
                    try {
                            Path path = Paths.get("src/ru/mirea/task15/Австралия.txt");
                            read = Files.readAllLines(path).get(0);

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    text.setText( read);
                }

                if(cbFirst.getSelectedIndex() == 1){
                    String read;
                    try {
                        Path path = Paths.get("src/ru/mirea/task15/Китай.txt");
                        read = Files.readAllLines(path).get(0);

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    text.setText( read);
                }

                if(cbFirst.getSelectedIndex() == 2){
                    String read;
                    try {
                        Path path = Paths.get("src/ru/mirea/task15/Англия.txt");
                        read = Files.readAllLines(path).get(0);

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    text.setText( read);
                }
                if(cbFirst.getSelectedIndex() == 3){
                    String read;
                    try {
                        Path path = Paths.get("src/ru/mirea/task15/Россия.txt");
                        read = Files.readAllLines(path).get(0);

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    text.setText( read);
                }


            }
        });



        JPanel contents = new JPanel();
        contents.add(cbFirst );
        text.setLineWrap(true);
        contents.add(text);
        setContentPane(contents);
        setSize(350, 600);
        setVisible(true);

    }
    public static void main(String[] args){
        new Countries();
    }

}
