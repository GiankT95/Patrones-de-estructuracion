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
public class MarcaDecorador extends Decorador{
    
    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    @Override
    public void visualiza() {
        super.visualiza();
        visualizaInfoTecnica();
    }
    
    private void visualizaInfoTecnica(){
        System.out.println("Informacion tecnica del vehiculo.");
    }
    
}
