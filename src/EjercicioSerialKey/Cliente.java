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
    private final InterfazClienteServicios serviciosCliente = new Adaptador();
    
    public static Cliente instance() {
        
        if(instance == null){
            instance = new Cliente();
        }
        
        return instance;
    }
    
    public String recibirLlave(){
        
        System.out.println("Llave: " + serviciosCliente.devolverLlave());
        
        return serviciosCliente.devolverLlave();
    }
    
    public String recibirSerial(String key){
        System.out.println("Serial: " + serviciosCliente.devolverSerial(key));
        
        return serviciosCliente.devolverSerial(key);
    }
    
    public Boolean validarSerial(String serial){
        
        if(serviciosCliente.validarSerial(serial)){
            System.out.println("Serial valido");
        }
        
        else{
            System.out.println("Serial invalido!");
        }
        
        return serviciosCliente.validarSerial(serial);
    }
    
}
