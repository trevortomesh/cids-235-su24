public class Circle {
    /** The radius of the Circle **/

    private double radius; // Data fields
    private static int numberOfObjects = 0;
    //System.out.println(newRadius);

    // CONSTRUCTORS *************************************
    Circle(){
        this(1.0);
        //System.out.println("Default called... setting radius to 1.0");
    }

    Circle(double radius){
        this.radius = radius;
        numberOfObjects++;
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
        return this.radius;
    }

    double getPerimeter(){
        return 2 * this.radius * Math.PI;
    }

    double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    //*******************************************

    public static int getNumberOfObjects(){ //getter method for numberOfObjects
        return numberOfObjects;
    }

}
