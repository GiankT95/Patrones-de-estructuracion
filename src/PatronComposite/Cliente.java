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
public class Cliente {
    
    private static Cliente instance = null;
    private Componente componente;
    
    
    public static Cliente instance(Componente c) {
        
        if(instance == null){
            instance = new Cliente(c);
        }
        
        return instance;
    }
    
    public Cliente (Componente c){
        this.componente = c;
    }
    
    public void generarArbol(File ruta){
        componente.agregarComponentes(ruta);
    }
    
    public void imprimirArbol(){
        this.componente.solicita();
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    
    
}
