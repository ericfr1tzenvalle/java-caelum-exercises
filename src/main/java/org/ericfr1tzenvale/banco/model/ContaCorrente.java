/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.model;

import java.util.Objects;
import org.ericfr1tzenvale.banco.model.Conta;

/**
 *
 * @author Luísa
 */
public class ContaCorrente extends Conta implements Tributavel{
    
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(String nome, int numeroConta, double saldo){
        super(saldo,numeroConta,nome);
    }
    @Override
    public void atualizar(double taxa){
        setSaldo(getSaldo() + getSaldo()* taxa * 2);
    }
    
    

    public double calculaTributos() {
        return this.getSaldo() * 0.01;
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
        ContaCorrente c = (ContaCorrente) obj;
        
        
        return Objects.equals(this.getNome(), c.getNome()) &&
                Objects.equals(this.getNumeroConta(), c.getNumeroConta());
        
    }
    
   

}
    

