package tiles;

import java.awt.Point;

import game.Game;

public class PositionHandler 
{
	private Position[][] positions;
	
	private Game game = Game.getInstance();
	
	private static PositionHandler instance;
	
	private PositionHandler()
	{
		//game = Game.getInstance();
		
		int numRows = game.getNumRows();
		
		int numCols = game.getNumCols();
		
		positions = new Position[numRows][numCols];
		
		int tileSize = game.getTileSize();
		
		int innerPadding = tileSize / 3;
		
		int outerPadding = (tileSize * numRows) + ((numRows - 1) * innerPadding);
		
		int xPos = outerPadding;
		
		int yPos = xPos;
		
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numCols; col++)
			{	
				Position currentPos = new Position(xPos, yPos);
				positions[row][col] = currentPos;
				
				xPos += (tileSize + innerPadding);
			}
			yPos += (tileSize + innerPadding);
		}
	}
	
	public static PositionHandler getInstance()
	{
		if (instance == null)
		{
			instance = new PositionHandler();
		}
		return instance;
	}
}
