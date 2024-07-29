public class Circle extends GeometricObject {
    /** The radius of the Circle **/

    private double radius; // Data fields
    //private static int numberOfObjects = 0;
    //System.out.println(newRadius);

    // CONSTRUCTORS *************************************
    public Circle(){
        this(1.0);
        //System.out.println("Default called... setting radius to 1.0");
    }

   public Circle(double radius){
        this.radius = radius;
        //numberOfObjects++;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
//*******************************************************

    //********* METHODS **************************
    void setRadius(double radius){ //setter method to set variable
        // ensure there is no radius <= 0
        if(radius > 0) {
            this.radius = radius;
        }
        else{
            this.radius = 1.0;
        }
    }

    double getRadius(){
        return radius;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("Circle created: " + super.getDateCreated() + "\nradius: " + radius);
    }
    //*******************************************

    /*
    public static int getNumberOfObjects(){ //getter method for numberOfObjects
        return numberOfObjects;
    }*/

}
