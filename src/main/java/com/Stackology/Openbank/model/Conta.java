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

public abstract class Conta {

  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total = 0;

 
  public Conta(int agencia, int numero) {
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = 100;
    System.out.println("Conta criada com sucesso!");
  }

  
    
  public abstract void deposita(double valor);

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if (agencia <= 0){
            System.out.println ("inválido");
            return;          
        }
    }

    public int getNumero(){
        return this.numero;
    }


    public void setNumero(int numero){
        
        if (numero <= 0){
            System.out.println ("inválido");
        return;
    }
}	
    public Cliente getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
}


