package main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrame extends JFrame implements ActionListener {

	
		
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton btnNewButton ; 
    private final JLabel lblNewLabel = new JLabel("New label");
   

    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
    	
        userLabel.setBounds(36, 240, 100, 30);
        passwordLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        passwordLabel.setBounds(36, 305, 100, 30);
        userTextField.setBounds(150, 241, 150, 30);
        passwordField.setBounds(150, 306, 150, 30);
        showPassword.setBounds(150, 348, 150, 30);
        loginButton.setForeground(new Color(0, 191, 255));
        loginButton.setBounds(61, 416, 100, 30);
        resetButton.setForeground(new Color(0, 191, 255));
        resetButton.setBounds(232, 416, 100, 30);
        
        btnNewButton = new JButton("Create  New Account");
        btnNewButton.setForeground(new Color(0, 191, 255));
        btnNewButton.setBounds(107, 477, 193, 29);
        getContentPane().add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel("Chum Change");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
        lblNewLabel_1.setForeground(new Color(0, 191, 255));
        lblNewLabel_1.setBounds(91, 31, 304, 58);
        getContentPane().add(lblNewLabel_1);
        


    }

    public void addComponentsToContainer() {
    	//container.add(background);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.setBackground(new Color(255,153,51));
        lblNewLabel.setIcon(new ImageIcon("/Users/reshmamuvvala/Desktop/Work-space/Project1/img/logo.png"));
        lblNewLabel.setBounds(115, 89, 201, 128);
        
        getContentPane().add(lblNewLabel);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        btnNewButton.addActionListener(this); 
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) 
        {
           LoginAuth(); 

        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
        
        if(e.getSource() == btnNewButton)
        {
        	newLoginFrame nl = new newLoginFrame(); 
            nl.setVisible(true);
            nl.setBounds(10, 10, 450, 600);
        }
    }

	public void LoginAuth() 
	{
		 String userText;
		 String pwdText; 
         userText = userTextField.getText();
         pwdText = passwordField.getText();
       
         Main obj = new Main(); 
         obj.existingUser(userText, pwdText); 
         
         
        if (obj.existingUser(userText, pwdText)!=null) 
         {
             JOptionPane.showMessageDialog(this, "Login Successful");
             
             homePage hframe = new homePage(obj.existingUser(userText, pwdText)); 
             hframe.setBounds(10, 10, 450, 600);
             hframe.setVisible(true);
             
           //  hframe.displayHomePage(obj.existingUser(userText, pwdText));
                   
            
         } 
         else {
             JOptionPane.showMessageDialog(this, "Invalid Username or Password");
         }
		
	}
}




