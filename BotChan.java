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
            Dimension worldDimensions = World.DIMENSIONS_400x400;

            world = WorldFactory.createEmptyWorld(worldDimensions);

            window.setSize(worldDimensions);
            window.add(world);
        }
        catch(BadDimensionsException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
    }
}