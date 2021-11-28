package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
	boolean check = false; 

	EditBudget()
	{
		
		
		
		
		
		/*textField = new JTextField();
		textField.setBounds(404, 182, 40, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(404, 222, 40, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(404, 262, 40, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(404, 302, 40, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(404, 342, 40, 26);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(404, 382, 40, 26);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Edit");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(403, 143, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(108, 515, 117, 29);
		getContentPane().add(btnNewButton);*/
		
		
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
	
		JLabel lblNewLabel = new JLabel("Budget Allocations");
		
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 35));
	    lblNewLabel.setForeground(new Color(0, 191, 255));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(17, 57, 400, 50);
        getContentPane().add(lblNewLabel);
	
		//User person = new User(); 
		
        JLabel lblNewLabelx = new JLabel("Category");
        lblNewLabelx.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        lblNewLabelx.setForeground(Color.WHITE);
		lblNewLabelx.setBounds(15, 142, 155, 16);
		getContentPane().add(lblNewLabelx);
		
		JLabel lblNewLabel_1x = new JLabel("Allocations");
		lblNewLabel_1x.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1x.setForeground(Color.WHITE);
		lblNewLabel_1x.setBounds(296, 142, 95, 16);
		getContentPane().add(lblNewLabel_1x);
		
		JLabel monthIncome = new JLabel("Monthly Income:                                 $"+ person.getMonthlyIncome());
		monthIncome.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		monthIncome.setBounds(15, 169, 414, 50);
		getContentPane().add(monthIncome);
		
		JLabel entertain = new JLabel("Amount allocated in Entertainment:      $"+ person.getEnter());
		entertain.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		entertain.setBounds(15, 209, 420, 50);
		getContentPane().add(entertain);
		
		JLabel food = new JLabel     ("Amount allocated in Food:                   $"+ person.getF());
		food.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		food.setBounds(15, 249, 402, 50);
		getContentPane().add(food);
		
		
		JLabel util = new JLabel("Amount allocated in Utilities:               $"+person.getU());
		util.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		util.setBounds(15, 289, 387, 50);
		getContentPane().add(util);
		
		JLabel save = new JLabel("Amount allocated in Savings:               $"+ person.getS());
		save.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		save.setBounds(15, 329, 387, 50);
		getContentPane().add(save);
		
		JLabel miss = new JLabel("Amount allocated in Miscellaneous:      $"+ person.getM());
		miss.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		miss.setBounds(15, 369, 402, 50);
		getContentPane().add(miss);
		
		
		JLabel expeden = new JLabel("Total amount of expenditures:             $"+person.getExpenditures());
		expeden.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		expeden.setBounds(15, 430, 402, 50);
		getContentPane().add(expeden);
		
		
		textField = new JTextField();
		textField.setBounds(390, 182, 50, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(390, 222, 50, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(390, 262, 50, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(390, 302, 50, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(390, 342, 50, 26);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(390, 382, 50, 26);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Edit");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(403, 143, 61, 16);
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
				
				    if (remainingBalance < 0)
				    {
				       
				    	lblNewLabel_3 = new JLabel("You have gone over your monthly income! Please try again.");
						lblNewLabel_3.setForeground(Color.RED);
						lblNewLabel_3.setBounds(36, 480, 414, 16);
						getContentPane().add(lblNewLabel_3);
						
						//sets back to original values 
						person.setMonthlyIncome(mo);
						person.setEntertainment(ent);
						person.setUtilities(ut);
						person.setSavings(sa);
						person.setFood(fo);
						person.setMiscellaneous(mi);
						check = true; 
						
						
				      
				    }
				    else
				    {
				    	if(check)
				    	{
				    		Container parent = lblNewLabel_3.getParent();
							parent.remove(lblNewLabel_3 );
							parent.validate();
							parent.repaint();
							
				    	}
				    	

				    	lblNewLabel_3 = new JLabel("Your changes have been saved!");
						lblNewLabel_3.setForeground(Color.BLUE);
						lblNewLabel_3.setBounds(36, 480, 414, 16);
						getContentPane().add(lblNewLabel_3);
				    }
				    
					
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 191, 255));
		btnNewButton.setBounds(108, 510, 117, 29);
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
