package com.Stackology.Openbank.model;

/**
 * BonusControl is a class responsible for managing the sum of bonuses of employees.
 * It provides methods to register bonuses and retrieve the total sum.
 *
 * Palavra nova em inglês: "retrieve" (recuperar, obter)
 * Exemplo de uso: "You can retrieve the total bonus using the getTotal method."
 */
public class BonusControl {
    // Variável que armazena a soma total das bonificações
    private double total;

    /**
     * Registra a bonificação de um funcionário.
     * @param employee funcionário cuja bonificação será registrada
     */
    public void register(Employee employee) {
        double bonus = employee.getBonus();
        this.total = this.total + bonus;
    }

    /**
     * Recupera a soma total das bonificações registradas.
     * @return soma total das bonificações
     */
    public double getTotal() {
        return total;
    }
}