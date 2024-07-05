import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // ask for annual interest rate
    System.out.print("Enter annual interest rate (ex. 8.25): ");
    double annualInterestRate = input.nextDouble();

    // ask for number of years
    System.out.print("Enter number of years as an int: ");
    int numberOfYears = input.nextInt();

    // ask for loan amount
    System.out.print("Enter loan amount (ex. 120000.95): ");
    double loanAmount = input.nextDouble();

    Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

    // Display loan date, monthy payment and total payment
        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());







    }

    public static Circle[] createCircleArray(){
        Random rand = new Random();
        Circle[] circleArray = new Circle[10];  //define an array of 10 circles

        for(int i = 0; i < circleArray.length; i++){

            circleArray[i] = new Circle(rand.nextInt(10)+1);
            //System.out.println("Circle created with radius of " + circleArray[i].getRadius());
        }
        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i = 0; i < circleArray.length; i++){
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("-----------------------------------");
        System.out.println("The total area of the circles is: " + sum(circleArray));
    }

    public static double sum(Circle[] circleArray){
        double sum = 0;

        for(int i = 0; i < circleArray.length; i++){
            sum += circleArray[i].getArea();
        }
        return sum;

    }

    public static void printInt(int a){
        System.out.println("in method: you passed the value " + a);
        System.out.println("in method: changing value of a to 0");
        a = 0;
        System.out.println("in method: a is now " + a);

    }

    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " +
                c.getRadius() + " is " + c.getArea());
                //c.setRadius(100);
    }
}

