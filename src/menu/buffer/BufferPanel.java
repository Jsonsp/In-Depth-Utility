package menu.buffer;

import java.util.HashMap;
import java.util.Map;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import menu.main.MainMenu;
import menu.personal.PersonalMenu;
import menu.personal.notes.PersonalNotes;

public class BufferPanel extends JPanel
{
	private Map<String, JPanel> mapPanels = new HashMap<String, JPanel>();
	private MainMenu mainMenu; // JPanel
	private PersonalMenu personalMenu;
	private PersonalNotes personalNotes;
	
	public void initialize()
	{
		createComponents();
		addComponents();
		setDefaults();
		initializePanels();
		setBorder(BorderFactory.createLineBorder(Color.red));
	}
	
	public void initializePanels()
	{
		mainMenu.initialize();
		personalMenu.initialize();
		personalNotes.initialize();
	}

	public void createComponents() 
	{
		mainMenu = new MainMenu(this);
		mapPanels.put("MAIN_MENU", mainMenu);
		// Components for personal Menu
		personalMenu = new PersonalMenu(this);
		mapPanels.put("PERSONAL_MENU", personalMenu);
		
		personalNotes = new PersonalNotes(this);
		mapPanels.put("PERSONAL_NOTES", personalNotes);
		
		// Components for ...
	}

	public void addComponents()
	{
		add(mainMenu);
		// frames for and in personal menu
		add(personalMenu);
		add(personalNotes);
	}

	public void setDefaults()
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
