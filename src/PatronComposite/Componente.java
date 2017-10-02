/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Sala_04
 */
public abstract class Componente {

    protected String nombre;
    
    public abstract void solicita();
    public abstract void agregarComponentes(File ruta);
    public abstract void suprimirComponente(Componente c);
    
}
