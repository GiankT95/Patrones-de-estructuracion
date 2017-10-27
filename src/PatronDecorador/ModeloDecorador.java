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
public class ModeloDecorador extends Decorador{
    
    public ModeloDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    @Override
    public void visualiza() {
        super.visualiza();
        visualizaLogo();
    }
    
    private void visualizaLogo(){
        System.out.println("Logo del vehiculo.png");
    }
    
}
