/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.empresa.model;

/**
 *
 * @author Luísa
 */
public class ControleBonificacao {

    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        System.out.println("Adicionando bonificação do funcionario: " + f);
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }

}
