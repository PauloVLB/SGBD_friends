package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Tabela implements Serializable{
    private ArrayList<Coluna> colunas;
    private String nome;
    private ArrayList<String[]> linhas;

    public Tabela(){
        colunas = new ArrayList<>();
    }
    public Tabela(String nome, ArrayList<Coluna> atributos) {
        this.colunas = atributos;
        this.nome = nome;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Coluna> getColunas() {
        return colunas;
    }

    public void setColunas(ArrayList<Coluna> colunas) {
        this.colunas = colunas;
    }
    
    public ArrayList<String[]> getLinhas() {
        return linhas;
    }

    public void addLinha(String[] linha) {
        
    }
    
    public void setLinhas(ArrayList<String[]> linhas) {
        this.linhas = linhas;
    }
    
    
    
}
