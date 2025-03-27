package org.example.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client,EmployeeDo obj) throws Exception{
        System.out.println("creating new row in employee table");
    }

    @Override
    public void delete(String client,int employeeId) throws Exception{
        System.out.println("delete row with employeeId");
    }

    @Override
    public EmployeeDo get(String client,int employeeId) throws Exception{
        System.out.println("fetching data from DB");
        return new EmployeeDo();
    }
}
