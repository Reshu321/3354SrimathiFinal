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
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
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
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(64, 318, 244, 50);
		getContentPane().add(btnNewButton_1);
		
		
//========================================================================		
		
		JButton btnNewButton_1_1 = new JButton("Account");
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
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
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(64, 256, 244, 50);
		getContentPane().add(btnNewButton_1_1);
		
//========================================================================
		
		
		JButton btnNewButton_1_2 = new JButton("Search");
		btnNewButton_1_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1_2.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1_2) {
					
					searchPage sp = new searchPage(user); 
					 sp.setBounds(10, 10, 450, 600);
		             sp.setVisible(true);
				}
			}
		});
		btnNewButton_1_2.setBounds(64, 380, 244, 50);
		getContentPane().add(btnNewButton_1_2);
//========================================================================		
		JButton btnNewButton_1_2_1 = new JButton("FAQ");
		btnNewButton_1_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1_2_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1_2_1) {
					
					test qp = new test(user); 
					 qp.setBounds(10, 10, 450, 600);
		             qp.setVisible(true);
				}
			}
		});
		btnNewButton_1_2_1.setBounds(64, 444, 244, 50);
		getContentPane().add(btnNewButton_1_2_1);
		
		
		
		
//========================================================================
		JButton btnNewButton_1_2_1_1 = new JButton("Settings");
		btnNewButton_1_2_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1_2_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1_2_1_1) {
					Settings qp = new Settings(user); 
					 qp.setBounds(10, 10, 450, 600);
		             qp.setVisible(true);
				}
			}
		});
		btnNewButton_1_2_1_1.setBounds(64, 506, 244, 50);
		getContentPane().add(btnNewButton_1_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/reshmamuvvala/Desktop/Work-space/Project1/img/logo.png"));
		lblNewLabel_1.setBounds(78, 116, 201, 128);
		getContentPane().add(lblNewLabel_1);
	
		
    }
	
		 
	

	public homePage() 
	{
	 
		
		
	}
}
