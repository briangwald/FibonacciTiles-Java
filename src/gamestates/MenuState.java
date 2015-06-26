package gamestates;

import game.GameWindow;

public class MenuState implements GameState 
{	
	private GameWindow window;
	
	private boolean started;
	
	public MenuState()
	{
		window = GameWindow.getInstance();
		
		started = false;
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		window.displayMenu();

	}

	@Override
	public void handleInput() 
	{
		// TODO Auto-generated method stub

	}

}
