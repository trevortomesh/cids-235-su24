public class Employee extends Person {
    public Employee(){
        //super();
        this("(2) Invokes Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
