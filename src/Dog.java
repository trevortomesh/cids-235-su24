public class Dog extends Animal{
    private String name;
    Dog(String name){
        this.name = name;
        //System.out.println("Dog go woof!");
    }
    @Override
    public void speak(){
        System.out.println(name + " goes woof!");
    }
}