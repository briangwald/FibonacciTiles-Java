package gamestates;

import game.Game;
import game.GameWindow;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tiles.PositionHandler;
import tiles.Tile;

public class PlayState implements GameState
{	
	private ArrayList<Tile> tiles;
		
	private PositionHandler phandler;
	
	private boolean isNewGame;
	
	private GameWindow window;
	
	public PlayState()
	{
		isNewGame = true;
		
		window = GameWindow.getInstance();
		
		phandler = PositionHandler.getInstance();
	}
	
	public void setupNewGame()
	{
		//Sets up a new game
	}
	
	public void addRandomTiles(int numTiles)
	{
		//Add numTiles tiles to the grid	
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
		window.displayPlay();
	}

	@Override
	public void handleInput() 
	{
		// TODO Auto-generated method stub

	}

}
