/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.model;

/**
 *
 * @author Luísa
 */
public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    
    public void adiciona(Tributavel t){
        System.out.println("Adicionando tributavel: " + t);
        this.total+= t.calculaTributos();
        
        
    }
    
    public double getTotal(){
        return total;
    }
    
}
