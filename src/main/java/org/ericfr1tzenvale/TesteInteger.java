/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale;

import java.io.PrintStream;
import org.ericfr1tzenvale.banco.model.Conta;
import org.ericfr1tzenvale.banco.model.ContaCorrente;
import org.ericfr1tzenvale.banco.model.ContaPoupanca;

/**
 *
 * @author Luísa
 */
public class TesteInteger {

    public static void main(String[] args) {
        // -------------------------------
        // Testando comportamento do Integer
        // -------------------------------

        // Antes era comum usar o construtor, mas isso está desaconselhado:
        // Integer x1 = new Integer(10);
        // Integer x2 = new Integer(10);

        // Forma correta com autoboxing:
        Integer x1 = 10;
        Integer x2 = 10;

        // Como o valor está no intervalo [-128, 127],
        // o Java reutiliza o mesmo objeto (cache de Integer).
        // Por isso, a comparação com "==" retorna true.
        if (x1 == x2) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        // equals() compara os valores (não a referência)
        System.out.println(x1.equals(x2)); // true

        // Fora do cache (-128 até 127), o Java cria novos objetos
        x1 = 200;
        x2 = 200;

        System.out.println(x1 == x2);      // false (objetos diferentes)
        System.out.println(x1.equals(x2)); // true (valores iguais)

        // parseInt converte String numérica em int
        int valido = Integer.parseInt("12341");
        System.out.println(valido); // saída: 12341

        // Se a string não for numérica, lança NumberFormatException
        // int invalido = Integer.parseInt("invalido");

        // -------------------------------
        // Testando System.out
        // -------------------------------
        // O atributo System.out é um objeto da classe PrintStream
        PrintStream s = System.out;
        s.println("oi");

        // -------------------------------
        // Testando Conta e toString()
        // -------------------------------

        // Não é possível instanciar Conta diretamente, pois é abstrata
        // Conta contaTeste = new Conta(); // não compila

        Conta contaTeste = new ContaCorrente();

        // Antes de sobrescrever toString(), apareceria algo como:
        // org.ericfr1tzenvale.model.banco.ContaCorrente@7344699f
        // Depois de sobrescrever, temos uma saída mais amigável
        System.out.println(contaTeste);

        /*
         * Resumindo:
         * - Sobrescrevendo toString(), deixamos a saída legível.
         * - equals() e hashCode() permitem comparar objetos de forma correta.
         *   Se a.equals(b) for true, então a.hashCode() == b.hashCode() também precisa ser true.
         * - Se a.equals(b) for false, não é obrigatório que o hash seja diferente,
         *   mas é desejável para espalhar melhor os objetos em coleções (HashSet, HashMap).
         * - hashCode() normalmente usa operações matemáticas com números primos
         *   ou o método Objects.hash(...) para gerar um índice para o objeto.
         */

        // -------------------------------
        // Testando equals() e hashCode()
        // -------------------------------
        ContaCorrente cc = new ContaCorrente("Eric", 21312312, 2999);
        ContaCorrente cc1 = cc; // mesma referência
        ContaPoupanca cp = new ContaPoupanca(2999, 21312312, "Eric");

        // Comparando ContaCorrente e ContaPoupanca com mesmos dados
        System.out.println("cp.equals(cc): " + cp.equals(cc)); // pode ser false, pois são classes diferentes
        System.out.println("cc1.equals(cc): " + cc1.equals(cc)); // true (mesma referência)

        // Exibindo hashCodes
        System.out.println("HashCode cp: " + cp.hashCode());
        System.out.println("HashCode cc: " + cc.hashCode());
    }

}
