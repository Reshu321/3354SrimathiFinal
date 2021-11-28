package main;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class test extends JFrame 
{
	
	 JButton btnNewButton ; 
	 JComboBox comboBox; 
	  String [] answer =  {"","When trying to log in the user would select\nthe option REST and the app will process to send an email.\nThen follow the instructions forwarded to the email to reset\nthe password",
		"Yes. The Personal Customization Process started as soon as you \ncreated your account. The budget created is created to fit your \nincome inputs and preferences."}; 
	  JTextArea   txtrWhenTryingTo; 
	  JLabel lblNewLabel_1_1 ; 
	  boolean check = false; 
	  
	  test()
	  {
		  
	  }
	    
	test(User person)
	{
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JTextArea txtrTheProcessVaries = new JTextArea ("The process varies depending on what credit card company\nyou choose to go with. Generally, the application asks for a \nname, contact information and financial information. \nAfterwards, the card will be approved and you will use a card to use.\n");
		txtrTheProcessVaries.setForeground(new Color(0, 0, 0));
		txtrTheProcessVaries.setBounds(6, 216, 438, 80);
	    getContentPane().add(txtrTheProcessVaries);
	    
	    JLabel lblNewLabel = new JLabel("Frequently Asked Questions");
	    lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
	    lblNewLabel.setForeground(new Color(0, 191, 255));
	    lblNewLabel.setBounds(64, 34, 345, 46);
	    getContentPane().add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("How do you apply for a credit card? ");
	    lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
	    lblNewLabel_1.setBounds(6, 184, 355, 16);
	    getContentPane().add(lblNewLabel_1);
	    
	    String[] questions = {"Select","What do you do if you forget your password?","Is the application customized?"}; 
	    
	    comboBox = new JComboBox(questions);
	    comboBox.setBounds(23, 116, 289, 27);
	    getContentPane().add(comboBox);
	    
	    btnNewButton = new JButton("select");
	    btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(e.getSource() ==btnNewButton)
				{
					//System.out.println("help");
					int i = comboBox.getSelectedIndex(); 
					String x = (String) comboBox.getSelectedItem();
					
					
					if(check)
					{
						Container parent4 = txtrWhenTryingTo.getParent();
						parent4.remove(txtrWhenTryingTo);
						parent4.validate();
						parent4.repaint();
						Container parents = lblNewLabel_1_1.getParent();
						parents.remove(lblNewLabel_1_1);
						parents.validate();
						parents.repaint();
						lblNewLabel_1_1 = new JLabel(x);
						 lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
						 lblNewLabel_1_1.setBounds(6, 318, 355, 16);
						 getContentPane().add(lblNewLabel_1_1);
						
						
						txtrWhenTryingTo = new JTextArea(answer[i]);
					    txtrWhenTryingTo.setForeground(Color.BLACK);
					    txtrWhenTryingTo.setBounds(6, 346, 438, 80);
					    getContentPane().add(txtrWhenTryingTo);
					    check = true; 
						
						
					}
					else
					{
						if(x=="select")
						{
							x=""; 
						}
						 lblNewLabel_1_1 = new JLabel(x);
						 lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
						 lblNewLabel_1_1.setBounds(6, 318, 355, 16);
						 getContentPane().add(lblNewLabel_1_1);
						
						
						txtrWhenTryingTo = new JTextArea(answer[i]);
					    txtrWhenTryingTo.setForeground(Color.BLACK);
					    txtrWhenTryingTo.setBounds(6, 346, 438, 80);
					    getContentPane().add(txtrWhenTryingTo);
					    check = true; 
					    
					}
					
					
				}
			}
		});
	    
	    btnNewButton.setForeground(new Color(0, 191, 255));
	    btnNewButton.setBounds(327, 115, 117, 29);
	    getContentPane().add(btnNewButton);
	    
	    
	    JButton btnNewButton1 = new JButton("Home");
		btnNewButton1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton1) 
				{
					homePage hp = new homePage(person); 
					hp.setBounds(10, 10, 450, 600);
		            hp.setVisible(true);
							
				}
			}
		});
		btnNewButton1.setForeground(new Color(0, 191, 255));
		btnNewButton1.setBounds(327, 510, 117, 29);
		getContentPane().add(btnNewButton1);
	    
	}
	
	
	
	
	
	
	
	
	
	

	
}
