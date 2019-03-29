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
        
        String[] a = {"a", "b", "c", "d", "e", "f"};
        
        for(int i = 0; i < a.length && i%2 == 0; i++){
            System.out.println(a[i]);
        }
    }
}
