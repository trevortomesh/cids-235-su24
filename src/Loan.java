// file: Loan.java
// author: Trevor Tomesh
// course: CIDS 235
// date: July 5th 2024
// description:
//              class for creating loan objects. Includes methods
//              for computing the monthly and total payments
//----------------------------------------------------------------

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default Constructor**/
    public Loan(){
        this(2.5, 1, 1000);
    }

    /** Construct a loan with specific annual interest rate,
    number of years, and loan amount **/
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /**
     * Getter: returns the annualInterestRate
     * @return annualInterestRate
     */
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    /**
     * Setter: sets annual interest rate
     * @param annualInterestRate - interest rate to set
     */
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Getter: get number of years for loan
     * @return numberOfYears
     */
    public int getNumberOfYears(){
        return numberOfYears;
    }

    /**
     * Setter: set number of years for loan
     * @param numberOfYears - integer number of years for loan
     */

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

}
