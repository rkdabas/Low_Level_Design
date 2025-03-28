package org.example.BuilderDesignPattern;

import java.util.List;

public class Student {
    int rollnumber;
    int age;
    String name;
    String fathername;
    String mothername;
    List<String> subjects;

    public Student(StudentBuilder builder){
        this.rollnumber=builder.rollnumber;
        this.age=builder.age;
        this.name=builder.name;
        this.fathername=builder.fathername;
        this.mothername=builder.mothername;
        this.subjects=builder.subjects;
    }

    public String toString(){
        return ""+ " rollnumber="+this.rollnumber+
                " age="+this.age+
                " name="+this.name+
                " fathername="+this.fathername+
                " mothername="+this.mothername+
                " subjects="+subjects.get(0) + "," + subjects.get(1);
    }
}
