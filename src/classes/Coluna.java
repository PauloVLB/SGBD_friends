/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author isaacmsl
 */
public class Coluna implements Serializable {
    
    private String nome;
    private String tipo;
    private boolean chavePrimaria;
    private Object value;

    public Coluna(String nome, String tipo, boolean chavePrimaria) {
        this.nome = nome;
        this.tipo = tipo;
        this.chavePrimaria = chavePrimaria;
    }
    
    public Coluna(String nome, String tipo, boolean chavePrimaria, Object value) {
        this.nome = nome;
        this.tipo = tipo;
        this.chavePrimaria = chavePrimaria;
        this.value = value;
    }
    
    @Override
    public String toString() {
        return String.format("%s:%s:%b", nome, tipo, chavePrimaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isChavePrimaria() {
        return chavePrimaria;
    }

    public void setChavePrimaria(boolean chavePrimaria) {
        this.chavePrimaria = chavePrimaria;
    }
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
}
