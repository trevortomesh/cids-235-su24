public class Dog extends Animal{
    private String name;
    Dog(String name){
        this.name = name;
        //System.out.println("Dog go woof!");
    }
    @Override
    public String speak(){
        return "Dog Goes Woof!";
    }
}