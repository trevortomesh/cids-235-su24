public class Axolotl extends Animal {
    String name;
    Axolotl(String name){
        //System.out.println("I'm not a fish!");
        this.name = name;
    }

    @Override
    public void speak(){
        super.speak(name);
    }

}
