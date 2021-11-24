package main;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;

public class Terms extends JFrame {
	public Terms() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Terms and Conditions");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(35, 0, 300, 33);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("These Terms and Conditions constitute ");
		lblNewLabel_1.setBounds(50, 43, 253, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("a legally binding agreement made between you, ");
		lblNewLabel_2.setBounds(50, 60, 228, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("your access  whether personally or on behalf ");
		lblNewLabel_3.setBounds(50, 94, 278, 13);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chum change (\u201Cwe,\u201D \u201Cus\u201D or \u201Cour\u201D), concerning ");
		lblNewLabel_4.setBounds(50, 77, 290, 13);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("of an entity (\u201Cyou\u201D) and to and use of the Chum ");
		lblNewLabel_5.setBounds(50, 111, 253, 13);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Change website as well as any other media form, ");
		lblNewLabel_6.setBounds(50, 128, 280, 13);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("media channel, mobile website or mobile application ");
		lblNewLabel_7.setBounds(50, 145, 269, 13);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("related, linked, or otherwise New labelconnected ");
		lblNewLabel_8.setBounds(50, 162, 253, 13);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("thereto (collectively, the \u201CSite\u201D). ");
		lblNewLabel_9.setBounds(47, 179, 187, 13);
		getContentPane().add(lblNewLabel_9);
	
	}
}
