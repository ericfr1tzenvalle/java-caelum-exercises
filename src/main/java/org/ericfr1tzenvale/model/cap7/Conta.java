/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.cap7;

/**
 *
 * @author Luísa
 */
public class Conta {
    protected double saldo;
    
    public void depositar(double valor){
        this.saldo += valor;
        
    }
    
    public void atualizar(double taxa){
        this.saldo += this.saldo * taxa;
        
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
        
    }
    
    public double getSaldo(){
        return saldo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        return Double.doubleToLongBits(this.saldo) == Double.doubleToLongBits(other.saldo);
    }

    @Override
    public String toString() {
        return "Conta: " + "saldo = " + saldo;
    }
    
    
    
}
