package world.obstacle;

import java.awt.Point;
import java.awt.Color;

public class Wall
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
}
