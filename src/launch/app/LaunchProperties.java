package launch.app;

import java.awt.Event;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class LaunchProperties 
{
	public static final String progName = "In Depth Utility";
	
	static void setBarName()
	{
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", progName); // set name on stat bar 
	}
	
	static void setAccelerators ()
	{
		JMenuItem jmi = new JMenuItem("Copy");
	    String vers = System.getProperty("os.name").toLowerCase();
	    String s = "mac";
	    
		if (s.indexOf("windows") != -1) 
	    {
	       jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
	    } 
		else if (s.indexOf("mac") != -1) 
		{
	       jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.META_MASK));
	    }	
	}
}
	
