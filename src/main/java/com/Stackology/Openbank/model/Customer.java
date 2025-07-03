package com.Stackology.Openbank.model;





public class Customer {
    
    private String name;
    private String cpf;
    private String profession;

  public Customer(String name, String cpf, String profession) {
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getprofession() {
        return profession;
    }

    public void setProfessionw(String profession) {
        this.profession = profession;
    }
    
    
    
}
 