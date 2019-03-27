package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Tabela implements Serializable{
    private Coluna colunaPrimaria;
    private ArrayList<Coluna> atributos;
    private String nome;
    private ArrayList<String[]> linhas;

    public Tabela(){
        atributos = new ArrayList<>();
    }
    public Tabela(String nome, ArrayList<Coluna> atributos) {
        this.atributos = atributos;
        this.nome = nome;
        
        // pega a chave primária
        for (Coluna coluna : atributos) {
            if (coluna.isChavePrimaria()) {
                colunaPrimaria = coluna;
            }
        }
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
    
    public Coluna getColunaPrimaria() {
        return colunaPrimaria;
    }

    public void setColunaPrimaria(Coluna colunaPrimaria) {
        this.colunaPrimaria = colunaPrimaria;
    }

    public ArrayList<String[]> getLinhas() {
        return linhas;
    }

    public void addLinha(String[] linha) {
        
        int index = 0;
        for (Coluna coluna : atributos) {
            
            try {
                coluna.setValue(linha[index]);
                
                ++index;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: algum dado não é compatível com sua correspondente coluna.");
                System.exit(-1);
            }

        }
        
        
        
        
    }
    
    public void setLinhas(ArrayList<String[]> linhas) {
        this.linhas = linhas;
    }
    
    
    
}
