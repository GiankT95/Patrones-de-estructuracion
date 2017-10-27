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
public class VistaCatalogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComponenteGraficoVehiculo c = new VistaVehiculo();
        ModeloDecorador md = new ModeloDecorador(c);
        MarcaDecorador md2 = new MarcaDecorador(c);
        
        md.visualiza();
        System.out.println("----------------------");
        md2.visualiza();
        
    }
    
}
