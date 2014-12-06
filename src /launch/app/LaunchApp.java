package launch.app;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import menu.buffer.BufferPanel;
import menu.main.MainMenu;


public class LaunchApp 
{
	public static final int Window_Width = 700;
	public static final int Window_Height = 500;
	public static final String progName = "In Depth Utility";
	
	public static void main(String[] args) 
	{
		setBarName();
		
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() 
			{
				
				createAndShowGUI();
			}
		});
	}
	
	private static void createAndShowGUI()
	{	
		final BufferPanel bufferPanel = new BufferPanel();

		final JFrame frame = new JFrame(progName); 
		frame.setSize(Window_Width, Window_Height); 
		frame.setBackground(new Color(70,250,150));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		bufferPanel.initialize();
		bufferPanel.setLayout(new GridBagLayout());
	
		frame.getContentPane().add(bufferPanel);
		frame.setVisible(true);
	}
	

	private static void setBarName()
	{
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", progName); // set the name on stat bar
		
	}

}
