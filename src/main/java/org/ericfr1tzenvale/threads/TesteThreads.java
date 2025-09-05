/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.threads;

/**
 *
 * @author Luísa
 */
public class TesteThreads {
    public static void main(String[] args) {
        Programa p1 = new Programa();
        
        Thread t1 = new Thread(p1);
        t1.start();
        
        Programa p2 = new Programa();
        Thread t2 = new Thread(p2);
        t2.start();
        
       
    }
    
}
