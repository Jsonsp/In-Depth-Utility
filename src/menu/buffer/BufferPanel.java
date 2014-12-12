package menu.buffer;

import java.util.HashMap;
import java.util.Map;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import menu.main.MainMenu;
import menu.personal.PersonalMenu;

public class BufferPanel extends JPanel
{
	private Map<String, JPanel> mapPanels = new HashMap<String, JPanel>();
	private MainMenu mainMenu; // JPanel
	private PersonalMenu personalMenu;
	
	
	public void initialize()
	{
		createComponents();
		layoutComponents();
		setDefaults();
		mainMenu.initialize();
		personalMenu.initialize();
		setBorder(BorderFactory.createLineBorder(Color.red));
	}

	public void createComponents() 
	{
		mainMenu = new MainMenu(this);
		mapPanels.put("MAIN_MENU", mainMenu);
		
		personalMenu = new PersonalMenu(this);
		mapPanels.put("PERSONAL_MENU", personalMenu);
	}
	
	public void layoutComponents()
	{
		add(mainMenu);
		add(personalMenu);
	}

	public void setDefaults()
	{
		showPanel("MAIN_MENU");
	}

	public void showMainPanel()
	{
		showPanel("MAIN_MENU");
	}
	
	
	public void showPanel(String panelName)
	{
		for (JPanel panel : mapPanels.values())
		{
			panel.setVisible(false);
		}
		
		JPanel panelToShow = mapPanels.get(panelName);
		panelToShow.setVisible(true);
	}
	
}
