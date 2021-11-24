package main;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;

public class about extends JFrame {
	public about() {
		getContentPane().setBackground(Color.ORANGE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		
		JLabel lblNewLabel = new JLabel("About");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(120, 0, 300, 33);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("This app was designed to assist users ");
		lblNewLabel_1.setBounds(50, 43, 253, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("in their journey of mastering to become ");
		lblNewLabel_2.setBounds(50, 60, 228, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("a more financially literate individual. ");
		lblNewLabel_3.setBounds(50, 77, 290, 13);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("The individual can be come financially literate  ");
		lblNewLabel_4.setBounds(50, 94, 278, 13);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("by reading articles supplied or watching  ");
		lblNewLabel_5.setBounds(50, 111, 253, 13);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("videos. They also get to create their own budget ");
		lblNewLabel_6.setBounds(50, 128, 280, 13);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("or they get to use the one suggested.");
		lblNewLabel_7.setBounds(50, 145, 269, 13);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("The application will help guide individuals in saving. ");
		lblNewLabel_8.setBounds(50, 162, 253, 13);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(50, 179, 187, 13);
		getContentPane().add(lblNewLabel_9);
	
	}
}
