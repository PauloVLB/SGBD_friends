/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author  paulo
 * @author  isaac
 * @author  douglas
 */
public class ManipuladorIOFiles {
    public static void gravarArquivo(String nome, boolean sobrescrever, Object objeto){
        try{
            FileOutputStream fos = new FileOutputStream(nome, sobrescrever);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(objeto);
            
            oos.close();
            fos.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o arquivo");
        }
    }
    
    public static void lerArquivoTabela(String nome, ArrayList<Tabela> tabelas){
        try{
            FileInputStream fis = new FileInputStream(nome);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            tabelas = (ArrayList<Tabela>) ois.readObject();
            
            ois.close();
            fis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
