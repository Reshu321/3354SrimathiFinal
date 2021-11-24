/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import java.util.*;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
/*This is the main class for Chum Chnage's login functionality. This class begins by asking a user who runs it if they are a new user or not (y or n). From here it calls two different methods based on the user response. If the user responds 'y' (they are a new user) the code calls the newUser method. 

newUser: This method outputs different prompts for the user to create a new account, it stores these responses in a new "User" class that it creates. newUser calls the password, phoneNumber, and email methods to run error checking on each value the user enters. The password method ensures there is at least one capital letter in the user's password, the phone number method ensures the entered number is a valid 10 digit number, and the email method ensures the email has an @ symbol making it a valid email. After getting these values we insert User into a hashmap for storage while the code is being run. The user is then welcomed to Chum Change and asked to enter their monthly income to finish the setup process. From newUser the budgetAllocations method is called (passing the monthly income and the User object) to gather the user's personal financial info as well as how much they would like to allocate to different spending categories. The budgetAllocations method also ensures the total expenditures does not exceed the user's monthly input. newUser then calls the writeToFile method and appends the new user's info to a file containing existing user info.

budgetAllocations: This method takes in a monthly income and an object of the user type to create a budget for the user. The user is prompted to enter values for Entertainment, Food, Utilities, Miscellaneous, and Savings, these are totaled and compared to the monthly income to ensure they do not exceed the user's income. A Budget object is created with these values and then connected to the User class for the specific user as User extends Budget.

writeToFile: This method takes a User as a parameter and creates a writer that will write to a specific data file to store the user info. The data file is set to append new info and acts as our "database" storing all existing user info entered thusfar. 

readFromFile: This method will read the exisiting user data and utalize a hashmap to store the data. Username will be the key which will be mapped to multiple varibles such as password, email, budget information,and etc. 
displayMenu: This method will display a drop down menu for users. Drop down utalizes a switch case user will enter value the value will determine the drop down menu option. Drop down menu options include acounts, finances, and user's information. 

*/

// main class
public class Main 
{ 
  static HashMap<String, User> map = new HashMap<String, User>();


  // newUser method
  public static void newUser()
  {
	  User person = new User();
	    // Scanner used to get keyboard input
	    Scanner scan = new Scanner(System.in);
	    // Prompts user to create a username
	    createUsername();
	    // Gets user input using nextLine()
	    person.setUsername(scan.nextLine());
	    // Calls password method
	    person.setPassword(password());
	    // Calls phoneNumber method
	    person.setPhoneNum(phoneNumber());
	    // Calls email method
	    person.setEmail(email());
	    // Displays welcome message with username
	    System.out.println("\nWelcome to Chum Change, " + person.getUsername() + "!\n");
	    // Displays next step in profile set-up and prompts user to enter information
	    System.out.println("To finish set-up, please enter the following information:");
	    // Prompts user to enter their monthly income
	    System.out.println("Enter Monthly Income (After Tax): ");
	    // Gets user input using nextInt()
	    person.setMonthlyIncome(scan.nextDouble());
	    // Calls budgetAllocations method with one parameter, monthlyIncome
	    budgetAllocations(person.getMonthlyIncome(), person);
	    // Displays final message that the set-up is finshed to the user
	    map.put(person.getUsername(), person);
	    writeToFile(person);
	    System.out.println("\n\nThank you for setting up your Chum Change account, " + person.getUsername() + "!");
  }
  
  
  
