/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.exception;

/**
 *
 * @author Luísa
 */
public class SaldoInsuficiente extends RuntimeException {

    public SaldoInsuficiente(String mensagem) {
        super(mensagem);
    }
    
}
