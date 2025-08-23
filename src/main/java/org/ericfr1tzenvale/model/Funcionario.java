package org.ericfr1tzenvale.model;

import java.time.LocalDate;

//Exercicio Cap 4.
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    //private LocalDate dataNascimento;
    private LocalDate dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;

    public Funcionario(String nome, String rg, double salario, String departamento) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
        this.departamento = departamento;
        this.estaNaEmpresa = false;
    }

    public void receberAumento(double salario) {
        this.salario += salario;
    }

    public double calculaGanhoAnual(){
        return salario*12;
    }
    public void demite(){
        this.estaNaEmpresa = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }
    //O mostra do exercicio.
    @Override
    public String toString() {
        return "Nome: " + nome + " Salario: " + salario + " Data de entrada: " + dataEntrada;
    }
}
