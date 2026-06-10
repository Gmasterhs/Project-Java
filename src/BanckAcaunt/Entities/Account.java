package BanckAcaunt.Entities;

import BanckAcaunt.Exceptions.DomainException;

public class Account
{
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    // Constructor

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //Getters and Setters

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    //Methods

    public void Deposit(Double amount)
    {
        if (amount < 0.0 || amount == 0)
        {
            throw new IllegalArgumentException ("Deposit amount must be greater to zero");
        }
        this.balance += amount;
    }

    public void Withdraw(Double amount) throws DomainException
    {
        // Testa se o saque passou do limite estipulado
        if (amount > withdrawLimit)
        {

            throw new DomainException ("The amount exceeds witchdrow limit");
        }
        // Testa se o saque é maior do que o saldo que você realmente tem
        if (amount > this.balance)
        {
            throw new DomainException("Not enough balance");
        }
        this.balance -= amount;
    }
}
