/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Luísa
 */
public class TestaPerformance {
    public static void main(String[] args) {
        System.out.println("Teste de 30mil numeros no ArrayList");
        //Collection<Integer> teste = new ArrayList<>();
        //Set<Integer> teste = new HashSet<>();
        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;
        for(int i = 0; i < total; i++){
            teste.add(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto inserindo: " + tempo);
        
        inicio = System.currentTimeMillis();
        for(int i = 0; i < total; i++){
            teste.contains(i);
        }
        
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto procurando: " + tempo);
    }
    
}
