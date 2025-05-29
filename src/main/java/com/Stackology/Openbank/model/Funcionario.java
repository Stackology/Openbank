package com.Stackology.Openbank.model;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    private String cargo;
    private String dataEntrada;
    private String dataNascimento;
    private String rg;
    private String endereco;
    private String telefone;
    private String email;

    private String senha;

    /*public Funcionario(String nome, String cpf, double salario, String cargo, String dataEntrada, String dataNascimento, String rg, String endereco, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
        this.dataEntrada = dataEntrada;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    */
    
    public abstract double getBonificacao();
    //{ return this.salario * 0.5;    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }
    
}
