/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.threads;

/**
 *
 * @author Luísa
 */

public class Programa implements Runnable {
    private static int contador = 0;
    private int id;
    
    public Programa(){
        this.id = ++contador;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("Programa: " + id + " valor: " + i);
        }
    }
    
    
}
