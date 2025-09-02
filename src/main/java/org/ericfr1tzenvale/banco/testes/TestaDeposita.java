/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.testes;

import org.ericfr1tzenvale.banco.exception.ValorInvalido;
import org.ericfr1tzenvale.banco.model.ContaPoupanca;

/**
 *
 * @author Luísa
 */
public class TestaDeposita {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        
        try{
        cp.depositar(-100); //Gera RuntimeException
        
        }catch(ValorInvalido v){
            System.out.println(v.getMessage());
        }
        //Livro pede fazer um try e catch
    }
    
}
