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
public interface InterfazClienteServicios {
    
    public String devolverLlave ();
    public String devolverSerial(String key);
    public boolean validarSerial(String serial);
    
}
