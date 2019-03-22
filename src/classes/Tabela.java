package classes;

import java.io.*;
import java.util.ArrayList;

public class Tabela implements Serializable{
    private int chavePrimaria;
    private ArrayList<Coluna> atributos;
    private String nome;

    public Tabela(){
        atributos = new ArrayList<>();
    }
    public Tabela(String nome, ArrayList<Coluna> atributos) {
        atributos = new ArrayList<>();
        this.atributos = atributos;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Coluna> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Coluna> atributos) {
        this.atributos = atributos;
    }
    
    public int getChavePrimaria() {
        return chavePrimaria;
    }

    public void setChavePrimaria(int chavePrimaria) {
        this.chavePrimaria = chavePrimaria;
    }
    
    /*@Override
    public String toString(){
        return "Nome: " + nome;
    }*/
}
