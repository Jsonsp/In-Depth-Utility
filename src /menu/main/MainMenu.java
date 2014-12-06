package menu.main;

import menu.buffer.BufferPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;


public class MainMenu extends JPanel
{
	public static final int Window_Height = 500;
	public static final int Window_Width = 700;
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
		settingsBtn = new JButton ("Settigns Manu");
		aboutBtn = new JButton ("About IDU");
	}
	
	public void layoutComponents() 
	{	
		GridBagConstraints gbc = new GridBagConstraints();
		
		setLayout(new GridBagLayout());
		
		setPreferredSize(new Dimension(Window_Width,Window_Height));
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(mainTittleLbl,gbc);
		
		add(companyNameLbl,gbc);
		
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
	
	public void createPersonalBtn()
	{
		int x = (Window_Height)/2-85;
		personalBtn.setBounds(x,50,150,50 );
	}
	
	public void createSchoolBtn()
	{
		int x = (Window_Height)/2+125;
		schoolBtn.setBounds(x,50,150,50 );
	}
	
	public void createComputerBtn()
	{
		int x = (Window_Height)/2-85;
	    computerBtn.setBounds(x,150,150,50 );
	}
	
	public void createSettingsBtn()
	{
		int x = (Window_Height)/2+125;
	    settingsBtn.setBounds(x,150,150,50 );
	}
	
	public void createAboutBtn ()
	{
		int x = (Window_Height)/2+20;
	    aboutBtn.setBounds(x,250,150,50 );
	}
	
	public static void  CreateMainTittleLable()
	{
		mainTittleLbl.setFont(new Font("Helvetica Neue",Font.PLAIN,30));
	    int x = (int) (Window_Height) / 2-25;
	    mainTittleLbl.setBounds(x, 5, 1000,40);
	}

	public static void  CreateBottomLabel()
	{
		companyNameLbl.setFont(new Font("Helvetica Neue",Font.PLAIN,12));
	    int y = (int) (Window_Height) / 2+55;
	    companyNameLbl.setBounds(480, y, 1000,40);
	}
}
