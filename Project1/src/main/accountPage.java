package main;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class accountPage extends JFrame {
	
	public accountPage() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JTextPane txtpnHi = new JTextPane();
		txtpnHi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi.setText("Email:");
		txtpnHi.setBounds(111, 141, 250, 28);
		getContentPane().add(txtpnHi);
		
		JLabel lblNewLabel = new JLabel("Account Information");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 27));
		lblNewLabel.setBounds(106, 35, 274, 46);
		getContentPane().add(lblNewLabel);
		
		JTextPane txtpnHi_1 = new JTextPane();
		txtpnHi_1.setText("First Name:");
		txtpnHi_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi_1.setBounds(111, 201, 250, 28);
		getContentPane().add(txtpnHi_1);
		
		JTextPane txtpnHi_1_1 = new JTextPane();
		txtpnHi_1_1.setText("Last Name:");
		txtpnHi_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi_1_1.setBounds(111, 259, 250, 28);
		getContentPane().add(txtpnHi_1_1);
		
		JTextPane txtpnHi_1_2 = new JTextPane();
		txtpnHi_1_2.setText("Number:");
		txtpnHi_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi_1_2.setBounds(111, 316, 250, 28);
		getContentPane().add(txtpnHi_1_2);
	}
	
	public accountPage(User person) {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JTextPane txtpnHi = new JTextPane();
		txtpnHi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi.setText("Username: " + person.getUsername());
		txtpnHi.setBounds(34, 75, 250, 28);
		getContentPane().add(txtpnHi);
		
		JLabel lblNewLabel = new JLabel("Account Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(34, 10, 274, 46);
		getContentPane().add(lblNewLabel);
		
		JTextPane txtpnHi_1 = new JTextPane();
		txtpnHi_1.setText("Email: " + person.getEmail());
		txtpnHi_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi_1.setBounds(34, 113, 250, 28);
		getContentPane().add(txtpnHi_1);
		
		JTextPane txtpnHi_1_1 = new JTextPane();
		txtpnHi_1_1.setText("Phone number:" + person.getPhoneNum());
		txtpnHi_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi_1_1.setBounds(34, 151, 250, 28);
		getContentPane().add(txtpnHi_1_1);
		
		JTextPane txtpnHi_1_2 = new JTextPane();
		txtpnHi_1_2.setText("Monthly Income: $" + person.getMonthlyIncome());
		txtpnHi_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHi_1_2.setBounds(34, 191, 250, 28);
		getContentPane().add(txtpnHi_1_2);
		
		
		
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
		btnNewButton.setBounds(300, 510, 117, 29);
		getContentPane().add(btnNewButton);
		
		
	}
}
