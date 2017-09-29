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
public class Compuesto implements Componente {

    protected ArrayList<Componente> componentes;

    public Compuesto() {
        componentes = new ArrayList();
    }

    @Override
    public void agregarComponente(Componente c) {
        componentes.add(c);
    }

    @Override
    public void suprimirComponente(Componente c) {
        componentes.remove(c);
    }

    @Override
    public void solicita(File ruta) {

        File listFile[] = ruta.listFiles();
        if (listFile != null) {
            
            for (File listFile1 : listFile) {
                
                System.out.println(listFile1.getName());
                
                if (listFile1.isDirectory()) {
                    solicita(listFile1);
                } else {
                    System.err.println("    "+listFile1.getName());
                }
            }
        }

    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

}
