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
public class Adaptador{

    ServiciosDD servicios;
    
    public Adaptador(ServiciosDD sDD) {
        servicios = sDD;
    }
   
    public String serialDD(){
        
        return servicios.obtenerSerialDD();
    }
    
}
