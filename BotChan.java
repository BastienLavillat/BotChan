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
            world = WorldFactory.createEmptyWorld(World.DIMENSIONS_100x100);

            renderer = new WorldRenderer();

            world.addRenderer(renderer);

            window.add(renderer);
        }
        catch(BadDimensionsException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
    }
}