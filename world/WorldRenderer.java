package world;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JComponent;

public class WorldRenderer extends JComponent
{
    World world;

    // Define the position where the world's top-left corner will be placed
    Point offset;

    Color floorColor;

    public WorldRenderer()
    {
        offset = new Point(0, 0);

        floorColor = Color.LIGHT_GRAY;
    }

    public void setWorld(World world)
    {
        this.world = world;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        // Draw floor
        g.setColor(floorColor);
        g.fillRect(offset.x, offset.y, world.getWith(), world.getHeight());
        System.out.println("offset: " + offset);
        System.out.println("width: " + world.getWith());
        System.out.println("height: " + world.getHeight());
    }
}
