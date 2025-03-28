package org.example.BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MbaStudentBuilder){
            return createMbaStudent();
        }
        return null;
    }


    private Student createEngineeringStudent(){
        return studentBuilder.setRollnumber(1).setAge(22).setName("Ram").setSubject().build();
    }

    private Student createMbaStudent(){
        return studentBuilder.setRollnumber(2).setAge(25).setName("Sham").setFathername("Ghanshyam").setSubject().build();
    }


}
