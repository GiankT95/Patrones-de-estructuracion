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
       
       Componente comp = new Hoja();
        
       Cliente.instance().setComponente(comp);
       
       Cliente.instance().getComponente().solicita(new File("C:\\Users\\Sala_04\\Documents\\NetBeansProjects\\insercion_de_nodos_pilas"));
       
    }
    
}
