package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Settings extends JFrame{
	public Settings() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Settings");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 0;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton = new JButton("About");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 2;
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton) {
					 about About = new about(); 
					 About.setBounds(10, 10, 450, 600);
		             About.setVisible(true);
				}
			}
		});
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Terms and Conditions");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 3;
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton_2) {
					 Terms terms = new Terms(); 
					 terms.setBounds(10, 10, 450, 600);
		             terms.setVisible(true);
				}
			}
		});
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		
		JButton btnNewButton_1 = new JButton("Sign out");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 4;
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_1.addActionListener(e -> System.exit(0));
	}
	

}
