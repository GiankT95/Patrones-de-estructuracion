/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite;

/**
 *
 * @author Sala_04
 */
public class Cliente {
    
    private static Cliente instance = null;
    private Componente componente;
    
    
    public static Cliente instance() {
        
        if(instance == null){
            instance = new Cliente();
        }
        
        return instance;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    
    
}
