/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerialKey;

/**
 *
 * @author Sala_02
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Adaptador a = new Adaptador(new ServiciosDD());
        
        Cliente.instance().devolverSerial(a);
    }
    
}
