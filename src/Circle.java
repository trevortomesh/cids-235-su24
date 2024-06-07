public class Circle {
    /** The radius of the Circle **/

    double radius; // Data fields
    static int numberOfObjects = 0;

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
    void setRadius(double newRadius){
        radius = newRadius;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    //*******************************************

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

}
