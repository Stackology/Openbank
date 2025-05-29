package com.Stackology.Openbank.model;

public class ContaPoupanca extends Conta{
        public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);     
        }
    public void deposita(double valor){
        this.saldo += valor;
    }
}
