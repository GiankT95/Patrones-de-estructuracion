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
public class Adaptador implements InterfazClienteServicios{

    InterfazDDServicios servicios = new ServiciosDD();
    
    public Adaptador() {
        servicios = new ServiciosDD();
    }

    @Override
    public String devolverSerial() {
        return servicios.obtenerSerialDD();
    }
    
}
