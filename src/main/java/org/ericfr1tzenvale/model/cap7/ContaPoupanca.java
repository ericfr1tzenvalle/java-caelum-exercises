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
public class ContaPoupanca extends Conta{
    @Override
    public void atualizar(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
    
    @Override
    public String toString() {
        return "ContaPoupança  saldo:" + this.saldo;
    }
    
}
