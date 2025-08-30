/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.banco;

/**
 *
 * @author Luísa
 */
public interface Conta {
    
    
    public void depositar(double valor);
    
    public abstract void atualizar(double taxaSelic);
    
    public void sacar(double valor);
    
    public double getSaldo();

 
    
    
}
