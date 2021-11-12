import java.awt.Dimension;

import exception.BadDimensionsException;
import world.World;
import world.WorldFactory;
import world.WorldRenderer;

class BotChan
{
    public static void main(String[] args)
    {
        World world;
        WorldRenderer renderer;

        try
        {
            renderer = new WorldRenderer(1);
            
            // Create a new world
            Dimension worldDimensions = World.DIMENSIONS_400x400;

            world = WorldFactory.createEmptyWorld(worldDimensions);
            world.addRenderer(renderer);
        }
        catch(BadDimensionsException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
    }
}