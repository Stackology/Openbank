package com.Stackology.Openbank.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */

public abstract class Account {

  protected double balance;
  private int agency;
  private int number;
  private Cliente holder;
  private static int total = 0;

 
  public Account(int agency, int number) {
    this.agency = agency;
    this.number = number;
    this.balance = 100;
    System.out.println("Account successfully created!");
  }

  
    
  public abstract void deposit(double value);

    public boolean saca(double value){
        if(this.balance >= value){
            this.balance = this.balance - value;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double value, Account destino){
        if(this.balance >= value){
            this.balance -= value;
            destino.deposit(value);
            return true;
        }else{
            return false;
        }
    }
    public double getbalance(){
        return this.balance;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public int getagency(){
        return this.agency;
    }

    public void setagency(int agency){
        if (agency <= 0){
            System.out.println ("invalid");
            return;          
        }
    }

    public int getnumber(){
        return this.number;
    }


    public void setnumber(int number){
        
        if (number <= 0){
            System.out.println ("inválido");
        return;
    }
}	
    public Cliente getholder(){
        return this.holder;
    }

    public void setholder(Cliente holder){
        this.holder = holder;
    }

    public static int gettotal(){
        return Account.total;
    }
    
}


