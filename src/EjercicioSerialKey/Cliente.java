/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerialKey;

/**
 *
 * @author Asus
 */
public class Cliente implements InterfazClienteServicios {
    
    private static Cliente instance = null;

    public static Cliente instance() {
        
        if(instance == null){
            instance = new Cliente();
        }
        
        return instance;
    }

    @Override
    public void devolverSerial(Adaptador a) {
        
        System.out.println(a.serialDD());
    }
    
    
    
    
}
