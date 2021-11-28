package main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newLoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("New Username:");
    JLabel passwordLabel = new JLabel("New Password:");
    JLabel emailLabel = new JLabel("Email:");
    JLabel numberLabel = new JLabel("Number:");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JTextField emailTextField = new JTextField();
    JTextField numberTextField = new JTextField();
    JButton loginButton = new JButton("Create Account");
    JCheckBox showPassword = new JCheckBox("Show Password");
    private final JLabel lblAddEmail = new JLabel("Add Email:");
	JLabel lblNewLabel; 
	private final JLabel lblNewLabel_2 = new JLabel("Create an Account");
    


    newLoginFrame() {
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
        userLabel.setBounds(21, 180, 150, 40);
        passwordLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        passwordLabel.setBounds(21, 250, 136, 40);
        userTextField.setBounds(157, 181, 150, 30);
        passwordField.setBounds(157, 250, 150, 30);
      showPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
       showPassword.setBounds(317, 251, 127, 30);
        loginButton.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        loginButton.setForeground(new Color(0, 191, 255));
        loginButton.setBounds(98, 488, 200, 30);

    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.setBackground(new Color(255,153,51));
        lblAddEmail.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        lblAddEmail.setBounds(21, 320, 100, 30);
        
        getContentPane().add(lblAddEmail);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(157, 320, 150, 30);
        getContentPane().add(emailTextField);
        
        JLabel lblAddPhone = new JLabel("Add Phone:");
        lblAddPhone.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        lblAddPhone.setBounds(21, 390, 100, 30);
        getContentPane().add(lblAddPhone);
        
        numberTextField = new JTextField();
        numberTextField.setBounds(157, 390, 150, 30);
        getContentPane().add(numberTextField);
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
        lblNewLabel_2.setForeground(new Color(0, 191, 255));
        lblNewLabel_2.setBounds(26, 72, 337, 56);
        
        getContentPane().add(lblNewLabel_2);
        
      /*  JLabel lblNewLabel = new JLabel("Must be at least 8 characters long");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setBounds(127, 210, 317, 16);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Must include upper and lowercase letters");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        lblNewLabel_1.setForeground(Color.RED);
        lblNewLabel_1.setBounds(127, 280, 317, 16);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Please include a valid email!");
        lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        lblNewLabel_1_1.setForeground(Color.RED);
        lblNewLabel_1_1.setBounds(127, 350, 200, 16);
        getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Invalid Phone Number!");
        lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        lblNewLabel_1_1_1.setForeground(Color.RED);
        lblNewLabel_1_1_1.setBounds(127, 421, 200, 16);
        getContentPane().add(lblNewLabel_1_1_1);
        */
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) 
        {
            String userText;
            String pwdText;
            String email; 
            String phone;
            boolean hasUpperCase = false;
            // Default bookean variable for lowercase letters that is set to false
            boolean hasLowerCase = false;
            
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            email = emailTextField.getText(); 
            phone =  numberTextField.getText();
            boolean check = false; 
           
       
         
	            //validates username
	            if (userText.length() < 8)
	            {
	            	lblNewLabel = new JLabel("Must be at least 8 characters long");
	                lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
	                lblNewLabel.setForeground(Color.RED);
	                lblNewLabel.setBounds(127, 210, 317, 16);
	                getContentPane().add(lblNewLabel);
	                check = true; 
	                
	            }
	           
            //validates password
            for (int i = 0; i < pwdText.length(); i++){
                // Sets character to current string element
                char ch = pwdText.charAt(i);
                // Checks if character is an uppercase letter
                if (ch >= 'A' && ch <= 'Z'){
                  // if true, set hasUpperCase to true
                  hasUpperCase = true;
                }
                // Checks if charcter is a lowercase letter
                if (ch >= 'a' && ch <= 'z'){
                  // if true, set hasLowerCase to true
                  hasLowerCase = true;
                }
              }
              // Checks if hasLowerCase or hasUpperCase is not true
              if (hasUpperCase != true || hasLowerCase != true)
              {
            	  JLabel lblNewLabel_1 = new JLabel("Must include upper and lowercase letters");
                  lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
                  lblNewLabel_1.setForeground(Color.RED);
                  lblNewLabel_1.setBounds(127, 280, 317, 16);
                  getContentPane().add(lblNewLabel_1);
                  
              }
              
              //validates email
              boolean hasAtSymbol = false;

              // For loop to test each letter in the password
              for (int i = 0; i < email.length(); i++){
                // Sets character to current string element
                char ch = email.charAt(i);
                // Checks if character is an uppercase letter
                if (ch == '@'){
                  // if true, set hasUpperCase to true
                  hasAtSymbol = true;
                  break;
                }  
              }
              // Checks if hasLowerCase or hasUpperCase is not true
              if (hasAtSymbol != true )
              {
            	  JLabel lblNewLabel_1_1 = new JLabel("Please include a valid email!");
                  lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
                  lblNewLabel_1_1.setForeground(Color.RED);
                  lblNewLabel_1_1.setBounds(127, 350, 200, 16);
                  getContentPane().add(lblNewLabel_1_1);
                
              }
              
              //validates phoneNumber 
              int l = phone.length(); 
          
              if (l != 10)
              {
            	  JLabel lblNewLabel_1_1_1 = new JLabel("Invalid Phone Number!");
                  lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
                  lblNewLabel_1_1_1.setForeground(Color.RED);
                  lblNewLabel_1_1_1.setBounds(127, 421, 200, 16);
                  getContentPane().add(lblNewLabel_1_1_1);
                  
              }
              
              else
              {
            	  // no error that we can create new account 
            	  User person = new User();
                  
                  person.setUsername(userText);
                  person.setPassword(pwdText);
                  person.setEmail(email);
                  person.setPhoneNum( Double.parseDouble(phone));
                  
                  
                  NewBudgetDetails nb = new NewBudgetDetails(person); 
                  nb.setBounds(10, 10, 450, 600);
                  nb.setVisible(true);
                  
                  
              }
              
            
              
              
              
              
            

        }

       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }
}




