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
public class Compuesto extends Componente {

    protected ArrayList<Componente> componentes;

    public Compuesto(String nombre) {
        componentes = new ArrayList();
        this.nombre = nombre;
    }

    @Override
    public void agregarComponentes(File ruta) {
        
        File listFile[] = ruta.listFiles();
        
        if (listFile != null) {
            
            for (File file : listFile) {
                
                if(file.isFile()){
                    Componente c = new Hoja(file.getName());
                    componentes.add(c);
                }
                
                else {
                    Componente c = new Compuesto(file.getName());
                    componentes.add(c);
                }
                
            }
        }
   
    }

    @Override
    public void suprimirComponente(Componente c) {
        componentes.remove(c);
    }

    @Override
    public void solicita() {
        
        System.out.println(this.nombre);
        
        for(Componente c : componentes){
            c.solicita();
        }
        
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

}
