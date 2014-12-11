package menu.buffer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import menu.main.MainMenu;
import menu.personal.PersonalMenu;

public class BufferPanel extends JPanel
{
	private MainMenu mainMenu; // JPanel
	
	public void initialize()
	{
		//setLayout(new BorderLayout());
		createComponents();
		layoutComponents();
		setDefaults();
		mainMenu.initialize();
		
		setBorder(BorderFactory.createLineBorder(Color.red));
	}

	public void createComponents() 
	{
		mainMenu = new MainMenu(this);		
	}
	
	public void layoutComponents()
	{
		add(mainMenu);
	}

	public void setDefaults()
	{
		showMainPanel();
	}

	public void showMainPanel()
	{
		mainMenu.setVisible(true);
	}
	
}
