package com.Stackology.Openbank.model;

public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero) {
        super(numero, agencia);
    }
    
    @Override
    public boolean saca(double valor) {
        double valorDeSaque = valor + 0.2;
        // TODO Auto-generated method stub
        return super.saca(valorDeSaque);
    }

    @Override
    public void deposita(double valor){
        super.saldo = super.saldo + valor;
    }
}
