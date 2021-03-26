package Atm;

/**
 * This class creates accounts the Main class.
 * It also contains constructors and methods for the Main class.
 * 
 * @author Uzair Lakhani
 */
public class Account {
    
  //Creates attributes of an atm machine  
  private int pinNumber;
  private double total;
  private double deposit;
  private String userName;
  
    /**
     * Constructor with parameters.
     *
     * @param userName
     * @param pinNumber
     * @param money
     */
  public Account(String userName, int pinNumber, double money){
    this.pinNumber = pinNumber;
    this.total = money;
    this.userName = userName;
  }

    /**
     * Returns the username.
     *
     * @return
     */
  
  public String getUserName(){
    return userName;
  }
    /**
     * Returns total amount.
     *
     * @return
     */
  public double getMoney(){
    return total;
  }
  
     /**
     * Returns the pinNumber.
     *
     * @return
     */
  
  public int getPinNumber(){
    return pinNumber;
  }
  
    /**
     * Method to set total amount of money.
     *
     * @param newMoney
     */
  
  public void setMoney(double newMoney){
    total= newMoney;
  }


    /**
    *toString method of account class to print options in the Main class
    * @return
     */
    @Override  
  public String toString(){
    return "*********************************************"
    + "\nPlease select one of the options below: "
    + "\nPress (1) to  Switch Accounts"
    + "\nPress (2) to Deposit (2 decimal places)"
    +"\nPress (3) Transfer (2 decimal places)"
    + "\nPress (4) to  Withdraw (2 decimal places)"
    +"\nPress (5) to Print balance"
    +"\nPress (6) to Exit";
  }
}