/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.exception;

/**
 *
 * @author Luísa
 */
public class ValorInvalido extends RuntimeException {

    public ValorInvalido(double valor) {
        super("Valor invalido: " + valor);
    }
    
}
