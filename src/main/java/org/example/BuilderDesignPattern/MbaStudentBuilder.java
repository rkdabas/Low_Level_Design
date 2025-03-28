package org.example.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> subjs=new ArrayList<>();
        subjs.add("Economics");
        subjs.add("Business");
        this.subjects=subjs;
        return this;
    }
}
