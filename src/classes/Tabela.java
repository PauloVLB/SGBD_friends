package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Tabela implements Serializable{
    private ArrayList<Coluna> colunas;
    private String nome;
    private ArrayList<String[]> linhas;

    public Tabela(String nome, ArrayList<Coluna> atributos) {
        this.colunas = atributos;
        this.nome = nome;
        linhas = new ArrayList<>();
    }
    
    public Tabela() {
        colunas = new ArrayList<>();
        linhas = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tabela other = (Tabela) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
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

    public void addLinha(ArrayList<String> linha) {
        String[] linhaString = new String[colunas.size()];

        int i = 0;
        for (String dado : linha) {
            linhaString[i++] = dado;
        }
        
        linhas.add(linhaString);
    }
    
    public void setLinhas(ArrayList<String[]> linhas) {
        this.linhas = linhas;
    }
    
    
    
}
