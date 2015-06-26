package game;

import tiles.Tile;

public interface TileMovementHandler 
{
	public void moveLeft(Tile t);
	
	public void moveRight(Tile t);
	
	public void moveUp(Tile t);
	
	public void moveDown(Tile t);
}
