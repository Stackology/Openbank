package com.Stackology.Openbank.model;

public class CurrentAccount extends Account{
    public CurrentAccount(int agency, int number) {
        super(number, agency);
    }
    
    @Override
    public booleanbag(double value) {
        double WithdrawalValue = value + 0.2;
        // TODO Auto-generated method stub
        return super.saca(WithdrawalValue);
    }

    @Override
    public void deposit(double value){
        super.balance = super.balance + value;
    }
}
