package org.example.BuilderDesignPattern;

public class Client {
    public static void main(String args[]){
        Director directorObj1=new Director(new EngineeringStudentBuilder());
        Director directorObj2=new Director(new MbaStudentBuilder());

        Student engineeringStudent=directorObj1.createStudent();
        Student mbaStudent=directorObj2.createStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
