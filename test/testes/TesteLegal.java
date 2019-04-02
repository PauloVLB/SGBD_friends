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
        String[] a =  {"a", "d", "s"};
        String[] b =  {"c", "s", "h"};
        
        ArrayList<String[]> arr = new ArrayList<>();
        
        arr.add(a);
        arr.add(b);
        
        String[] d =  {"a", "d", "s"};
        arr.remove(d);
        System.out.println(arr);
        
    }
}
