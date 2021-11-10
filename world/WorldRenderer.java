package world;

import java.awt.*;

import world.object.WorldObject;

public class WorldRenderer extends StdDrawInstantiable
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
}
