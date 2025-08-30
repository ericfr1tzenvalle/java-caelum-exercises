/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.model.banco;

import org.ericfr1tzenvale.model.banco.ContaCorrente;
import org.ericfr1tzenvale.model.banco.ContaPoupanca;
import org.ericfr1tzenvale.model.banco.Conta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luísa
 */
public class TestaConta {

    public static void main(String[] args) {
            Conta c = new ContaCorrente();
            ContaCorrente cc = new ContaCorrente();
            ContaPoupanca cp = new ContaPoupanca();
            //Colocar em um arrayList para facilitar a impressão.
            List<Conta> contas = new ArrayList();
            contas.add(c);
            contas.add(cc);
            contas.add(cp);

            c.depositar(1000);
            cc.depositar(1000);
            cp.depositar(1000);
            
            AtualizadorDeContas at = new AtualizadorDeContas(0.01);
            at.roda(c);
            at.roda(cc);
            at.roda(cp);

            for (Conta conta : contas) {
                System.out.println(conta.toString());
            }
            
            System.out.println("Saldo total: " + at.getSaldoTotal());
    }

}
