package menu.main;

import menu.buffer.BufferPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainMenu extends JPanel
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
	public static final int btnPadding = 25;
	private BufferPanel bufferPanel;
	private static JLabel mainTittleLbl;
	private static JLabel companyNameLbl;
	private JButton personalBtn; 
	private JButton schoolBtn; 
	private JButton computerBtn;
	private JButton settingsBtn; 
	private JButton aboutBtn;
	
	
	public MainMenu (BufferPanel bufferPanel)
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
	
	public void createComponents() 
	{
		mainTittleLbl = new JLabel("In Depth Utility");
		companyNameLbl = new JLabel("Created By Appended Karma Inc. 2014©");
		personalBtn = new JButton("Personal Menu");
		schoolBtn = new JButton ("School Menu");
		computerBtn = new JButton ("Computer Menu");
		settingsBtn = new JButton ("Settings Menu");
		aboutBtn = new JButton ("About IDU");
		
		createMainTittleLable();
		createBottomLabel();
		createPersonalButton();
		createSchoolButton();
		createComputerButton();
		createSettingsButton();
		createAboutMenu ();
		//mainTittleLbl.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		//companyNameLbl.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void layoutComponents() 
	{	
		setLayout(null);
		setPreferredSize(new Dimension(Window_Width,Window_Height-20));//-20 to set JPanel same as JFrame

		add(mainTittleLbl);
		add(companyNameLbl);
		add(personalBtn);
        add(schoolBtn);
		add(computerBtn);
		add(settingsBtn);
		add(aboutBtn);
	}
	
	public void addListeners()
	{
		personalBtn.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("PersonalBtn");
				bufferPanel.showPanel("PERSONAL_MENU");
			}
		});
		
		schoolBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("SchoolBtn");
			}
		});
		
		computerBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("ComputerBtn");
			}
		});
		
		settingsBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("SettignsBtn");
			}
		});
		
		aboutBtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("AboutBtn");
			}
		});
		
	}
	
	public static void  createMainTittleLable() 
	{
		mainTittleLbl.setFont(new Font("Helvetica Neue",Font.PLAIN,30));
	    int x = (int) (Window_Height) / 2;
	    mainTittleLbl.setBounds(x, 5, 200,40);
	    //mainTittleLbl.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}

	public static void  createBottomLabel()
	{
		companyNameLbl.setFont(new Font("Helvetica Neue",Font.PLAIN,12));
	    int y = (int) (Window_Width)/2+85;
	    companyNameLbl.setBounds(480, y,225,40);
	}
	public void createPersonalButton()
	{   
		int x = (Window_Height)/2+leftRow;;
		personalBtn.setBounds(x,btnLn1,btnWidth,btnHeight);
		personalBtn.setFont(new Font("Helvetica Neue",Font.PLAIN,14));
		//personalBtn.setOpaque(false);
		//personalBtn.setContentAreaFilled(false);
		//personalBtn.setBorderPainted(false);
		//personalBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createSchoolButton()
	{
		int x = (Window_Height)/2+rightRow;
		schoolBtn.setBounds(x,btnLn1,btnWidth,btnHeight);
		schoolBtn.setFont(new Font("Helvetica Neue",Font.PLAIN,14));
		//schoolBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createComputerButton()
	{
		int x = (Window_Height)/2+leftRow;
	    computerBtn.setBounds(x,btnLn2,btnWidth,btnHeight);
	    computerBtn.setFont(new Font("Helvetica Neue",Font.PLAIN,14));
	    //computerBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createSettingsButton()
	{
		int x = (Window_Height)/2+rightRow;
	    settingsBtn.setBounds(x,btnLn2,btnWidth,btnHeight);
	    settingsBtn.setFont(new Font("Helvetica Neue",Font.PLAIN,14));
	    //settingsBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
	
	public void createAboutMenu ()
	{
		int x = (Window_Height)/2+btnPadding;
	    aboutBtn.setBounds(x,btnLn3,btnWidth,btnHeight);
	    aboutBtn.setFont(new Font("Helvetica Neue",Font.PLAIN,16));
	    //aboutBtn.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	}
}
