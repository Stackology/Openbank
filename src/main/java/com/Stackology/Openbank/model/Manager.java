package com.Stackology.Openbank.model;

/**
 * Manager is a class that represents a manager employee in the system.
 * It extends Employee and adds authentication and bonus logic.
 *
 * Palavra nova em inglês: "extends" (estende)
 * Exemplo de uso: "The Manager class extends Employee."
 */
public class Manager extends Employee {

    private double salary;
    private String password;
    // private int passwordAttempts;

    /**
     * Calculates the manager's bonus.
     * @return bonus value
     */
    @Override
    public double getBonus() {
        System.out.println("Manager Bonus: ");
        // Corrigido para evitar recursão infinita
        return super.getSalary();
    }

    /**
     * Authenticates the manager using the provided password.
     * @param password password to authenticate
     * @return true if authenticated, false otherwise
     */
    public boolean authenticate(String password) {
        return this.password != null && this.password.equals(password);
    }

    /**
     * Gets the manager's salary.
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the manager's salary.
     * @param salary salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Gets the manager's password.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the manager's password.
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

