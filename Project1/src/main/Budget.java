
package main;

class Budget
{
  private double entertainment;
  private double food;
  private double miscellaneous;
  private double utilities;
  private double savings;

  private double necessities;
  private double discretionary;

  public Budget(){
    this.entertainment = 0;
    this.food = 0;
    this.miscellaneous = 0;
    this.utilities = 0;
    this.savings = 0;
    this.necessities = 0;
    this.discretionary = 0;
  }

  public Budget(double e, double f, double m, double u, double s, double n, double d) {
    this.entertainment = e;
    this.food = f;
    this.miscellaneous = m;
    this.utilities = u;
    this.savings = s;
    this.necessities = n;
    this.discretionary = d;

  }

  public double getEntertainment(){
    return this.entertainment;
  }

  public double getFood(){
    return this.food;
  }

  public double getMiscellaneous(){
    return this.miscellaneous;
  }

  public double getUtilities(){
    return this.utilities;
  }

  public double getSavings(){
    return this.savings;
  }

  public double getNecessities(){
    return this.necessities;
  }

  public double getDiscretionary(){
    return this.discretionary;
  }


  public void setEntertainment(double e){
    this.entertainment = e;
  }

  public void setFood(double f){
    this.food = f;
  }

  public void setMiscellaneous(double m){
    this.miscellaneous = m;
  }

  public void setUtilities(double u){
    this.utilities = u;
  }

  public void setSavings(double s){
    this.savings = s;
  }

  public void setNecessities(double n){
    this.necessities = n;
  }

  public void setDiscretionary(double d){
    this.discretionary = d;
  }
}