import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //Scanner input = new Scanner(System.in);
        //int[] numbers = new int[10];
        /*
        Cat genki = new Cat();
        Cat haku = new Cat();

        genki.name = "Genki";
        genki.age = 1;
        genki.color = "orange";
        genki.weight = 13.0;

        haku.name = "Haku";
        haku.age = 4;
        haku.color = "Tuxedo";
        haku.fixed = true;
        haku.weight = 10.5;
        */
        //System.out.println(genki.name);
        /* PROCEDURAL WAY

        int age = 1;
        boolean fixed = true;
        String color = "orange";
        String name = "Genki";
        double weight = 15.5;

        String name2 = "Haku";
        int age2 = 4;
        boolean fixed2 = true;
        String color2 = "Black and White";
        double weight2 = 10.5;

     */
        /*
        System.out.println("My cat's name is " + genki.name +
                " he is " + genki.age + " years old " +
                "and he is " + genki.color + "!" +
                " He weighs " + genki.weight + " lbs");

         */
        /*
        Circle circle = new Circle(2.0);
        System.out.println(circle.radius);
        circle.setRadius(13);
        System.out.println("circumference of circle is: " + circle.getPerimeter());
        System.out.println("The area of circle is: " + circle.getArea());

        Circle circle2 = new Circle();
        System.out.println(circle2.radius);

        Circle c = new Circle(1.2);
        System.out.println("Value of c is: " + c);

        Circle d = c;
        System.out.println("Value of d is: " + d);

        d.radius = 1.0;
        System.out.println("The radius of c is now: " + c.radius);

        Dog mocha = new Dog();

         */

        /*
        Cat genki = new Cat();
        Cat haku = new Cat();
        System.out.println("genki's address is: " + genki);
        System.out.println("haku's address is: " + haku);

        System.out.println("setting haku = genki");
        haku = genki;
        System.out.println("haku's address is now: " + haku);
        System.out.println("genki's address is now: " + genki);
        haku.name = "Haku";
        System.out.println("Haku's name is now " + haku.name);
        System.out.println("Genki's name is now " + genki.name);
*/

        Circle circle1 = new Circle();  // creating a circle object with default radius (1)
        Circle circle2 = new Circle(5); // creating a circle object with radius of 5
        //Circle.numberOfObjects = 12;

        System.out.println("The perimeter of the circle is: " + circle1.getPerimeter());

        circle1.setRadius(12);
        System.out.println("The radius of the circle1 is now: " + circle1.getRadius());
        System.out.println("There are " + Circle.getNumberOfObjects() + " circles!");



       // System.out.println(Circle.getNumberOfObjects());
        //System.out.println(circle1.getNumberOfObjects());

    }
}

