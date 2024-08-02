public class Cat extends Animal{
    int age;
    boolean fixed;
    String color;
    String name;
    double weight;

    Cat(){

    }

    Cat(String name){
        this.name = name;
    }

    @Override
    public void speak(){
        System.out.println(name + " goes meow");
    }
}
