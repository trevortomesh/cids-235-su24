public class Circle {
    /** The radius of the Circle **/

    private double radius; // Data fields
    private static int numberOfObjects = 0;

    // CONSTRUCTORS *************************************
    Circle(){
        radius = 1.0;
        numberOfObjects++;
    }

    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
//*******************************************************

    //********* METHODS **************************
    void setRadius(double newRadius){ //setter method to set variable
        radius = newRadius;
    }

    double getRadius(){
        return radius;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    //*******************************************

    static int getNumberOfObjects(){ //getter method for numberOfObjects
        return numberOfObjects;
    }

}
