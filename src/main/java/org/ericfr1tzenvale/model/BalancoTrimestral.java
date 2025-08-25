/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model;

/**
 *
 * @author Éric
 */
//Exercicios 3.3 //Levemente modificados
public class BalancoTrimestral {

    public void retornaExercicio3_3() {
        // 1) Declarar variáveis de gasto por mês
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

    // 2) Somar os gastos do trimestre
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

    // 3) Imprimir gasto total do trimestre
        System.out.println("Gasto total no trimestre: " + gastosTrimestre);

    // 4) Calcular e imprimir a média mensal
        int mediaMensal = gastosTrimestre / 3;
        System.out.println("Média mensal de gasto: " + mediaMensal);
    }

}
