/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
import classes.ManipuladorIOFiles;
import classes.Tabela;
import java.io.*;
import java.util.ArrayList;

public class TesteLegal {
    public static void main(String[] args) {
        ArrayList<Tabela> tabelas = new ArrayList<>();
        //tabelas.add(new Tabela("TesteTabela", null));
        
        ManipuladorIOFiles.lerArquivoTabela("Teste.tes", tabelas);
        System.out.println(tabelas);
        //ManipuladorIOFiles.gravarArquivo("Teste.tes", false, tabelas);
        
    }
}
