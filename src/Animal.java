abstract class Animal {
    private double weight;

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    abstract String speak();

}
