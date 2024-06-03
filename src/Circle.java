public class Circle {
    /** The radius of the Circle **/

    double radius = 1; // Data fields


    // CONSTRUCTORS *************************************
    Circle(){
    }

    Circle(double newRadius){
        radius = newRadius;
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

}
