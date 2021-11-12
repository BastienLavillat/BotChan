package world;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class WorldRenderer extends TimerTask
{
    private Timer scheduler;
    
    private StdDrawInstantiable gfx;

    private World world;

    // Not implemented yet
    public static RenderingProperties randeringProperties;

    private int fps;

    // Define the position where the world's top-left corner will be placed
    private Point offset;

    public WorldRenderer(int fps)
    {
        offset = new Point(20, 0);

        scheduler = new Timer();
        setFrameRate(fps);
    }

    public void setWorld(World world)
    {
        this.world = world;

        gfx = new StdDrawInstantiable();
        gfx.setCanvasSize(world.getWith(), world.getHeight());
        gfx.setXscale(0, world.getWith());
        gfx.setYscale(0, world.getHeight());
        gfx.enableDoubleBuffering();

        setFrameRate(fps);

        randeringProperties = new RenderingProperties();
    }

    public void setFrameRate(int fps) throws IllegalArgumentException
    {
        if (fps > 1000)
        {
            throw new IllegalArgumentException("can't have more than 1000 fps");
        }

        this.fps = fps;

        if (world != null)
        {
            scheduler.schedule(this, 0, 1000/fps);
        }
    }

    public int getFps()
    {
        return fps;
    }

    @Override
    public void run()
    {
        gfx.clear();

        gfx.show();
    }
}
