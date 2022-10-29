package ru.mirea.task12;

import javax.swing.*;
import java.net.MalformedURLException;


public class Animation extends JFrame
{
    public static void main ( String [] args ) throws MalformedURLException {
        // frame
        JFrame frame = new Animation();
        frame.setSize ( 1000, 1000 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Remembory" );
        frame.setVisible( true );
        Gif Image = new Gif();
        JLabel l = new JLabel(Image.gif);
        l.setBounds(0,0,1000,1000);
        frame.add(l);
    }

    static class Gif extends JPanel{
        public ImageIcon gif, animatedGif;

        public Gif() throws MalformedURLException {
            gif = new ImageIcon( "/Users/egormatolygin/Desktop/mario.gif" );
        }

        public ImageIcon getGif() {
            return gif;
        }
    }
}


