public class Main {
    public static void main(String[] args) {

        Cat genki = new Cat();
        Cat glitch = new Cat();

        genki.name = "Genki";
        genki.age = 1;
        genki.color = "orange";

        System.out.println(genki.name);
        int age = 1;
        boolean fixed = true;
        String color = "orange";
        String name = "Genki";
        double weight = 15.5;

        String name2 = "Glitch";
        int age2 = 13;
        boolean fixed2 = true;
        String color2 = "Black and White";
        double weight2 = 13.0;

        System.out.println("My cat's name is " + genki.name +
                " he is " + genki.age + " years old " +
                "and he is " + genki.color + "!");

    }
}