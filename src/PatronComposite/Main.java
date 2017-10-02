/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite;

import java.io.File;

/**
 *
 * @author Sala_04
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Compuesto c = new Compuesto("");
       
       Cliente.instance(c).generarArbol(new File("C:\\Users\\Sala_02\\Documents"));
       Cliente.instance(c).imprimirArbol();
    }
    
}
