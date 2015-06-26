package game;

import gamestates.GameState;
import gamestates.MenuState;
import gamestates.PlayState;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameWindow extends JPanel
{
	private static final GameWindow instance = new GameWindow();
	
	private JFrame frame;
	
	private JPanel statePanels;
	
	private CardLayout layout;
	
	private JPanel menuPanel;
	
	private JPanel playPanel;
	
	private final int width = 400;
	
	private final int height = 400;
	
	private JButton playButton;
	
	private GameWindow()
	{
		frame = new JFrame("Fibonacci tiles");
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		layout = new CardLayout();
		
		statePanels = new JPanel(layout);
		
		menuPanel = new MenuPanel();
		statePanels.add(menuPanel, "menu");
		
		playPanel = new PlayPanel();
		statePanels.add(playPanel, "play");
		
		frame.getContentPane().add(statePanels);
		
		frame.setVisible(true);
	}
	
	public static GameWindow getInstance()
	{
		return instance;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	
	public void displayMenu()
	{
		layout.show(statePanels, "menu");
	}
	
	public void displayPlay()
	{
		layout.show(statePanels, "play");
	}
	
	public void displayExit()
	{
		
	}
}
