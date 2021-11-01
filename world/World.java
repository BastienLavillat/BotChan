package world;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.awt.Dimension;

/**
 * Class World represent the environnement in which our Bots evolve.
 * 
 * IMPORTANT : We musn't create a world directly, using WorldFactory is much more secure.
 */

public class World
{
    // standart world dimensions
    public static final Dimension DIMENSIONS_0x0 = new Dimension(0, 0);
    public static final Dimension DIMENSIONS_400x400 = new Dimension(400, 400);


    private final Dimension dimensions;

    private final Instant birth;

    private List<WorldRenderer> renderers;

    public World(Dimension dimensions)
    {
        this.dimensions = dimensions;

        birth = Instant.now();

        renderers = new ArrayList<>();
    }

    public World(int width, int height)
    {
        this(new Dimension(width, height));
    }

    public void addRenderer(WorldRenderer renderer)
    {
        renderers.add(renderer);
        renderer.setWorld(this);
    }

    public Duration getAge()
    {
        Duration age = Duration.between(birth, Instant.now());
        return age;
    }

    public Dimension getDimensions()
    {
        return dimensions;
    }

    public int getWith()
    {
        return (int) dimensions.getWidth();
    }

    public int getHeight()
    {
        return (int) dimensions.getHeight();
    }
}
