/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.cap7;

import org.ericfr1tzenvale.model.cap7.Conta;

/**
 *
 * @author Luísa
 */
public class ContaCorrente extends Conta {
    
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
    
    
    
}
