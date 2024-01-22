package org.example.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JFrame {
    List<Circle> circles = new ArrayList<>();

    public void addCircle(Circle circle) {
        circles.add(circle);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (Circle circle:
             circles) {
            g.setColor(circle.getColor());
            g.fillOval(circle.getX(), circle.getY(), 25, 25);
        }
    }
}
