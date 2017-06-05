package com.example.supawit.moneykeeper;

/**
 * Created by Supawit on 6/4/2017.
 */

public class Account {
    private int Income;
    private int Expense;
    private int total;

    public Account(){
         Income = 0;
         Expense = 0;
         total = 0;
    }

    public void setIncome(int income)
    {
        this.Income = income;
    }

    public void setExpense(int Expense)
    {
        this.Expense = Expense;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public int getIncome(){
        return this.Income;
    }
    public int getExpense(){
        return this.Expense;
    }
    public int getTotal(){
        return this.total;
    }





}
