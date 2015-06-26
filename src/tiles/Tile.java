package tiles;

import game.GameWindow;
import game.InvalidParameterException;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Tile
{
	private int value;
	
	private Point location;
	
	private Shape shape;
	
	private final int width = 20;
	
	private final int height = 20;
	
	Tile(int value, Point location) throws InvalidParameterException
	{
		setValue(value);
		
		setLocation(location);
	}
	
	private void setValue(int value) throws InvalidParameterException
	{
		if (!FibonacciChecker.isFibonacci(value))
		{
			throw new InvalidParameterException(value + "is not a valid Fibonacci number.");
		}
		
		this.value = value;
	}
	
	private void setLocation(Point location) throws InvalidParameterException
	{
		GameWindow window = GameWindow.getInstance();
		
		int windowWidth = window.getWidth();
		
		int windowHeight = window.getHeight();
		
		if (location.getX() + width > windowWidth || location.getX() < 0||
				location.getY() + height > windowHeight || location.getY() < 0)
		{
			throw new InvalidParameterException(String.format("Location out of window bounds: %d(x), %d(y)", location.getX(), location.getY()));
		}
		
		this.location = location;
	}
}
