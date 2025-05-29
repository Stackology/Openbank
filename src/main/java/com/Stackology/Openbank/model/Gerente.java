package com.Stackology.Openbank.model;

public class Gerente extends Funcionario {

    private double salario;
    private String senha;
    
    //private int senhaTentativas;
    
    public double getBonificacao(){
        System.out.println("Gerente Bonificação: ");
        return getBonificacao() + super.getSalario();
    }

    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

