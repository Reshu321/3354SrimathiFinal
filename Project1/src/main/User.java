package main;
import java.math.BigDecimal;
 class User extends Budget
{
  private String username;
  private String password;
  private String email;
  private BigDecimal phoneNum; 
  private double monthlyIncome;
  private Budget userBudget;
  
  public User(){
    this.username = " ";
    this.password = " ";
    this.email = " ";
    this.phoneNum = new BigDecimal("0");
    this.monthlyIncome = 0;
    this.userBudget = new Budget();
  }

  public User(String user, String pass, String em, double phone, double monIncome) {
    this.username = user;
    this.password = pass;
    this.email = em;
    this.phoneNum = new BigDecimal(phone);
    this.monthlyIncome = monIncome;
  }
  
  //getters
  public String getUsername(){
    return this.username;
  }
  public String getPassword(){
    return this.password;
  }
  public String getEmail(){
    return this.email;
  }
  public BigDecimal getPhoneNum(){
    return this.phoneNum;
  }
  public double getMonthlyIncome(){
    return this.monthlyIncome;
  }
  
  public double getEnter()
  {
	  return this.getEntertainment(); 
  }
  
  public double getF()
  {
	  return this.getFood(); 
  }
  
  public double getU()
  {
	  return this.getUtilities(); 
  }
  
  
  public double getS()
  {
	  return this.getSavings(); 
  }
  public double getM()
  {
	  return this.getMiscellaneous(); 
  }
  
  public double getExpenditures()
  {
	  return (this.getEntertainment()+this.getFood()+this.getUtilities()+this.getSavings()+this.getMiscellaneous());
  }
  
  
  
  
  
  
  
  
  

  //setters
  public void setUsername(String user){
    this.username = user;
  }
  public void setPassword(String pass){
    this.password = pass;
  }
  public void setEmail(String em){
    this.email = em;
  }
  public void setPhoneNum(double phone){
    this.phoneNum = new BigDecimal(phone);
  }
  public void setMonthlyIncome(double monIncome){
    this.monthlyIncome = monIncome;
  }
  public void setUserBudget(Budget budget){
    this.userBudget = budget;
  }
}

