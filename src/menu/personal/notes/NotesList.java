package menu.personal.notes;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import menu.buffer.BufferPanel;

public class NotesList extends JScrollPane
{
	public static final int Window_Width = 700;
	public static final int Window_Height = 500;
	public static final int Scroll_Pane_Window_Width = 350;
	public static final int Scroll_Pane_Window_Height = 500;
	private BufferPanel bufferPanel;
	private JScrollPane notesScrollPane;
	private JList notesList;
	List<String> notesArray = new ArrayList<String>();
	
	
	public NotesList (BufferPanel bufferPanel)
	{
		super();
		this.bufferPanel = bufferPanel;
		//setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public void initialize ()
	{
		createPanel();
		createComponents();
		layoutComponents();
		
	}
	
	public void createPanel()
	{	
		setLayout(null);
		setBackground(new Color(0,0,0,0x33));
	}
	
	public void createComponents() 
	{
		notesList = new JList();
	}
	
	public void getNotes()
	{
		notesArray.add("shoppingList");
		notesArray.add("TO Do");
	}
	
	public void layoutComponents()
	{
		
	}
	
	

	
}
