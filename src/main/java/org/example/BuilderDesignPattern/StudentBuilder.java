package org.example.BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollnumber;
    int age;
    String name;
    String fathername;
    String mothername;
    List<String> subjects;

    public StudentBuilder setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFathername(String fathername) {
        this.fathername = fathername;
        return this;
    }

    public StudentBuilder setMothername(String mothername) {
        this.mothername = mothername;
        return this;
    }

    abstract public StudentBuilder setSubject();

    public Student build(){
        return new Student(this);
    }
}
