import java.awt.Dimension;

import exception.BadDimensionsException;
import world.World;
import world.WorldFactory;
import world.WorldRenderer;

class BotChan
{
    private static Window window = new Window();

    public static void main(String[] args)
    {
        World world;
        WorldRenderer renderer;

        try
        {
            // Create a new world
            renderer = new WorldRenderer();

            Dimension worldDimensions = World.DIMENSIONS_400x400;

            world = WorldFactory.createEmptyWorld(worldDimensions);
            world.addRenderer(renderer);

            window.setSize(worldDimensions);
            window.add(renderer);
        }
        catch(BadDimensionsException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
    }
}