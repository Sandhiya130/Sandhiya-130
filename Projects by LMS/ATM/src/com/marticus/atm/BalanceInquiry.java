package com.marticus.atm;

public class BalanceInquiry extends App
{
    static double balance = 0;
    public void setBalance(double b)
    {
        balance = b;
    }
    public static double getBalance()
    {
        return balance;
    }   
}