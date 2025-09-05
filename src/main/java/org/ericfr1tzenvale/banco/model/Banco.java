/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.banco.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Luísa
 */
public class Banco {
    private String nome;
    private int codigoBanco;
    private HashSet<Conta> contas;
    private Map<String, Conta> buscarMaps;
    public Banco(String nome, int codigoBanco){
        this.nome = nome;
        this.codigoBanco = codigoBanco;
        this.contas =  new HashSet<>();
        this.buscarMaps = new HashMap<>();
    }
    public Banco(){
        this.contas = new HashSet<>();
        this.buscarMaps = new HashMap<>();
    }
    
    public boolean adicionar(Conta c){
        if(contas.add(c)){
            buscarMaps.put(c.getNome(), c);
            return true;
        }
        return false;
        
    }
    
    public HashSet<Conta> getContas(){
        return contas;
    }
    
   
    public int pegaQuantidadeContas(){
        return contas.size();
    }
    public Conta buscarPorNome(String nome){
        return buscarMaps.get(nome);
    }

   
    
    
    
}
