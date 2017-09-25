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
public class Cliente{
    
    private static Cliente instance = null;
    private InterfazClienteServicios serviciosCliente = new Adaptador();
    
    public static Cliente instance() {
        
        if(instance == null){
            instance = new Cliente();
        }
        
        return instance;
    }
    
    public void recibirSerial(){
        System.out.println(serviciosCliente.devolverSerial());
    }
    
}
