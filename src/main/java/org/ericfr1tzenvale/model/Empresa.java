package org.ericfr1tzenvale.model;

public class Empresa {
    private String nome;
    private String cnpj;
    //O exercicio pede um Array mas poderia ser um ArrayList.
    private  Funcionario[] empregados;
    private  int numFuncionarios;
    private  int MAX_FUNCIONARIOS = 30;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new Funcionario[MAX_FUNCIONARIOS];
        this.numFuncionarios = 0;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Funcionario[] getEmpregados() {
        return empregados;
    }
    public void addEmpregado(Funcionario empregado) {
        if(empregado != null && empregado instanceof Funcionario && numFuncionarios < MAX_FUNCIONARIOS) {
            this.empregados[numFuncionarios] = empregado;
        }


    }
    public int getMAX_FUNCIONARIOS(){
        return MAX_FUNCIONARIOS;
    }
    // mostraEmpregados foi um pedido do livro
    public void mostraEmpregados(){
        for(Funcionario f : empregados){
            if(f != null){
                System.out.println(f.getNome() + "  RG: " + f.getRg() +  " Salario: " + f.getSalario());
            }

        }
    }
}
