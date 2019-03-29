package classes;


import classes.Coluna;
import java.util.ArrayList;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaacmsl
 */
public class ManipuladorTabelas {
    
    private ManipuladorTabelas(){}
    
    public static String[] parseToStringVector(ArrayList<Coluna> colunas) {
        // CONVERTENDO COLUNAS PARA VETOR DE STRING
        String[] colunasString = new String[colunas.size()];
        
        int i = 0;
        for (Coluna coluna : colunas) {
            colunasString[i] = coluna.getNome();
            ++i;
        }
        
        return colunasString;
    }
    
    public static Object[][] parseToObjectArray(ArrayList<String[]> linhas, int qntColunas) {
        
        // CONVERTENDO LINHAS PARA MATRIZ DE OBJETO
        Object[][] linhasObject = new Object[linhas.size()][qntColunas];

        int l = 0;
        int c = 0;
        for (String[] linha : linhas) {
            for (String linhaDado : linha) {
                linhasObject[l][c++] = linhaDado;
            }
            c = 0;
            ++l;
        }
        
        return linhasObject;
    }
    
    public static void parseToTable(JTable jTable,ArrayList<Coluna> colunas, ArrayList<String[]> linhas) {
        
        String[] colunasString = parseToStringVector(colunas);
        
        Object[][] linhasObject = parseToObjectArray(linhas, colunas.size());

        jTable.removeAll(); // usado para atuliazar toda a jTable

        // ATUALIZA A JTABLE
        jTable.setModel(new javax.swing.table.DefaultTableModel(
                linhasObject,
                colunasString
        ));
    }
    
}
