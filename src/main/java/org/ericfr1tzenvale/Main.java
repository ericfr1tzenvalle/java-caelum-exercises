package org.ericfr1tzenvale;

import org.ericfr1tzenvale.model.Funcionario;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Funcionario f = new Funcionario("Eric","21212121",2.000,"Desenvolvedor Java");
        System.out.println("Nome do funcionario: " + f.getNome());
        System.out.println("Salario do funcionario: R$ " + f.getSalario());
        System.out.println("Data de entrada na empresa: " + f.getDataEntrada());
        System.out.println("Ganho anual : R$ " + f.calculaGanhoAnual());

        System.out.println(f.getNome() + " Recebeu um aumento");
        f.receberAumento(200);
        System.out.println("Salario do funcionario: " + f.getSalario());
        System.out.printf("Ele passa a ganhar anualmente: R$ " + f.calculaGanhoAnual());

    }
}