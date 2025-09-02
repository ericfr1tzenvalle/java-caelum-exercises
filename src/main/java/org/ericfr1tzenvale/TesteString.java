/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale;

/**
 *
 * @author Luísa
 */
// Exercício referente ao capítulo 14
public class TesteString {

    public static void main(String[] args) {
        String nome = "Eric";
        
        // Strings são imutáveis em Java.
        // Ou seja, esse toUpperCase() cria uma nova String, mas não altera a original.
        nome.toUpperCase();
        System.out.println(nome); // Imprime "Eric"
        
        // Para "alterar", precisamos mudar a referência para o novo objeto.
        nome = nome.toUpperCase();
        // Agora "nome" aponta para a nova String criada.
        System.out.println(nome); // Imprime "ERIC"
        
        // --------------------------------------------------------
        // Exercício do livro:
        String s = "fj11";
        
        // replaceAll retorna uma nova String, mas aqui não foi atribuída a nenhuma variável.
        s.replaceAll("1", "2");
        System.out.println(s); // Continua "fj11"
        
        // Forma correta: atribuir a variável novamente
        s = s.replace("1", "2"); // troca todos os '1' por '2'
        String s2 = s;           // s2 referencia o mesmo objeto que s
        System.out.println(s);   // Agora imprime "fj22"
        
        // --------------------------------------------------------
        // Como saber se duas variáveis apontam para o mesmo objeto?
        if (s == s2) {
            System.out.println("Tem a mesma referência."); 
        } else {
            System.out.println("Não tem a mesma referência.");
        }
        
        // --------------------------------------------------------
        // Remover espaços em branco nas pontas de uma String:
        s = s.trim();
        
        // Verificar se uma String está vazia:
        if (s.isEmpty()) {
            System.out.println("Tá vazia.");
        }
        
        // Descobrir quantos caracteres a String tem:
        System.out.println(s.length()); // imprime o tamanho
        
        //Outros exercicios relacionados a String
        //CharAt para imprimir letra por letra
        String palavra = "ixacaba";
        for(int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
        //Reverse para reverter uma String
        for(int i = palavra.length() - 1; i>= 0; i--){
            System.out.print(palavra.charAt(i));
        }
           String frase = "Socorram-me, subi no ônibus em Marrocos";

        // Quebrar a frase em palavras usando split
        // O regex "\\s+" significa "qualquer espaço em branco"
        String[] palavras = frase.split("\\s+");
        
        //Usar StringBuilder para montar a frase invertida
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]);
            if (i != 0) { // adiciona espaço entre as palavras, exceto na última
                fraseInvertida.append(" ");
            }
        }
        System.out.println(fraseInvertida.toString());
    }

}
