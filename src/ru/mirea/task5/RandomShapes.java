package ru.mirea.task5;
import ru.mirea.task4.task4_1.shape.Circle;
import ru.mirea.task4.task4_1.shape.Rectangle;
import ru.mirea.task4.task4_1.shape.Square;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class RandomShapes {
    public static void main(String[] args) {

        Random gen =new Random();
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBounds(0,0,700,700);
        frame.add(panel);
        DrawPanel paint = new DrawPanel();
        paint.draw(panel.getGraphics());
            }
        }


    class DrawPanel{
        public void draw(Graphics g){
            JColorChooser color = new JColorChooser();
            Graphics2D g2d = (Graphics2D) g;
            Random gen = new Random();
            for (int i=0;i<700;i+=175) {
                for (int j = 0; j < 500; j += 140) {
                    color.setColor(gen.nextInt(255),gen.nextInt(255),gen.nextInt(255));
                    int k = gen.nextInt(3);
                    if (k == 0) {
                        Circle obj = new Circle(gen.nextDouble(50));
                        Ellipse2D.Double circle = new Ellipse2D.Double(i, j,  obj.getRadius()*2,
                                obj.getRadius()*2);
                        g2d.setColor(color.getColor());
                        g2d.fill(circle);
                    }
                    if (k == 1) {
                        Rectangle obj = new Rectangle(gen.nextDouble(100),gen.nextDouble(100));
                        Rectangle2D.Double rectangle = new Rectangle2D.Double(i, j,  obj.getLength(),
                                 obj.getWidth());
                        g2d.setColor(color.getColor());
                        g2d.fill(rectangle);
                    }
                    if (k == 2) {
                        Square obj = new Square(gen.nextDouble(100));
                        Rectangle2D.Double square = new Rectangle2D.Double(i, j, obj.getSide(),
                                 obj.getSide());
                        g2d.setColor(color.getColor());
                        g2d.fill(square);
                    }
                }
            }
        }
    }



