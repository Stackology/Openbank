package com.Stackology.Openbank.model;

/**
 * Employee is an abstract class that represents a generic employee in the system.
 * It contains personal and professional information, as well as methods for accessing and modifying these attributes.
 *
 * Palavra nova em inglês: "attribute" (atributo)
 * Exemplo de uso: "The salary is an important attribute of the Employee class."
 */
public abstract class Employee {
    private String name;
    private String cpf;
    private double salary;

    private String position;
    private String entryDate;
    private String birthDate;
    private String rg;
    private String address;
    private String phone;
    private String email;

    private String password;

    /*
     * Construtor comentado para referência futura.
     * public Employee(String name, String cpf, double salary, String position, String entryDate, String birthDate, String rg, String address, String phone, String email, String password) {
     *     this.name = name;
     *     this.cpf = cpf;
     *     this.salary = salary;
     *     this.position = position;
     *     this.entryDate = entryDate;
     *     this.birthDate = birthDate;
     *     this.rg = rg;
     *     this.address = address;
     *     this.phone = phone;
     *     this.email = email;
     *     this.password = password;
     * }
     */

    /**
     * Método abstrato para obter a bonificação do funcionário.
     * @return valor da bonificação
     */
    public abstract double getBonus();

    /**
     * Obtém o nome do funcionário.
     * @return nome
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome do funcionário.
     * @param name nome
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtém o CPF do funcionário.
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do funcionário.
     * @param cpf cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o salário do funcionário.
     * @return salário
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Define o salário do funcionário.
     * @param salary salário
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Obtém o cargo do funcionário.
     * @return cargo
     */
    public String getPosition() {
        return position;
    }

    /**
     * Define o cargo do funcionário.
     * @param position cargo
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Obtém a data de entrada do funcionário.
     * @return data de entrada
     */
    public String getEntryDate() {
        return entryDate;
    }

    // Métodos para birthDate, rg, address, phone, email e password podem ser adicionados conforme necessário.
}
