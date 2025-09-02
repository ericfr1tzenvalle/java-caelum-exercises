package org.ericfr1tzenvale;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.ericfr1tzenvale.empresa.model.Empresa;
import org.ericfr1tzenvale.empresa.model.Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //testaFuncionario();
        //testaEmpresa();
        demonstraArrayBidimensional();

    }

    public static void testaFuncionario() {
        //Teste do funcionario
        System.out.println("==========TESTE FUNCIONARIO===============");
        Funcionario f = new Funcionario("Eric", "21212121", 2.000, "Desenvolvedor Java");
        System.out.println("Nome do funcionario: " + f.getNome());
        System.out.println("Salario do funcionario: R$ " + f.getSalario());
        System.out.println("Data de entrada na empresa: " + f.getDataEntrada());
        System.out.println("Ganho anual : R$ " + f.calculaGanhoAnual());

        System.out.println(f.getNome() + " Recebeu um aumento");
        //Teste aumento
        f.receberAumento(200);
        System.out.println("Salario do funcionario: " + f.getSalario());
        //Teste calcularGanho
        System.out.printf("Ele passa a ganhar anualmente: R$ " + f.calculaGanhoAnual());
        //Teste referencias (== or equals)
        Funcionario f2 = new Funcionario("Eric", "21212121", 2.000, "Desenvolvedor Java");
        System.out.println("O funcionario f é igual(memoria) a f2 (==): " + (f == f2));
        System.out.println("Não pois mesmo que seja igual o (==) compara endereço de memoria e não conteudo.");
        System.out.println("O funcionario f é igual a f2(equals): " + f.equals(f2));
        //Com equals ele funciona pois compara todos os atributos.
        //Teste referencias 2
        Funcionario f3 = f;
        System.out.println("O funcionario f3 é igual(memoria) a f?: " + (f3 == f));
        System.out.println("O funcionario f3 possui o mesmo conteudo que f: " + f3.equals(f));
        //Funciona os dois pois ele aponta pro f e também possui o mesmo conteudo que f, porem se fosse diferente
        //O primeiro teste daria ok mas o segundo não. Assim como esse vai dair false.
        System.out.println("O funcionario f3 é igual(memoria) a f2: " + (f3 == f2));

    }

    public static void testaEmpresa() {
        System.out.println("==========TESTE EMPRESA===============");
        Empresa e = new Empresa("Microsoft", "2132459775");
        System.out.println("Nome do empresa: " + e.getNome());
        System.out.println("Cnpj do empresa: " + e.getCnpj());
        System.out.println("Atualmente ela possui: " + e.getNumFuncionarios() + " funcionarios");
        // Adicionando membros a empresa

        for (int i = 0; i < e.getMAX_FUNCIONARIOS(); i++) {
            e.addEmpregado(new Funcionario("Funcionario [" + i + "]", "00" + i * 21124214, 2000, "Desenvolvedor Java"));

        }
        System.out.println("Apos uma contratação, agora possui: " + e.getNumFuncionarios() + " funcionarios");
        e.mostraFuncionarios();

    }

    //Só praticando arrays bidimensionais, não está no livro e geralmente não reflete o mundo real.
    public static void demonstraArrayBidimensional() {
        System.out.println("========= ARRAY BIDIMENSIONAL ==========");
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite quantas linhas deseja na sua matriz: ");
        int linhas = sc.nextInt();
        System.out.print("Digite quantas colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) { // matriz.length → linhas
            for (int j = 0; j < matriz[i].length; j++) { // matriz[i].length → colunas
                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("\n========= SUA MATRIZ =========");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // quebra de linha no final da linha
        }
    }

}
