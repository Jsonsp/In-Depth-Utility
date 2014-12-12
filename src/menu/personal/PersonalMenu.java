package menu.personal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import menu.buffer.BufferPanel;

public class PersonalMenu extends JPanel
{
	public static final int Window_Width = 700;
	public static final int Window_Height = 500;
	public static final int btnLn1 = 50;
	public static final int btnLn2 = 150;
	public static final int btnLn3 = 250;
	public static final int leftRow = -75;
	public static final int rightRow = 125;
	public static final int btnWidth = 150;
	public static final int btnHeight = 50;
	private BufferPanel bufferPanel;
	private static JLabel mainTittleLbl;
	private static JLabel companyNameLbl;
	private JButton notesBtn;
	private JButton reminderBtn;
	private JButton calendarBtn;
	private JButton safariBtn;
	private JButton returnBtn;
	
	public PersonalMenu (BufferPanel bufferPanel)
	{
		super();
		this.bufferPanel = bufferPanel;
	}
	
	public void initialize ()
	{
		createComponents();
		layoutComponents();
		addListeners();
		setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void layoutComponents() 
	{	
		setLayout(null);
		setPreferredSize(new Dimension(Window_Width,Window_Height-20));//-20 to set JPanel same as JFrame

		add(mainTittleLbl);
		add(companyNameLbl);
		add(notesBtn);
        add(reminderBtn);
		add(calendarBtn);
		add(safariBtn);
		add(returnBtn);
	}
	
	public void createComponents() 
	{
		mainTittleLbl = new JLabel("Personal Menu");
		companyNameLbl = new JLabel("Created By Appended Karma Inc. 2014©");
		notesBtn = new JButton("Notes");
		reminderBtn = new JButton("Reminders");
		calendarBtn = new JButton ("Calendar");
		safariBtn = new JButton ("Safari");
		returnBtn = new JButton ("Return");
		
		createMainTittleLable();
		createBottomLabel();
		
		createNotesButton();
		createRemindersButton();
		createCalendarButton();
		createSafariButton();
		createReturnMenu ();
		mainTittleLbl.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		companyNameLbl.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void addListeners()
	{
		notesBtn.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("notesBtn");
			}
		});
		
		reminderBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("");
			}
		});
		
		calendarBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("");
			}
		});
		
		safariBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("");
			}
		});
		
		returnBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("returnBtn");
				bufferPanel.showPanel("MAIN_MENU");
			}
		});
		
	}
	
	public static void  createMainTittleLable() 
	{
		mainTittleLbl.setFont(new Font("Helvetica Neue",Font.PLAIN,30));
	    int x = (int) (Window_Height) / 2;
	    mainTittleLbl.setBounds(x, 5, 270,40);
	}

	public static void  createBottomLabel()
	{
		companyNameLbl.setFont(new Font("Helvetica Neue",Font.PLAIN,12));
	    int y = (int) (Window_Width)/2+85;
	    companyNameLbl.setBounds(480, y,225,40);
	}
	
	public void createNotesButton()
	{   
		int x = (Window_Height)/2+leftRow;;
		notesBtn.setBounds(x,btnLn1,btnWidth,btnHeight);
		notesBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createRemindersButton()
	{
		int x = (Window_Height)/2+rightRow;
		reminderBtn.setBounds(x,btnLn1,btnWidth,btnHeight);
		reminderBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createCalendarButton()
	{
		int x = (Window_Height)/2+leftRow;
	    calendarBtn.setBounds(x,btnLn2,btnWidth,btnHeight);
	    calendarBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createSafariButton()
	{
		int x = (Window_Height)/2+rightRow;
	    safariBtn.setBounds(x,btnLn2,btnWidth,btnHeight);
	    safariBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createReturnMenu ()
	{
		int x = (Window_Height)/2+25;
	    returnBtn.setBounds(x,btnLn3,btnWidth,btnHeight);
	    returnBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
}
