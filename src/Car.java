public class Car {
    private Engine engine;
    private Airfreshener[] airfresheners;
    public Car(){
        this.engine = new Engine();
    }

    public void move(){
        engine.work();
        System.out.println("The car is moving!");
    }
}
