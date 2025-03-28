package org.example.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        List<String>subjs=new ArrayList<>();
        subjs.add("DSA");
        subjs.add("Finance");
        this.subjects=subjs;
        return this;
    }
}
