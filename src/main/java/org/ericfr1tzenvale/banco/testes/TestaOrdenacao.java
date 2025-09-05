/*
 * Exemplo de uso de Collections para ordenar e manipular listas
 */
package org.ericfr1tzenvale.banco.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.ericfr1tzenvale.banco.model.ContaPoupanca;

public class TestaOrdenacao {
    public static void main(String[] args) {
        System.out.println("=== Teste de Ordenação ===");

        // Criando lista de contas
        List<ContaPoupanca> contas = new LinkedList<>();
        ContaPoupanca c1 = new ContaPoupanca(20000, 121233, "Eric");
        ContaPoupanca c2 = new ContaPoupanca(22000, 125233, "Jeric");
        ContaPoupanca c3 = new ContaPoupanca(6000, 130000, "Jerick");

        contas.addAll(Arrays.asList(c1, c2, c3));

        // Lista na ordem de inserção
        System.out.println("\n--- Não ordenado ---");
        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }

        // Ordenando (usa compareTo da ContaPoupanca)
        Collections.sort(contas);

        System.out.println("\n--- Ordenado (usando compareTo) ---");
        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }

        // Inverter ordem
        Collections.reverse(contas);
        System.out.println("\n--- Ordem invertida ---");
        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }

        // Embaralhar (útil em jogos/cartas)
        Collections.shuffle(contas);
        System.out.println("\n--- Lista embaralhada ---");
        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }

        // Encontrar maior e menor (usando compareTo)
        ContaPoupanca maior = Collections.max(contas);
        ContaPoupanca menor = Collections.min(contas);
        System.out.println("\nMaior saldo: " + maior);
        System.out.println("Menor saldo: " + menor);

        // Rotacionar elementos (ex: deslocar todos para a direita em 1 posição)
        Collections.rotate(contas, 1);
        System.out.println("\n--- Lista após rotate(1) ---");
        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }

        // Substituir todos os elementos iguais a c1 por c3
        Collections.replaceAll(contas, c1, c3);
        System.out.println("\n--- Lista após replaceAll(c1 -> c3) ---");
        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }

        // Copiar de uma lista para outra (a lista destino deve ter tamanho suficiente)
        List<ContaPoupanca> destino = new ArrayList<>(Arrays.asList(new ContaPoupanca[contas.size()]));
        Collections.copy(destino, contas);
        System.out.println("\n--- Lista destino após copy ---");
        for (ContaPoupanca conta : destino) {
            System.out.println(conta);
        }

        // Preencher a lista inteira com a mesma referência
        Collections.fill(destino, c2);
        System.out.println("\n--- Lista destino após fill(c2) ---");
        for (ContaPoupanca conta : destino) {
            System.out.println(conta);
        }
    }
}
