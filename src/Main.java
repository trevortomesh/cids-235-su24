import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //int[] numbers = new int[10];
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

        System.out.println("My cat's name is " + genki.name +
                " he is " + genki.age + " years old " +
                "and he is " + genki.color + "!" +
                " He weighs " + genki.weight + " lbs");

        Circle circle = new Circle(2.0);
        System.out.println(circle.radius);

    }
}