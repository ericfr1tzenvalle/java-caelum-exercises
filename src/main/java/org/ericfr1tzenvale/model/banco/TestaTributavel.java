/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.banco;

/**
 *
 * @author Luísa
 */
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        System.out.println(cc.calculaTributos());
        
        Tributavel tt = cc;
        System.out.println(tt.calculaTributos());
    }
    
}
