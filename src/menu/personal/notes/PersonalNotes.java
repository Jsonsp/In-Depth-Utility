package menu.personal.notes;

import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import menu.buffer.BufferPanel;

public class PersonalNotes extends JPanel
{
	private DisplayNotes displayNotes;
	private NotesList notesList;
	private BufferPanel bufferPanel;
	public static final int Window_Width = 700;
	public static final int Window_Height = 500;
	
	
	public PersonalNotes (BufferPanel bufferPanel)
	{
		super();
		this.bufferPanel = bufferPanel;
		setBorder(BorderFactory.createLineBorder(Color.red));
	}
	
	public void initialize()
	{
		setWindowAttributes();
		createComponents();
		addComponents();
		initializePanels();
	}
	
	public void setWindowAttributes()
	{
		setPreferredSize(new Dimension(Window_Width,Window_Height-20));
	}
	
	public void createComponents()
	{
		notesList = new NotesList(bufferPanel);
	}
	
	public void addComponents()
	{
		setLayout(null);
		notesList.setBounds(0,35, 320, 500);
		add(notesList);
	}
	
	public void initializePanels()
	{
		notesList.initialize();
	}
	

	
}
