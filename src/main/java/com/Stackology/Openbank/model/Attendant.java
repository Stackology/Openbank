package com.Stackology.Openbank.model;

public class Attendant extends Employee {
    private String password;

    public Attendant(String nome, String cpf, double wage, String password) {}

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    
    public double getBonus() {
        System.out.println("ATTENDANT BONUS");
        return getBonus() + 100;
        }

    }

    

