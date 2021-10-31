package world;

import exception.BadDimensionsException;

import java.awt.Dimension;

/**
 * This class allow creating worlds safely
 */

public abstract class WorldFactory
{
    public static World createEmptyWorld(Dimension dimensions) throws BadDimensionsException
    {
        if (dimensions.getWidth() < 0 || dimensions.getHeight() < 0)
        {
            throw new BadDimensionsException(dimensions);
        }

        return new World(dimensions);
    }
}
