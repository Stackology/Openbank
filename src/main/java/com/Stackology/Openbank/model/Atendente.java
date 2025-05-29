package com.Stackology.Openbank.model;

public class Atendente extends Funcionario {
    private String senha;

    public Atendente(String nome, String cpf, double salario, String senha) {}

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public double getBonificacao() {
        System.out.println("BONIFICAÇÃO DO ATENDENTE");
        return getBonificacao() + 100;
        }

    }

    

