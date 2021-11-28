package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JButton;


public class financePage extends JFrame 

{
	
	public financePage()
	{
		
		
		
	}
	
	
	public financePage(User person)
	{
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
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
		lblNewLabelx.setBounds(30, 142, 155, 16);
		getContentPane().add(lblNewLabelx);
		
		JLabel lblNewLabel_1x = new JLabel("Allocations");
		lblNewLabel_1x.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1x.setForeground(Color.WHITE);
		lblNewLabel_1x.setBounds(311, 142, 121, 16);
		getContentPane().add(lblNewLabel_1x);
		
		JLabel monthIncome = new JLabel("Monthly Income:                                 $"+ person.getMonthlyIncome());
		monthIncome.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		monthIncome.setBounds(30, 170, 414, 50);
		getContentPane().add(monthIncome);
		
		JLabel entertain = new JLabel("Amount allocated in Entertainment:      $"+ person.getEnter());
		entertain.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		entertain.setBounds(30, 210, 420, 50);
		getContentPane().add(entertain);
		
		JLabel food = new JLabel     ("Amount allocated in Food:                   $"+ person.getF());
		food.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		food.setBounds(30, 250, 402, 50);
		getContentPane().add(food);
		
		
		JLabel util = new JLabel("Amount allocated in Utilities:               $"+person.getU());
		util.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		util.setBounds(30, 290, 387, 50);
		getContentPane().add(util);
		
		JLabel save = new JLabel("Amount allocated in Savings:               $"+ person.getS());
		save.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		save.setBounds(30, 330, 387, 50);
		getContentPane().add(save);
		
		JLabel miss = new JLabel("Amount allocated in Miscellaneous:      $"+ person.getM());
		miss.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		miss.setBounds(30, 370, 402, 50);
		getContentPane().add(miss);
		
		
		JLabel expeden = new JLabel("Total amount of expenditures:             $"+person.getExpenditures());
		expeden.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		expeden.setBounds(30, 430, 402, 50);
		getContentPane().add(expeden);
		
		
		
		JButton btnNewButton_1 = new JButton("Edit Budget Allocations");
		btnNewButton_1.setForeground(new Color(0, 191, 255));
		
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_1) 
				{
				
					EditBudget eb = new EditBudget(person); 
					eb.setBounds(10, 10, 450, 600); 
		            eb.setVisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(30, 510, 179, 29);
		getContentPane().add(btnNewButton_1);

		
		

		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton) 
				{
					homePage hp = new homePage(person); 
					hp.setBounds(10, 10, 450, 600);
		            hp.setVisible(true);
							
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 191, 255));
		btnNewButton.setBounds(327, 510, 117, 29);
		getContentPane().add(btnNewButton);
		
		
		
	}
}
