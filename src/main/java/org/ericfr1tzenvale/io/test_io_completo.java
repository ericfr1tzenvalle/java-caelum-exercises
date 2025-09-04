/*
 * Exemplo completo de manipulação de arquivos em Java
 * Inclui escrita, leitura, deleção e explicação dos principais conceitos de I/O
 */
package org.ericfr1tzenvale.io;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Eric
 */
public class test_io_completo {
    public static void main(String[] args) {

        System.out.println("Manipulação de arquivos I/O");
        boolean executando = true;
        File f = new File("file.txt"); // Representa o arquivo físico
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
        // InputStreamReader -> converte System.in (bytes) para caracteres
        // BufferedReader -> lê texto de forma mais eficiente (linha por linha)

        while (executando) {
            System.out.println("\n1. Escrever ");
            System.out.println("2. Ler");
            System.out.println("3. Apagar arquivo");
            System.out.println("0. Sair");
            System.out.print("Digite a opcao: ");

            try {
                String linha = teclado.readLine();
                int escolha = Integer.parseInt(linha);

                switch (escolha) {
                    case 1 -> escreverArquivo(f, teclado);
                    case 2 -> lerArquivo(f);
                    case 3 -> apagarArquivo(f);
                    case 0 -> {
                        System.out.println("Saindo...");
                        executando = false;
                    }
                    default -> System.out.println("Entrada inválida");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    // ====== Escrever ======
    public static void escreverArquivo(File f, BufferedReader br) throws IOException {
        try (
                FileWriter fw = new FileWriter(f, true); // abre o arquivo em modo append
                BufferedWriter bw = new BufferedWriter(fw)) // escreve em blocos, mais eficiente
        {
            System.out.print("Escreva sua mensagem: ");
            String linha = br.readLine();
            bw.write(linha); // grava o texto
            bw.newLine(); // quebra de linha
            System.out.println("Mensagem escrita em: " + f.getAbsolutePath());
        }
    }

    // ====== Ler ======
    public static void lerArquivo(File f) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            System.out.println("\nLendo arquivo: " + f.getName());
            System.out.println("Caminho: " + f.getAbsolutePath());
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }

    // ====== Apagar ======
    public static void apagarArquivo(File f) {
        if (f.exists()) {
            if (f.delete()) {
                System.out.println("Arquivo deletado.");
            } else {
                System.out.println("Erro ao deletar");
            }
        } else {
            System.out.println("Não há arquivos para deletar");
        }
    }

    // ====== EXPLICAÇÃO RESUMIDA ======

    // ====== STREAMS (trabalham com BYTES) ======
    // InputStream -> classe base abstrata p/ leitura de bytes
    // FileInputStream -> lê bytes de um arquivo
    // BufferedInputStream -> leitura mais rápida (bufferizado)
    // OutputStream -> classe base abstrata p/ escrita de bytes
    // FileOutputStream -> escreve bytes em arquivo
    // BufferedOutputStream -> escrita rápida em blocos
    // DataInputStream -> lê tipos primitivos (int, double, UTF...) em bytes

    // ====== READERS / WRITERS (trabalham com CARACTERES) ======
    // Reader -> classe base abstrata p/ leitura de caracteres
    // FileReader -> lê caracteres de um arquivo texto
    // BufferedReader -> lê em blocos + método readLine()
    // InputStreamReader -> converte InputStream (bytes) em Reader (chars)
    // Writer -> classe base abstrata p/ escrita de caracteres
    // FileWriter -> escreve caracteres em arquivo texto
    // BufferedWriter -> escrita em blocos + método newLine()
    // OutputStreamWriter -> converte OutputStream (bytes) em Writer (chars)

    // ====== DICAS ======
    // Streams -> arquivos binários (imagem, pdf, mp3)
    // Readers/Writers -> arquivos de texto (txt, csv, json)
    // Buffered -> sempre que houver muito dado (melhora performance)
    // InputStreamReader -> muito usado para ler teclado (System.in)

}

// ====== TODAS AS CLASSES ABSTRATAS DO PACOTE java.io ======
// InputStream -> base para leitura de bytes
// OutputStream -> base para escrita de bytes
// Reader -> base para leitura de caracteres
// Writer -> base para escrita de caracteres
// ObjectStreamClass -> descrição de uma classe serializada (não instanciável direto)
// ObjectInputStream.GetField -> leitura de campos serializados
// ObjectOutputStream.PutField -> escrita de campos serializados
