package world.obstacle;

import java.awt.Point;

import javax.swing.JComponent;

import java.awt.*;

public class Wall extends JComponent
{
    private Point pos1;
    private Point pos2;

    private int thickness;

    private Color color;

    public Wall(Point pos1, Point pos2, int thickness, Color color)
    {
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        
    }
}
