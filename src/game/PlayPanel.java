package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayPanel extends JPanel 
{
	public PlayPanel()
	{
		setLayout(new BorderLayout());
		setBackground(Color.gray);
		
		JLabel playText = new JLabel("<html><font color=#ffffdd>Playing now!</font>", JLabel.CENTER);
		
		playText.setBackground(Color.blue);
		
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
		
		this.add(playText, BorderLayout.CENTER);
		this.add(exitButton, BorderLayout.SOUTH);
		
	}
	
	
}
