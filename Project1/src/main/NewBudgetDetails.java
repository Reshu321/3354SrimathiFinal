package main;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewBudgetDetails extends JFrame 
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JLabel lblNewLabel_1 ; 
	JLabel lblNewLabel_1_2 ; 
	private final JLabel lblNewLabel_2 = new JLabel("Enter Budget Data");
	NewBudgetDetails()
	{
		/*getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JLabel monthIncome = new JLabel("Monthly Income:                                  $");
		monthIncome.setBounds(30, 170, 250, 50);
		getContentPane().add(monthIncome);
		
		JLabel entertain = new JLabel("Amount allocated in Entertainment:    $");
		entertain.setBounds(30, 210, 322, 50);
		getContentPane().add(entertain);
		
		JLabel food = new JLabel("Amount allocatsed in Food:                $");
		food.setBounds(30, 250, 322, 50);
		getContentPane().add(food);
		
		
		JLabel util = new JLabel("Amount allocated in Utilities:             $");
		util.setBounds(30, 290, 322, 50);
		getContentPane().add(util);
		
		JLabel save = new JLabel("Amount allocated in Savings:              $");
		save.setBounds(30, 330, 322, 50);
		getContentPane().add(save);
		
		JLabel miss = new JLabel("Amount allocated in Miscellaneous:    $");
		miss.setBounds(30, 370, 322, 50);
		getContentPane().add(miss);
		
		
		textField = new JTextField();
		textField.setBounds(300, 222, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(300, 262, 130, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(300, 302, 130, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(300, 342, 130, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 382, 130, 26);
		getContentPane().add(textField_4);
		
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 182, 130, 26);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel = new JLabel("Category");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(30, 150, 106, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount");
		lblEnterAmount.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblEnterAmount.setForeground(Color.WHITE);
		lblEnterAmount.setBounds(300, 150, 119, 16);
		getContentPane().add(lblEnterAmount);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(166, 453, 117, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("You have gone over your monthly income! Please try again.");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(41, 502, 389, 16);
		getContentPane().add(lblNewLabel_1);
		
		*/
	
	}
	
	NewBudgetDetails(User person)
	{
		
	
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JLabel monthIncome = new JLabel("Monthly Income:                                  $");
		monthIncome.setBounds(30, 170, 322, 50);
		getContentPane().add(monthIncome);
		
		JLabel entertain = new JLabel("Amount allocated in Entertainment:    $");
		entertain.setBounds(30, 210, 322, 50);
		getContentPane().add(entertain);
		
		JLabel food = new JLabel("Amount allocatsed in Food:                $");
		food.setBounds(30, 250, 322, 50);
		getContentPane().add(food);
		
		
		JLabel util = new JLabel("Amount allocated in Utilities:             $");
		util.setBounds(30, 290, 322, 50);
		getContentPane().add(util);
		
		JLabel save = new JLabel("Amount allocated in Savings:              $");
		save.setBounds(30, 330, 322, 50);
		getContentPane().add(save);
		
		JLabel miss = new JLabel("Amount allocated in Miscellaneous:    $");
		miss.setBounds(30, 370, 322, 50);
		getContentPane().add(miss);
		
		 lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
	     lblNewLabel_2.setForeground(new Color(0, 191, 255));
	     lblNewLabel_2.setBounds(26, 72, 337, 56);
	        
	     getContentPane().add(lblNewLabel_2);
		
		
		textField = new JTextField();
		textField.setBounds(300, 222, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(300, 262, 130, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(300, 302, 130, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(300, 342, 130, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 382, 130, 26);
		getContentPane().add(textField_4);
		
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 182, 130, 26);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel = new JLabel("Category");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(30, 150, 106, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount");
		lblEnterAmount.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblEnterAmount.setForeground(Color.WHITE);
		lblEnterAmount.setBounds(300, 150, 119, 16);
		getContentPane().add(lblEnterAmount);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == btnNewButton)
				{
					double i = Double.parseDouble(textField_5.getText());
					person.setMonthlyIncome(i);
					
					double en = Double.parseDouble(textField.getText());
					person.setEntertainment(en);
					
					double u = Double.parseDouble(textField_1.getText());
					person.setUtilities(u);
					
					double s = Double.parseDouble(textField_2.getText());
					person.setSavings(s);
					
					double f = Double.parseDouble(textField_3.getText());
					person.setFood(f);
					
					double m = Double.parseDouble(textField_4.getText());
					person.setMiscellaneous(m);
					
					
					double totalSpendings = en + f + u + m + s;
					double remainingBalance = i - totalSpendings;
				    // Checks if remaining balance is negative
					  System.out.println("help"); 
					  boolean check = false;
				    if (remainingBalance < 0)
				    {
				    	lblNewLabel_1 = new JLabel("You have gone over your monthly income! Please try again.");
						lblNewLabel_1.setForeground(Color.RED);
						lblNewLabel_1.setBounds(41, 502, 389, 16);
						getContentPane().add(lblNewLabel_1);
						
						person.setEntertainment(0);
						person.setUtilities(0);
						person.setSavings(0);
						person.setFood(0);
						person.setMiscellaneous(0);
						check = true; 
						
				    }
				    else
				    {	
				    	homePage hframe = new homePage(person); 
			             hframe.setBounds(10, 10, 370, 600);
			             hframe.setVisible(true);
					
				    }
					

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
					btnNewButton1.setBounds(300, 510, 117, 29);
					getContentPane().add(btnNewButton1);
					
					
					
					
					
					
				}
			}
			
		}); 
		btnNewButton.setBounds(166, 453, 117, 29);
		getContentPane().add(btnNewButton);
		
		
		
		
		
	}

}
