package game;
import gamestates.GameState;
import gamestates.MenuState;
import gamestates.PlayState;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;
import java.util.Vector;

import tiles.Tile;


public class Game 
{
	private int score;
	
	private GameState currentState;
	
	private GameState menu;
	
	private GameState play;
	
	private final int NUM_ROWS = 4;
	
	private final int NUM_COLS = 4;
	
	private final int TILE_SIZE = 30;
	
	//Singleton
	private static Game instance;
	
	private Game() 
	{ 
		menu = new MenuState();
		
		play = new PlayState();
		
		currentState = menu;
	}
	
	public static Game getInstance()
	{
		if (instance == null)
		{
			instance = new Game();
		}
		return instance;
	}
	
	public void runCurrentState()
	{	
		currentState.run();
	}
	
	public void changeState(GameState state)
	{
		currentState = state;
		state.run();
	}
	
	public int getNumRows()
	{
		return NUM_ROWS;
	}
	
	public int getNumCols()
	{
		return NUM_COLS;
	}
	
	public int getTileSize()
	{
		return TILE_SIZE;
	}
	
	public void setPlay()
	{
		changeState(play);
	}
	
	public void exit()
	{
		System.exit(0);
	}
	
	public static void main(String[] args)
	{	
		Game theGame = getInstance();
		
		theGame.runCurrentState();
	}
	
	
}
