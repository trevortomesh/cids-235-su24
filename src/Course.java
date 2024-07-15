public class Course {
    //private Student[] classList;
    //private Faculty faculty;
    /*public void addStudent(Student s){
        //deal with this later...//
    }

    public void setFaculty(Faculty faculty){
        //deal with this later...//
    }*/

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        // ????
    }
}
