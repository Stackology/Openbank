package com.Stackology.Openbank.model;





public class Customer {
    
    private String name;
    private String cpf;
    private String profession;
    private double salary;
    private String position;
    private String entryDate;
    private String birthDate;
    private String rg;
    private String address;
    private String phone;
    private String email;

    private String password;

  public Customer(String name, String cpf, String profession) {
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;
        this.salary = 0.0; // Default salary
        this.position = position; // Default position
        this.entryDate = entryDate; // Default entry date
        this.birthDate = birthDate; // Default birth date
        this.rg = rg; // Default RG
        this.address = address; // Default address
        this.phone = phone; // Default phone number
        this.email = email; // Default email
        this.password = password; // Default password

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
 