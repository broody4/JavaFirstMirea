package ru.mirea.task5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Football {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
       // frame.setLayout(null);


        JPanel panel= new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize( new Dimension(500,300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        button1.setBounds(65,20,105,30);



        button2.setBounds(350,20,105,30);
        panel.setBounds(0,0,500,300);
        panel.add(button1);
        panel.add(button2);
        panel.setLayout(null);

        JLabel scoreAC=new JLabel("0");
        scoreAC.setBounds(185,20,140,30);

        JLabel scoreRM=new JLabel("0");
        scoreRM.setBounds(330,20,140,30);

        JLabel result=new JLabel("Result:"+scoreAC.getText()+" X "+scoreRM.getText());
        result.setBounds(210,70,300,30);

        JLabel Last=new JLabel("Last scorer: N/A");
        Last.setBounds(210,90,300,30);

        JLabel Winner = new JLabel("Winner: DRAW");
        Winner.setBounds(210,110,300,30);

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 scoreAC.setText(String.valueOf(Integer.parseInt(scoreAC.getText())+1));
                 result.setText("Result:"+scoreAC.getText()+" X "+scoreRM.getText());
                 Last.setText("Last scorer: AC Milan");
                 if(Integer.parseInt(scoreAC.getText())>Integer.parseInt(scoreRM.getText())){
                     Winner.setText("Winner: AC Milan");
                 } else if (Integer.parseInt(scoreAC.getText())==Integer.parseInt(scoreRM.getText())) {
                     Winner.setText("Winner: DRAW");
                 } else {Winner.setText("Winner: Real Madrid");}
            }
        });

        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                scoreRM.setText(String.valueOf(Integer.parseInt(scoreRM.getText())+1));
                result.setText("Result:"+scoreAC.getText()+" X "+scoreRM.getText());
                Last.setText("Last scorer: Real Madrid");
                if(Integer.parseInt(scoreAC.getText())>Integer.parseInt(scoreRM.getText())){
                    Winner.setText("Winner: AC Milan");
                } else if (Integer.parseInt(scoreAC.getText())==Integer.parseInt(scoreRM.getText())) {
                    Winner.setText("Winner: DRAW");
                } else {Winner.setText("Winner: Real Madrid");}
            }
        });


        panel.add(scoreAC);
        panel.add(scoreRM);
        panel.add(result);
        panel.add(Last);
        panel.add(Winner);
        scoreAC.setVisible(false);
        scoreRM.setVisible(false);
//добавили панель к фрейму
        frame.getContentPane().add(panel);
        frame.pack();
//упакуем во фрейм
        frame.setVisible(true);
    }
}
