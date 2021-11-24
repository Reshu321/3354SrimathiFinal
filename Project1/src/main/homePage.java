package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class homePage extends JFrame 
{
	private final JLabel lblNewLabel = new JLabel("Chum Change");
	public homePage() 
	{
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		 
	}

	public homePage(User user) 
	{
	 
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 35));
	     lblNewLabel.setForeground(new Color(0, 191, 255));
	     lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(50, 58, 268, 50);
        getContentPane().add(lblNewLabel);
//========================================================================		
		JButton btnNewButton_1 = new JButton("Finances");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1) {
					financePage fp = new financePage(user); 
					 fp.setBounds(10, 10, 450, 600);
		             fp.setVisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(64, 240, 244, 50);
		getContentPane().add(btnNewButton_1);
		
		
//========================================================================		
		
		JButton btnNewButton_1_1 = new JButton("Account");
		btnNewButton_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1_1) {
					accountPage af = new accountPage(user); 
					 af.setBounds(10, 10, 450, 600);
		             af.setVisible(true);
				}
			}
		});
		btnNewButton_1_1.setBounds(64, 180, 244, 50);
		getContentPane().add(btnNewButton_1_1);
		
//========================================================================
		
		
		JButton btnNewButton_1_2 = new JButton("Search");
		btnNewButton_1_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1_2) {
					
					searchPage sp = new searchPage(); 
					 sp.setBounds(10, 10, 450, 600);
		             sp.setVisible(true);
				}
			}
		});
		btnNewButton_1_2.setBounds(64, 310, 244, 50);
		getContentPane().add(btnNewButton_1_2);
//========================================================================		
		JButton btnNewButton_1_2_1 = new JButton("FAQ");
		btnNewButton_1_2_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1_2_1) {
					faqPage qp = new faqPage(); 
					 qp.setBounds(10, 10, 450, 600);
		             qp.setVisible(true);
				}
			}
		});
		btnNewButton_1_2_1.setBounds(64, 380, 244, 50);
		getContentPane().add(btnNewButton_1_2_1);
		
		
		
		
//========================================================================
		JButton btnNewButton_1_2_1_1 = new JButton("Settings");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1_2_1_1) {
					Settings qp = new Settings(); 
					 qp.setBounds(10, 10, 450, 600);
		             qp.setVisible(true);
				}
			}
		});
		btnNewButton_1_2_1_1.setBounds(64, 450, 244, 50);
		getContentPane().add(btnNewButton_1_2_1_1);
		
		
    }
	
	/*public void displayHomePage(User user)
	{
		JLabel lblNewLabel = new JLabel("Welcome, " + user.getUsername() + "!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(65, 65, 300, 43);
		getContentPane().add(lblNewLabel);
		
	}*/
}
