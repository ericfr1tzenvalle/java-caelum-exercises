/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.model;

import org.ericfr1tzenvale.banco.model.Conta;

/**
 *
 * @author Luísa
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
    @Override
    public void atualizar(double taxa){
        setSaldo(getSaldo()+ getSaldo() * taxa * 3);
    }

    public ContaPoupanca(double saldo, int numeroConta, String nome) {
        super(saldo, numeroConta, nome);
    }

    public ContaPoupanca() {
    }

    @Override
    public int compareTo(ContaPoupanca o) {
        return Double.compare(o.getSaldo(), this.getSaldo()); 
        //Ordenado do menor pro maior se for ao contrario.
    }
    
    
    
}
