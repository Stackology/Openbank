package com.Stackology.Openbank.model;

/**
 * SavingsAccount is a class that represents a savings account.
 * It inherits from Account and allows deposit operations.
 * 
 * Palavra nova em inglês: "inherit" (herdar)
 * Exemplo de uso: "The SavingsAccount class inherits from Account."
 */
public class SavingsAccount extends Account {
    /**
     * Constructor for SavingsAccount.
     * @param agency agency number
     * @param number account number
     */
    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    /**
     * Performs a deposit into the account.
     * @param value amount to deposit
     */
    public void deposit(double value) {
        this.balance += value;
    }
}
