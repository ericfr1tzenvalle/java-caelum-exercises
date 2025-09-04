/*
 * Exemplo de leitura de dados do console em Java
 * Mostrando duas formas com BufferedReader:
 * 1) Sem try-with-resources (precisa fechar manualmente)
 * 2) Com try-with-resources (fecha automático)
 */
package org.ericfr1tzenvale.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe de teste para entrada de dados pelo console.
 * O programa pede que o usuário digite mensagens até que ele escreva "sair".
 */
public class Test_io {

    public static void main(String[] args) {
        // Aqui tu pode escolher qual método testar:
        usarSemTryWithResources();
        // usarComTryWithResources();
    }

    /**
     * Exemplo SEM try-with-resources.
     * - O fechamento do BufferedReader precisa ser feito manualmente no bloco finally.
     * - Código fica mais verboso, mas ajuda a entender como o fechamento funciona.
     */
    public static void usarSemTryWithResources() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            // ou
            // InputStream is = System.in
            // InputStreamReader isr = new InputStreamReader(is);
            // BufferedReader br = new BufferedReader(isr);

            System.out.println("=== SEM try-with-resources ===");
            System.out.println("Digite sua mensagem (ou 'sair' para encerrar): ");

            String linha = br.readLine();

            while (linha != null && !linha.equalsIgnoreCase("sair")) {
                System.out.println("Você digitou: " + linha);
                linha = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Importante: fechar manualmente o recurso
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o BufferedReader: " + e.getMessage());
                }
            }
        }
    }

    /**
     * Exemplo COM try-with-resources.
     * - O fechamento do BufferedReader é feito automaticamente.
     * - Código mais limpo e menos propenso a erros.
     */
    public static void usarComTryWithResources() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("=== COM try-with-resources ===");
            System.out.println("Digite sua mensagem (ou 'sair' para encerrar): ");

            String linha = br.readLine();

            while (linha != null && !linha.equalsIgnoreCase("sair")) {
                System.out.println("Você digitou: " + linha);
                linha = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
