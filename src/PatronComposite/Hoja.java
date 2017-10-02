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
public class Hoja extends Componente{
    
    public Hoja(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void solicita() {

            System.err.println("    "+this.nombre);    
    }

    @Override
    public void agregarComponentes(File ruta) {
        throw new UnsupportedOperationException("No puede agregar componentes a este objeto");
    }

    @Override
    public void suprimirComponente(Componente c) {
        throw new UnsupportedOperationException("No puede suprimir componentes a este objeto");
    }
    
}
