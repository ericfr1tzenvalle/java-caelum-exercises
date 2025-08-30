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
public class ContaCorrente implements Conta,Tributavel{

    
    private double saldo;
    @Override
    public void atualizar(double taxa){
        this.saldo += saldo * taxa * 2;
    }
    @Override
    public void depositar(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public String toString() {
        return "ContaCorrente  saldo:" + this.saldo;
    }

    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public void sacar(double valor) {
        this.saldo-= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
}
    

