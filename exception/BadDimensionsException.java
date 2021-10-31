package exception;

import java.awt.Dimension;

public class BadDimensionsException extends Exception
{
    private Dimension dimensions;

    public BadDimensionsException(Dimension dimensions)
    {
        this.dimensions = dimensions;
    }

    public Dimension getDimensions()
    {
        return dimensions;
    }
}
