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
public class Hoja implements Componente{
    
    public Hoja() {
        
    }
    
    @Override
    public void solicita(File ruta) {
        
        if(ruta.isFile()){
            System.out.println(ruta.getName());
        }
        
    }

    @Override
    public void agregarComponente(Componente c) {
        throw new UnsupportedOperationException("No puede agregar componentes a este objeto");
    }

    @Override
    public void suprimirComponente(Componente c) {
        throw new UnsupportedOperationException("No puede suprimir componentes a este objeto");
    }
    
}