  public static String createUsername()
  {
    // Scanner used to get keyboard input
    Scanner scan = new Scanner(System.in);
    // Prompts user to create username
    System.out.println("Create username (Must be at least 8 characters long): ");
    // get user input
    String username = scan.nextLine();
    // check is username is less than 8 characters
    if (username.length() < 8)
    {
      // if username is less than 8 characters, prompt user to try again
      System.out.println("Invalid username! Try again.");
      createUsername();
    }
    return username;
  }
  
  
  // budgetAllocations method
  public static void budgetAllocations(double monthlyIncome, User person)
  {
    // Scanner used to get keyboard input
    Scanner scan = new Scanner(System.in);
    // Prompts user to enter budget allocations for categories listed
    System.out.println("\nPlease enter how much you would like to allocate for each category:");
    // Prompts user to enter budget allocation for Entertainment
    System.out.println("Entertainment: ");
    // Gets user input using nextInt()
    double entertainment = scan.nextDouble();
    person.setEntertainment(entertainment);
    // Prompts user to enter budget allocation for Food
    System.out.println("Food: ");
    // Gets user input using nextInt()
    double food = scan.nextDouble();    
    person.setFood(food);
    // Prompts user to enter budget allocation for Utilities
    System.out.println("Utilities: ");
    // Gets user input using nextInt()
    double utilities = scan.nextDouble();
    person.setUtilities(utilities);
    // Prompts user to enter budget allocation for Payments
    System.out.println("Miscellaneous: ");
    // Gets user input using nextInt()
    double miscellaneous = scan.nextDouble();
    person.setMiscellaneous(miscellaneous);
    // Prompts user to enter budget allocation for Savings
    System.out.println("Savings: ");
    // Gets user input using nextInt()
    double savings = scan.nextDouble();
    person.setSavings(savings);
    // Calculates total spendings by adding together all the budget allocations for each category
    double totalSpendings = entertainment + food + utilities + miscellaneous + savings;
    // Calculates remaining balance by subtracting the total spendings from the user's monthly income
    double remainingBalance = monthlyIncome - totalSpendings;
    // Checks if remaining balance is negative
    if (remainingBalance < 0){
      // Prompts user to try again due to the remaining balance being negative
      System.out.println("\nYou have gone over your monthly income! Please try again.");
      // Calls budgetAllocations method with same parameter recursively
      budgetAllocations(monthlyIncome, person);
      
    }
  }
  // phoneNumber method
  public static double phoneNumber()
  {
    // Scanner used to get keyboard input
    Scanner scan = new Scanner(System.in);
    // Prompts user to enter phone number
    System.out.println("Enter Phone Number (10 Digits): ");
    // Gets user input using nextLine()
    String phoneNumber = scan.nextLine();
    // Length stores the number of characters in phoneNumber
    int length = phoneNumber.length();
    // Checks if length does not equal 10
    if (length != 10){
      // Prompts user that phoneNumber entered is invalid, as it does not include 10 characters
      System.out.println("Invalid Phone Number!");
      // Recursively calls phoneNumber method
      phoneNumber();
    }
    // Returns phoneNumber back to newUser method
    return Double.parseDouble(phoneNumber);
  }
  // password method
  public static String password()
  {
    // Scanner used to get keyboard input
    Scanner scan = new Scanner(System.in);
    // Prompts user to create a new password that must include both lowercase and uppercase letters
    System.out.println("Create New Password (must include upper and lowercase letters): ");
    // Gets user input using nextLine()
    String password = scan.nextLine();
    // Default boolean variable for uppercase letters that is set to false
    boolean hasUpperCase = false;
    // Default bookean variable for lowercase letters that is set to false
    boolean hasLowerCase = false;
    // For loop to test each letter in the password
    for (int i = 0; i < password.length(); i++){
      // Sets character to current string element
      char ch = password.charAt(i);
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
    if (hasUpperCase != true || hasLowerCase != true){
      // Prompts user to enter at least on uppercase and lowercase letter
      System.out.println("Please include atleast one lower and uppercase letter!");
      // Recursively calls password method
      password();
    }
    // return password to newUser method
    return password;
  }
  // email method
  public static String email()
  {
    // Scanner used to get keyboard input
    Scanner scan = new Scanner(System.in);
    // Prompts user to create a new password that must include both lowercase and uppercase letters
    System.out.println("Please enter your email: ");
    // Gets user input using nextLine()
    String email = scan.nextLine();
    // Default boolean variable for uppercase letters that is set to false
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
    if (hasAtSymbol != true ){
      // Prompts user to enter at least on uppercase and lowercase letter
      System.out.println("Please include a valid email!");
      // Recursively calls password method
      email();
    }
    // return password to newUser method
    return email;
  }


  public User existingUser(String user, String pass)
  {
      
        if(map.containsKey(user)) // checks if username is in file
        {
        
            if(map.get(user).getPassword().equals(pass)) // if username and password match then returns true 
            {
            	return map.get(user); 
            	
            }
            //password does not match password of entered username
            else
            {
            	return null; // password is wrong for username
            }
          }
        else
        {
        	return null; // username does not exist or entered in wrong
        }
    
  }
  

  public static void writeToFile(User person) {
	  try {
    //Creates new writer to insert values into datafile
		FileWriter writer = new FileWriter("dataTest.txt", true);
    //Adds all items of user into file for storage
		writer.write(person.getUsername() + "|");
		writer.write(person.getPassword() + "|");
		writer.write(person.getPhoneNum().toString() + "|");
		writer.write(person.getEmail() + "|");
		writer.write(String.valueOf(person.getMonthlyIncome()) + "|");
		writer.write(String.valueOf(person.getEntertainment()) + "|");
		writer.write(String.valueOf(person.getFood()) + "|");
		writer.write(String.valueOf(person.getUtilities()) + "|");
		writer.write(String.valueOf(person.getMiscellaneous()) + "|");
		writer.write(String.valueOf(person.getSavings()) + "\n");
		writer.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
  
  public void displayMenu(User person)
  {  
	/* Scanner userIn = new Scanner(System.in);
	  int menuNum = 0;
    //Displays a user's options to choose from
	  System.out.println("Hello " + person.getUsername() + ", please select a menu option:");
	  System.out.println("1: Account");
	  System.out.println("2: Finances");
    //Records user's input
	  menuNum = userIn.nextInt();
	  switch(menuNum) {
    //Runs if user selects menu option 1
	  case 1:
    //outputs some of the user's account information
		 System.out.println("Username: " + person.getUsername());
		 System.out.println("User Email: " + person.getEmail());
		 System.out.println("User Phone Number: " + person.getPhoneNum());
	 	 break;
    //Runs if user selects menu option 2
	  case 2:
    //outputs user's monthly income
	    System.out.println("User Monthly Income: " + person.getMonthlyIncome());
      //calls function to generate budget summary
	   
	   // person.getBudgetSummary();
      //asks user if they'd like to edit their budget
	    System.out.println("Enter 1 To edit budget allocations or 0 to continue:");
	    int editInput = userIn.nextInt();
      //calls budgetAllocations function again if user wishes to edit
	    if (editInput == 1)
	    {
	      budgetAllocations(person.getMonthlyIncome(), person);
	    }
	  break;
	    }
	  */
	  
	  
	 }


  public static void readFromFile() throws FileNotFoundException {
        Scanner file1 = new Scanner(new File("dataTest.txt"));

        String [] parts = null;
        String username; 	
        String password; 
        String phone; 
        String email; 
        double monthlyIncome; 
        double entertainment;
        double food;
        double miscellaneous;
        double utilities;
        double savings;

        List<String> arr = new ArrayList<String>(200); 

        while(file1.hasNextLine())
        {
      //creates different parts to store each variable
            parts = file1.nextLine().split("\\|");
            User temp = new User();
            arr.add(parts[0]); 
            arr.add(parts[1]); 
            arr.add(parts[2]); 
            arr.add(parts[3]);
            arr.add(parts[4]);
            arr.add(parts[5]);
            arr.add(parts[6]);
            arr.add(parts[7]);
            arr.add(parts[8]);
            arr.add(parts[9]);
            temp.setUsername(parts[0]);
            temp.setPassword(parts[1]);
            temp.setPhoneNum(Double.parseDouble(parts[2]));
            temp.setEmail(parts[3]);
            temp.setMonthlyIncome(Double.parseDouble(parts[4]));
            temp.setEntertainment(Double.parseDouble(parts[5]));
            temp.setFood(Double.parseDouble(parts[6]));
            temp.setMiscellaneous(Double.parseDouble(parts[8]));
            temp.setUtilities(Double.parseDouble(parts[7]));
            temp.setSavings(Double.parseDouble(parts[9]));
            map.put(parts[0],temp);
	  }	
	   
	
  }

  
  
  public static void main(String[] args) throws IOException 
  {
	  
	  
        readFromFile(); 
    /*//read from File to HashMap 
   
         newLoginFrame frame = new newLoginFrame();
            frame.setTitle("New Account Form");
            frame.setVisible(true);
            frame.setBounds(10, 10, 370, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            newUser();*/
         //existingUser();
            LoginFrame frame = new LoginFrame();
            frame.setTitle("Login Form");
            frame.setVisible(true);
            frame.setBounds(10, 10, 450, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
           // existingUser();
  }
   
  
}