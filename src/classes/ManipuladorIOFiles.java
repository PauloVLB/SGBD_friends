/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author  paulo
 * @author  isaac
 * @author  douglas
 */
public class ManipuladorIOFiles {
    public static void criarArquivo(String nomeArquivo){
        try {
            gravarArquivo(nomeArquivo, new ArrayList<Tabela>(), false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o arquivo");
        }
    }
    
    public static boolean exists(String nome) throws Exception {
        
        try {
            FileInputStream fis = new FileInputStream(nome);
            fis.close();
            
            return true;
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public static void gravarArquivo(String nome, ArrayList<Tabela> tabelas, boolean trunca) throws Exception {
        try{
            FileOutputStream fos = new FileOutputStream(nome, trunca);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(tabelas);
            
            oos.close();
            fos.close();
        }catch (Exception e){
            throw e;
        }
    }
    
    public static ArrayList<Tabela> lerArquivoTabela(String nome) throws Exception{
        try{
            FileInputStream fis = new FileInputStream(nome);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Tabela> tabelas = (ArrayList<Tabela>) ois.readObject();
            
            ois.close();
            fis.close();
            
            return tabelas;
            
        }catch(Exception e){
             throw e; 
        }
    }
    
}
