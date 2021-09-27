package com.torryharris.driver;

import com.torryharris.exception.ClLimitExceededException;
import com.torryharris.exception.InvalidClRequestException;
import com.torryharris.model.Employee;
import com.torryharris.model.HrDept;

public class EmployeeDemo {
    public static void main(String[] args){
        Employee ram=new Employee(1,"Ram","Manager",50000);
        Employee sita=new Employee(2,"Sita","Business Analyst",50000);
        HrDept hr=new HrDept();
        try
        {
            hr.requestCL(ram,3);
            hr.requestCL(ram,3);
            hr.requestCL(ram,3);
            hr.requestCL(ram,3);
            hr.requestCL(sita,3);

        }
        catch(InvalidClRequestException | ClLimitExceededException ex)
        {
            System.err.println(ex);
        }
    }
}
