package org.ericfr1tzenvale.banco.testes;

import org.ericfr1tzenvale.banco.model.Banco;
import org.ericfr1tzenvale.banco.model.ContaCorrente;

/**
 * Teste do uso de HashSet para armazenar contas no Banco.
 * Demonstra como contas duplicadas são tratadas.
 * @author Luísa
 */
public class TesteHashSetConta {
    public static void main(String[] args) {
        // Cria um banco
        Banco b = new Banco("Nuberk", 002);

        // Cria uma conta corrente
        ContaCorrente cc = new ContaCorrente("Eric", 121299, 2000);
        // Adiciona a conta ao banco
        b.adicionar(cc);
        System.out.println("Inserindo..." + cc);
        System.out.println("Conta adicionada com sucesso");

        // Teste de conta repetida (mesmo titular e número)
        System.out.println("\nTentando inserir outra conta igual...");
        ContaCorrente cc1 = new ContaCorrente("Eric", 121299, 2000);
        if (b.adicionar(cc1)) {
            System.out.println("Conta adicionada com sucesso");
        } else {
            System.out.println("Conta já existe");
        }

        // Teste de conta diferente (mesmo titular, número diferente)
        System.out.println("\nInserindo conta com mesmo titular, número diferente...");
        ContaCorrente cc2 = new ContaCorrente("Eric", 121300, 5000);
        if (b.adicionar(cc2)) {
            System.out.println("Conta adicionada com sucesso: " + cc2);
        } else {
            System.out.println("Conta já existe");
        }

        // Teste de conta totalmente diferente
        System.out.println("\nInserindo conta com titular diferente...");
        ContaCorrente cc3 = new ContaCorrente("Luísa", 555555, 1000);
        if (b.adicionar(cc3)) {
            System.out.println("Conta adicionada com sucesso: " + cc3);
        } else {
            System.out.println("Conta já existe");
        }

        // Mostrando todas as contas do banco
        System.out.println("\nTodas as contas do banco:");
        b.getContas().forEach(System.out::println);
    }
}
