/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite;

import java.util.ArrayList;

/**
 *
 * @author Sala_04
 */
public class Compuesto extends Componente {

    protected ArrayList<Componente> componentes;

    public Compuesto() {
        componentes = new ArrayList();
    }

    public void agregaComponente(Componente c){
        componentes.add(c);
    }
    
    public void suprimirComponente(Componente c){
        componentes.remove(c);
    }
    
    @Override
    public void solicita() {
        
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

}
