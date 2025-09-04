package org.ericfr1tzenvale.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Classe simples para leitura de um arquivo texto linha por linha.
 * Exemplo: lê "teste.txt" e imprime no console.
 *
 * Observação:
 * - Usa BufferedReader para eficiência.
 * - Fecha os recursos no final com try-with-resources.
 *
 * @author Luísa
 */
public class Test_txt {
    public static void main(String[] args) {
        // try-with-resources fecha os streams automaticamente
        try (InputStream is = Test_txt.class.getResourceAsStream("/teste.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr)) {

            String linha;
            // enquanto houver linhas no arquivo
            while ((linha = br.readLine()) != null) {
                System.out.println(linha); // imprime a linha atual
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
