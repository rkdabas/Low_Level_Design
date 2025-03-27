package org.example.ProxyDesignPattern;

public class Main {
    public static void main(String args[]){
        try{
            EmployeeDao employeeObj=new EmployeeDaoProxy();
//            employeeObj.create("USER",new EmployeeDo());
            employeeObj.create("ADMIN",new EmployeeDo());
            System.out.println("operation successful");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
