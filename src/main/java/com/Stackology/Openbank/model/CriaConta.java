package com.Stackology.Openbank.model;

import com.Stackology.Openbank.model.ContaCorrente;

/**
 *
 * @author Stackology
 * 
 * 
 */
public class CriaConta {

    public static Conta primeiraConta = new ContaCorrente(22, 33);


    public static void main(String[] args) {

        final Conta ContaCorrente = new ContaCorrente(5678,413);

        primeiraConta.deposita (300);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita (100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new ContaCorrente(235,6789);
        segundaConta.deposita (2000);

        System.out.println(primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());

    }

}
