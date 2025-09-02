/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ericfr1tzenvale.guardadorObjects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luísa
 */
public class GuardadorDeObjetos {
    List<Object> objetos;
    
    public GuardadorDeObjetos(){
        this.objetos = new ArrayList<>();
    }
    
    public void adicionarObj(Object obj){
        objetos.add(obj);
    }
    public void removerObj(int indice){
        objetos.remove(indice);
    }
    public List<Object> getLista(){
        return objetos;
    }
    public Object getObject(int indice){
        return objetos.get(indice);
    }
     public int getQuantidadeDeElementos() {
        return this.objetos.size();
    }
}
