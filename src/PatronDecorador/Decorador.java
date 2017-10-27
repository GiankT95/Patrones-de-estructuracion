/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador;

/**
 *
 * @author Fuller 101
 */
public abstract class Decorador implements ComponenteGraficoVehiculo{
    
    private ComponenteGraficoVehiculo componente;
    
    public Decorador(ComponenteGraficoVehiculo componente){
        this.componente = componente;
    }

    @Override
    public void visualiza() {
        
        componente.visualiza();
    }
    
    
    
}