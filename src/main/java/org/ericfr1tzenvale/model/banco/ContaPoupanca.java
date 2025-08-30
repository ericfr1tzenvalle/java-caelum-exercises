/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.banco;

import org.ericfr1tzenvale.model.banco.Conta;

/**
 *
 * @author Luísa
 */
public class ContaPoupanca implements Conta{
    private double saldo;
    @Override
    public void atualizar(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
    
    @Override
    public String toString() {
        return "ContaPoupança  saldo:" + this.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
}
