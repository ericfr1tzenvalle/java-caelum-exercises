/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.banco;

/**
 *
 * @author Luísa
 */
public class TestaGerenciadorDeImposto {
    
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gr = new GerenciadorDeImpostoDeRenda();
        
        SeguroDeVida sv = new SeguroDeVida();
        gr.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        gr.adiciona(cc);
        
        System.out.println(gr.getTotal());
    }
    
}
