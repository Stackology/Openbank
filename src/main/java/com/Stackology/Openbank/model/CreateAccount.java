package com.Stackology.Openbank.model;

import com.Stackology.Openbank.model.CurrentAccount;

/**
 * CreateAccount is a class responsible for demonstrating the creation and manipulation of accounts.
 *
 * Palavra nova em inglês: "demonstrate" (demonstrar)
 * Exemplo de uso: "This class demonstrates how to create and use accounts."
 *
 * @author Stackology
 */
public class CreateAccount {

    // Primeira conta criada como exemplo
    public static Account firstAccount = new CurrentAccount(22, 33);

    public static void main(String[] args) {
        // Criação de uma conta corrente
        final Account currentAccount = new CurrentAccount(5678, 413);

        // Depósito de 300 na primeira conta
        firstAccount.deposit(300);
        System.out.println(firstAccount.getBalance());

        // Depósito de 100 na primeira conta
        firstAccount.deposit(100);
        System.out.println(firstAccount.getBalance());

        // Criação de uma segunda conta e depósito
        Account secondAccount = new CurrentAccount(235, 6789);
        secondAccount.deposit(2000);

        // Impressão dos saldos
        System.out.println(firstAccount.getBalance());
        System.out.println(secondAccount.getBalance());
    }
}
