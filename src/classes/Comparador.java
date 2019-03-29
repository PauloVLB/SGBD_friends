/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author isaacmsl
 */
public class Comparador {
    
    private Comparador(){}
    
    public static ArrayList linhasBelowTo(ArrayList<String[]> lista, ArrayList<Double> doublesColuna, double valor) {
        
        ArrayList pointers = new ArrayList();
        
        int index = 0;
        for (Double num : doublesColuna) {
            if ((double) num < valor) {
                pointers.add(lista.get(index));
            }
            ++index;
        }
        
        return pointers;
        
    }
    
    public static ArrayList linhasBelowEqualsTo(ArrayList<String[]> lista, ArrayList<Double> doublesColuna, double valor) {
        
        ArrayList pointers = new ArrayList();
        
        int index = 0;
        for (Double num : doublesColuna) {
            if ((double) num <= valor) {
                pointers.add(lista.get(index));
            }
            ++index;
        }
        return pointers;
        
    }
    
    public static ArrayList linhasUpTo(ArrayList<String[]> lista, ArrayList<Double> doublesColuna, double valor) {
        
        ArrayList pointers = new ArrayList();
        
        int index = 0;
        for (Double num : doublesColuna) {
            if ((double) num > valor) {
                pointers.add(lista.get(index));
            }
            ++index;
        }
        return pointers;
        
    }
    
    public static ArrayList linhasUpEqualsTo(ArrayList<String[]> lista, ArrayList<Double> doublesColuna, double valor) {
        
        ArrayList pointers = new ArrayList();
        
        int index = 0;
        for (Double num : doublesColuna) {
            if ((double) num >= valor) {
                pointers.add(lista.get(index));
            }
            ++index;
        }
        
        return pointers;
        
    }
    
}
