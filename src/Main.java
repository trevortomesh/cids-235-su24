import org.w3c.dom.css.Rect;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {



        /*
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Cameron");
        cityList.add("Mendota Heights");
        cityList.add("New Richmond");
        cityList.add("Sarona");
        cityList.add("River Falls");

        System.out.println(cityList.size());
        System.out.println(cityList.indexOf("Sarona"));
        cityList.add("Roberts");
        System.out.println(cityList.size());
        System.out.println(cityList);
        System.out.println(cityList.isEmpty());
        System.out.println(cityList.get(3));
        cityList.set(3, "Woodbury");
        System.out.println(cityList.get(3));
        cityList.remove("River Falls");
        System.out.println(cityList);
        cityList.clear();
        System.out.println(cityList);

        /*
        //int a = 5;
        //System.out.println("a is " + a);
        //Integer a = new Integer("5");
        Integer a = Integer.valueOf("5"); // set a's value to 5
        System.out.println(a);

        //Double b = new Double("2.4");
        Double b = a.doubleValue(); // set b's value to 2.4
        System.out.println(b);

        Double c = Double.valueOf("3.5");
        Integer d = c.intValue();
        System.out.println(d);

        //Integer x1 = new Integer("32");
        //Integer x2 = new Integer("32");
        Integer x1 = Integer.valueOf("32");
        Integer x2 = Integer.valueOf("32");
        Integer x3 = 32;

        System.out.println(Long.MAX_VALUE);
        //Long z = 9223372036854;
        BigInteger z = new BigInteger("922337203685477580789");
        System.out.println(z);

        BigDecimal x = new BigDecimal("1.123456789012345678901234567890");
       // double x = 1.123456789123456783453453453345345345345345345345345345345334523453453453454534534591234;
        System.out.println(x);

        /*
        System.out.println(z);
        System.out.println("x1 is " + x1);
        System.out.println("x2 is " + x2);
        System.out.println("x3 is " + x3);

        System.out.println(x1 == x2);
        System.out.println(x2 == x3);
         */

        /*
        System.out.println(c.toString());



        Cat haku = new Cat("Haku");
        System.out.println(haku.toString());
        Circle c1 = new Circle();
        System.out.println(c1); //equivalent to System.out.println(c1.toString());
        */
        /*
        haku.speak();

        Axolotl wooper = new Axolotl("Wooper");
        wooper.speak();

        Dog scooby = new Dog("Scooby");
        scooby.speak();*/

        //Faculty bilbo = new Faculty();

        //Circle c1 = new Circle(12.0, "red", true);
        //System.out.println(c1.toString());

        //Rectangle rect = new Rectangle(20,5,"purple", true);
        //System.out.println(rect.toString());

        /*
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
*/

        //Engine engine = new Engine();
        //System.out.println("I have an engine called " + engine.toString());
     //   Car car = new Car();
     //   car.move();

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

