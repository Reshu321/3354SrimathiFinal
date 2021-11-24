package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EditBudget extends JFrame 
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JLabel lblNewLabel_3; 

	EditBudget()
	{
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		/*JLabel monthIncome = new JLabel("Monthly Income:                                  $");
		monthIncome.setBounds(30, 170, 322, 50);
		getContentPane().add(monthIncome);
		
		JLabel entertain = new JLabel  ("Amount allocated in Entertainment:    $");
		entertain.setBounds(30, 210, 322, 50);
		getContentPane().add(entertain);
		
		JLabel food = new JLabel       ("Amount allocatsed in Food:                $");
		food.setBounds(30, 250, 322, 50);
		getContentPane().add(food);
		
		
		JLabel util = new JLabel       ("Amount allocated in Utilities:             $");
		util.setBounds(30, 290, 322, 50);
		getContentPane().add(util);
		
		JLabel save = new JLabel       ("Amount allocated in Savings:              $");
		save.setBounds(30, 330, 322, 50);
		getContentPane().add(save);
		
		JLabel miss = new JLabel       ("Amount allocated in Miscellaneous:    $");
		miss.setBounds(30, 370, 322, 50); 
		getContentPane().add(miss);
		
		JLabel lblNewLabel = new JLabel("Category");
		lblNewLabel.setBounds(30, 142, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current");
		lblNewLabel_1.setBounds(243, 142, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(364, 182, 80, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(364, 222, 80, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(364, 262, 80, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(364, 302, 80, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(364, 342, 80, 26);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(364, 382, 80, 26);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Edit");
		lblNewLabel_2.setBounds(367, 142, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(164, 483, 117, 29);
		getContentPane().add(btnNewButton);
		*/
		
	}
	
	EditBudget(User person)
	{
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		double mo = person.getMonthlyIncome(); 
		double ent = person.getEnter(); 
		double fo = person.getF(); 
		double ut = person.getU(); 
		double sa = person.getS(); 
		double mi = person.getM(); 
		
		JLabel monthIncome = new JLabel("Monthly Income:                                  $"+ person.getMonthlyIncome());
		monthIncome.setBounds(30, 170, 322, 50);
		getContentPane().add(monthIncome);
		
		JLabel entertain = new JLabel("Amount allocated in Entertainment:    $"+ person.getEnter());
		entertain.setBounds(30, 210, 322, 50);
		getContentPane().add(entertain);
		
		JLabel food = new JLabel("Amount allocatsed in Food:                $"+ person.getF());
		food.setBounds(30, 250, 322, 50);
		getContentPane().add(food);
		
		
		JLabel util = new JLabel("Amount allocated in Utilities:             $"+ person.getU());
		util.setBounds(30, 290, 322, 50);
		getContentPane().add(util);
		
		JLabel save = new JLabel("Amount allocated in Savings:              $" + person.getS());
		save.setBounds(30, 330, 322, 50);
		getContentPane().add(save);
		
		JLabel miss = new JLabel("Amount allocated in Miscellaneous:    $"+ person.getM());
		miss.setBounds(30, 370, 322, 50);
		getContentPane().add(miss);
		
		
		JLabel lblNewLabel = new JLabel("Category");
		lblNewLabel.setBounds(30, 142, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current");
		lblNewLabel_1.setBounds(243, 142, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(364, 182, 80, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(364, 222, 80, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(364, 262, 80, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(364, 302, 80, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(364, 342, 80, 26);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(364, 382, 80, 26);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Edit");
		lblNewLabel_2.setBounds(367, 142, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton) 
				{
					double i = Double.parseDouble(textField.getText());
					person.setMonthlyIncome(i);
					
					double en = Double.parseDouble(textField_1.getText());
					person.setEntertainment(en);
					
					double u = Double.parseDouble(textField_2.getText());
					person.setUtilities(u);
					
					double s = Double.parseDouble(textField_3.getText());
					person.setSavings(s);
					
					double f = Double.parseDouble(textField_4.getText());
					person.setFood(f);
					
					double m = Double.parseDouble(textField_5.getText());
					person.setMiscellaneous(m);
					
					double totalSpendings = en + f + u + m + s;
					double remainingBalance = i - totalSpendings;
				    // Checks if remaining balance is negative
					  System.out.println("help"); 
					  
				    if (remainingBalance < 0)
				    {
				      System.out.println("helo"); 
				    	lblNewLabel_3 = new JLabel("You have gone over your monthly income! Please try again.");
						lblNewLabel_3.setForeground(Color.RED);
						lblNewLabel_3.setBounds(36, 455, 414, 16);
						getContentPane().add(lblNewLabel_3);
						//sets back to original values 
						person.setMonthlyIncome(mo);
						System.out.println(person.getMonthlyIncome()); 
						
						person.setEntertainment(ent);
						person.setUtilities(ut);
						person.setSavings(sa);
						person.setFood(fo);
						person.setMiscellaneous(mi);
				      
				    }
				    else
				    {
				    	lblNewLabel_3 = new JLabel("Your changes have been saved!");
						lblNewLabel_3.setForeground(Color.BLUE);
						lblNewLabel_3.setBounds(36, 455, 414, 16);
						getContentPane().add(lblNewLabel_3);
				    }
					
				}
			}
		});
		btnNewButton.setBounds(164, 500, 117, 29);
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
