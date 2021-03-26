package Atm;

/**
 * This class will make receipts for the withdraw method.
 * @author Arshjit Sansoe
 */
public class Receipts {
    private static int hundred=0;int fifty=0;int twenty=0;int ten=0;int five=0;

    /**
     * Constructor
     * @param hundred - int hundred
     * @param fifty - int fifty
     * @param twenty - int twenty
     * @param ten - int ten
     * @param five - int five
     */
    public Receipts (int hundred, int fifty, int twenty, int ten, int five){
        this.hundred=hundred;
        this.fifty=fifty;
        this.twenty=twenty;
        this.ten=ten;
        this.five=five;
    }

    /**
     * @param receiptHundred - sets hundred bills value
     */
    //setters set all the amount(s) of bills
    public void setHundreds(int receiptHundred){
        hundred=receiptHundred;
    }

    /**
     * @param receiptFifty - sets fifty bills value
     */
    public void setFifty(int receiptFifty){
        fifty=receiptFifty;
    }

    /**
     * @param receiptTwenty - sets twenty bills value
     */
    public void setTwenty(int receiptTwenty){
        twenty=receiptTwenty;
    }

    /**
     * @param receiptTen - sets ten bills value
     */
    public void setTen(int receiptTen){
        ten=receiptTen;
    }

    /**
     * @param receiptFive - sets five bills value
     */
    public void setFive(int receiptFive){
        five=receiptFive;
    }

    /**
     * @return hundred - gives a 100 dollar bill
     */
    //getters output the amount(s) of bills
    public int getHundred(){
        return hundred;
    }

    /**
     * @return fifty - gives a 50 dollar bill
     */
    public int getFifty(){
        return fifty;
    }

    /**
     * @return - gives a 20 dollar bill
     */
    public int getTwenty(){
        return twenty;
    }

    /**
     * @return - gives a 10 dollar bill
     */
    public int getTen(){
        return ten;
    }

    /**
     * @return five - gives a 5 dollar bill
     */
    public int getFive(){
        return five;
    }

    /**
     * This prints out the withdrawn amount of bills
     */
    //prints the amount of bills for withdraw
  public String withdraw() {
    return  "************************************"+
    "\n*Hundred(s):           "+ hundred     +
    "\n*Fiftie(s):            "+ fifty       +
    "\n*Twentie(s):           "+ twenty      +
    "\n*Ten(s):               "+ ten         +
    "\n*Five(s):              "+ five        +
    "\n**********************************";
  }
}