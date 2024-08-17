import org.w3c.dom.css.Rect;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

Object[] objects = {new Tiger(), new Chicken(), new Apple()};

for(int i = 0; i < objects.length; i+x+){
    if(objects[i] instanceof Edible){
        System.out.println(((Edible)objects[i]).howToEat());
    }
    if(objects[i] instanceof Animal){
        System.out.println(((Animal)objects[i]).speak());
    }
}

//
//        GeometricObject geoObject1 = new Circle(5);
//        GeometricObject geoObject2 = new Rectangle(5, 3);
//
//        System.out.println("The two objects have the same area? " +
//                equalArea(geoObject1, geoObject1));
        //GeometricObject o1 = new GeometricObject();
        //Circle c1 = new Circle(7.0);
        //System.out.println(c1.getColor());
        //GeometricObject o1 = new GeometricObject();
//        Rectangle r1 = new Rectangle(5.0,2.0);
//        Student s1 = new Student();
//
     //   displayObject(c1);
//        displayObject(r1);
//        displayObject(s1);
        //displayObject(new Faculty());

       // Object o = new Student();
       // Object x = new Circle();
       // m(o);
       // Student b = (Student) o;
       // m(b);



//        m(new GraduateStudent());
//        Object o = new Student();
//        Student a = new GraduateStudent();
//        GeometricObject b = new Circle();

//        int x = 5;
//        double y = x;
//        System.out.println(y);
//        int z = (int) y;
//        System.out.println(z);

        //Student m = new Object();
        //m(o);
//        m(new Student());
//        m(new Person());
//        m(new Object());

       // Circle a = new Object();
        //GeometricObject a = new Circle();
        /*Object o = new GeometricObject();
        Object p = new Object();
        System.out.println(o.toString());
        System.out.println(p.toString());*/

        /*
        String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(array);
        System.out.println(list);

        String[] array1 = new String[list.size()];
        list.toArray(array1);
        System.out.println(array1[0]);


       Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
       java.util.Collections.sort(list);
       java.util.Collections.shuffle(list);
       System.out.println(list);*/
        //displayObject(new Circle(1,"red",false));
        //displayObject(new Rectangle(1,1,"black",true));

    }



    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }

    public static void m(Object x){  //Object x = new Student();
        System.out.println(x.toString());
    }
    /** Display geometric object properties**/

    public static void displayObject(Object object){
        if (object instanceof Circle){
            System.out.println("The circle area is " + ((Circle)object).getArea());
            System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        }
        else if(object instanceof Rectangle){
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }
        else{
            System.out.println(object);
        }

    }

    public static Circle[] createCircleArray(){
        Random rand = new Random();
        Circle[] circleArray = new Circle[10];  //define an array of 10 circles

        for(int i = 0; i < circleArray.length; i++){

            circleArray[i] = new Circle(rand.nextInt(10)+1);
            //System.out.println("Circle created with radius of " + circleArray[i].getRadius());
        }
        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i = 0; i < circleArray.length; i++){
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("-----------------------------------");
        System.out.println("The total area of the circles is: " + sum(circleArray));
    }

    public static double sum(Circle[] circleArray){
        double sum = 0;

        for(int i = 0; i < circleArray.length; i++){
            sum += circleArray[i].getArea();
        }
        return sum;

    }

    public static void printInt(int a){
        System.out.println("in method: you passed the value " + a);
        System.out.println("in method: changing value of a to 0");
        a = 0;
        System.out.println("in method: a is now " + a);

    }

    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " +
                c.getRadius() + " is " + c.getArea());
                //c.setRadius(100);
    }
}

