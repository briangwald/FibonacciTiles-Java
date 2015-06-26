package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuPanel extends JPanel 
{	
	public MenuPanel()
	{
		setLayout(new BorderLayout());
		setBackground(Color.darkGray);
		
		JLabel menuText = new JLabel("<html><font color=#ffffdd>Fibonacci Tiles</font>", JLabel.CENTER);
		this.add(menuText, BorderLayout.CENTER);
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new 
				ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Game.getInstance().setPlay();
					}
				});
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new
				ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Game.getInstance().exit();
					}
				}
				);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.darkGray);
		buttonPanel.add(playButton);
		buttonPanel.add(exitButton);
		this.add(buttonPanel, BorderLayout.SOUTH);
		
	}
}
