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
public interface Componente {

    public abstract void solicita(File ruta);
    public void agregarComponente(Componente c);
    public void suprimirComponente(Componente c);
    
}
