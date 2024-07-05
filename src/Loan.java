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
        /*
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        loanDate = new java.util.Date();
        */
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

    /**
     * Getter: return the loan amount
     * @return loanAmount
     */

    public double getLoanAmount(){
        return loanAmount;
    }

    /**
     * setter: sets the loan amount
     * @param loanAmount - amount to be set
     */
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    /**
     *  getMonthlyPayment: computes the monthly amount owing from
     *  the annual interest rate and loan amount.
     * @return monthlyPayment - the computing monthly amount owing
     */
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    /**
     * getTotalPayment - returns the computing total for the loan
     * @return totalPayment
     */
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /**
     * getter -- returns the loan date
     * @return loanDate - datafield storing the date loan was created
     */
    public java.util.Date getLoanDate(){
        return loanDate;
    }

}
