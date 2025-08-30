/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.banco;

/**
 *
 * @author Luísa
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    public void roda(Conta c){
        System.out.println("Saldo antigo: " +c.getSaldo());
        c.atualizar(selic);
        System.out.println("Saldo atualizado" + c.getSaldo());
        this.saldoTotal += c.getSaldo();
        
    }
    
    public double getSaldoTotal(){
        return saldoTotal;
    }
}
