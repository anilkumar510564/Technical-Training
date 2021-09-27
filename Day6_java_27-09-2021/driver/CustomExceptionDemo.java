package com.torryharris.driver;

import com.torryharris.exception.InsufficientFundException;
import com.torryharris.exception.WithdrawLimitExceededException;
import com.torryharris.model.Person;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Person ram=new Person("Ram",12001,50000);
        try
        {
            ram.withdrawAmount(30000);
            ram.withdrawAmount(10000);
            ram.withdrawAmount(20000);

        }
        /*catch(WithdrawLimitExceededException ex)
        {
            System.err.println(ex);
        }
        catch(InsufficientFundException ax)
        {
            System.err.println(ax);
        }*/
        catch(WithdrawLimitExceededException | InsufficientFundException ex)
        {
            System.err.println(ex);
        }
        finally
        {
            System.out.println("In the Finally block of code");
        }



    }
}
