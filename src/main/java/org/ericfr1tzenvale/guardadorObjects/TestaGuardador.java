/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.guardadorObjects;

import org.ericfr1tzenvale.banco.model.ContaCorrente;
import org.ericfr1tzenvale.banco.model.ContaPoupanca;



/**
 *
 * @author Luísa
 */
public class TestaGuardador {

    public static void main(String[] args) {
        GuardadorDeObjetos guardador = new GuardadorDeObjetos();

        // Criando uma conta corrente
        ContaCorrente cc = new ContaCorrente("Eric", 123, 5000);

        // Adicionando no guardador
        guardador.adicionarObj(cc);

        // Recuperando como ContaCorrente funciona normalmente
        ContaCorrente cc1 = (ContaCorrente) guardador.getObject(0);
        System.out.println("Recuperado como ContaCorrente: " + cc1);

        // Tentando forçar o cast para ContaPoupanca (classe diferente)
        try {
            ContaPoupanca cp = (ContaPoupanca) guardador.getObject(0);
            System.out.println(cp);
        } catch (ClassCastException e) {
            // Esse é o tipo da exceção que aparece quando o cast é incompatível
            System.out.println("Erro de cast: " + e);
        }

        // Testando autoboxing: passando um int direto para o guardador
        guardador.adicionarObj(10); // int vira Integer automaticamente
        Integer i = (Integer) guardador.getObject(1);
        System.out.println("Número guardado: " + i);

        // Quantidade de elementos guardados
        System.out.println("Total guardado: " + guardador.getQuantidadeDeElementos());
        
        
        //Outros exericicios
        
        
    }
}
