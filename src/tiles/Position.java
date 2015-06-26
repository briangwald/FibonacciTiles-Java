package tiles;

import java.awt.Point;

public class Position 
{
	private Point location;
	
	private boolean occupied;
	
	public Position(Point location)
	{
		this.location = location;
		occupied = false;
	}
	
	public Position(int x, int y)
	{
		location = new Point(x, y);
		occupied = false;
	}
	
	public Point getLocation()
	{
		return location;
	}
	
	public boolean isOccupied()
	{
		return occupied;
	}
	
	public void setUnoccupied()
	{
		occupied = false;
	}
	
	public void setOccupied()
	{
		occupied = true;
	}
}
