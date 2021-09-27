package com.torryharris.model;

import com.torryharris.exception.InsufficientFundException;
import com.torryharris.exception.WithdrawLimitExceededException;

public class Person {
    private final int DAILY_WITHDRAW_LIMIT=40000; //Constant - Variable Name in Capital Letters
    private String name;
    private int accountNumber;
    private int balance;
    private int totalAmountWithdrawn=0;

    public Person(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void withdrawAmount(int amount) throws WithdrawLimitExceededException, InsufficientFundException {
        if(amount>balance)
        {
            throw new InsufficientFundException("Insufficient Fund!!");
            //return;
        }
        if(totalAmountWithdrawn+amount > DAILY_WITHDRAW_LIMIT)
        {
            throw new WithdrawLimitExceededException("Withdraw Limit Exceeded!!");
        }
        balance-=amount;
        totalAmountWithdrawn+=amount;
        System.out.println(name+" has withdrawn amount "+amount);
        System.out.println("Total Amount Withdrawn Today: "+totalAmountWithdrawn);
        System.out.println("Balance: "+balance+"\n");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
