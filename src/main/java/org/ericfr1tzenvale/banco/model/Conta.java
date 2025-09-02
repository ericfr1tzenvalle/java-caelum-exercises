/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.model;

import java.util.Objects;
import org.ericfr1tzenvale.banco.exception.SaldoInsuficiente;
import org.ericfr1tzenvale.banco.exception.ValorInvalido;

/**
 *
 * @author Luísa
 */
public  abstract class Conta {
    private double saldo;
    private int numeroConta;
    private String nome;
    
    public void depositar(double valor){
        if(valor <= 0){
            throw new ValorInvalido(valor);
        }
        this.saldo += valor;
        
        
    }

    public Conta(double saldo, int numeroConta, String nome) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    
    public Conta(){
        
    }
    
    public abstract void atualizar(double taxaSelic);
    
    public void sacar(double valor){
        if(valor<= 0){
            //Na apostila é pedido o uso de IllegalArgument mas resolvi criar.
            throw new ValorInvalido(valor); 
        }
        if(valor > this.saldo){
            throw new SaldoInsuficiente("Saldo insuficiente");
            
        }
        this.saldo -= valor;
       
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double valor){
        this.saldo = valor;
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }
    public String getNome(){
        return nome;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(getNome(), getNumeroConta());
        
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Conta c = (Conta) obj;
        
        
        return Objects.equals(this.getNome(), c.getNome()) &&
                Objects.equals(this.getNumeroConta(), c.getNumeroConta());
        
    }

 
    
    
}
