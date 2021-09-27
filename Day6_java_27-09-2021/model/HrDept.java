package com.torryharris.model;

import com.torryharris.exception.ClLimitExceededException;
import com.torryharris.exception.InvalidClRequestException;

public class HrDept {


    public void requestCL(Employee emp, int noOfDays) throws ClLimitExceededException, InvalidClRequestException {
        if(noOfDays>3)
        {
            throw new InvalidClRequestException("Invalid CL Request Exception");
        }
        if(emp.getBALANCE_CL()<noOfDays)
        {
            throw new ClLimitExceededException("CL Limit Exceeded Exception");
        }
        else
        {
            System.out.println("CL Approved for "+noOfDays+" days to "+emp.getName());
            emp.setBALANCE_CL(emp.getBALANCE_CL()-noOfDays);
            System.out.println("Balance CL: "+emp.getBALANCE_CL());

        }



    }
}
