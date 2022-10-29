package ru.mirea.task12;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class OpenPicture extends JFrame
{
    public static void main ( String [] args ) throws IOException {
        String path = args[0];
        JFrame frame = new OpenPicture();
        frame.setSize ( 1000, 1000 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Open picture" );
        frame.setVisible( true );
        paneel image = new paneel(path);
        image.paintComponent(frame.getGraphics());
    }

    static class paneel extends JPanel{
        private ImageIcon image;

        public paneel(String path) throws IOException {
            image=new ImageIcon(path);
        }

        public void paintComponent( Graphics g ){
            super.paintComponent( g );

            image.paintIcon( this, g, 0, 0);
        }

    }
}