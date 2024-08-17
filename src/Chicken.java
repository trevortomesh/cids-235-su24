public class Chicken extends Animal implements Edible{

    @Override
    public String speak(){
        return "Chicken: cock-a-doodle-doo!";
    }

    @Override
    public String howToEat(){
        return "Chicken: Fry it!";
    }
}
