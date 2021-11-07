package world;

import java.awt.*;

import javax.swing.JComponent;

import world.object.WorldObject;

public class WorldRenderer extends JComponent
{
    private World world;

    public static RenderingProperties randeringProperties;

    // Define the position where the world's top-left corner will be placed
    private Point offset;

    private Color floorColor;

    public WorldRenderer()
    {
        offset = new Point(0, 0);

        floorColor = Color.LIGHT_GRAY;
    }

    public void setWorld(World world)
    {
        this.world = world;

        randeringProperties = new RenderingProperties();
    }

    @Override
    public void paint(Graphics g)
    {
        // Draw floor
        g.setColor(floorColor);
        g.fillRect(offset.x, offset.y, world.getWith(), world.getHeight());

        // draw all objects contains in the world
        for (WorldObject o : world.getObjects())
        {
            o.render(g);
        }
    }
}
