/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerialKey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class ServiciosDD implements InterfazDDServicios{

    @Override
    public String obtenerSerialDD() {
        
        String salida = null;
        
        
        try {
            
            String serial = "wmic diskdrive get serialnumber";
            String aux = null;
            
            Process proceso = Runtime.getRuntime().exec(serial);
            
            InputStreamReader input = new InputStreamReader(proceso.getInputStream());
            BufferedReader stdInput = new BufferedReader(input);

            //System.out.println(stdInput.readLine());

            
            if((aux=stdInput.readLine()) != null){
                
                salida = stdInput.readLine();
            }

            //System.out.println(salida);
            
        } catch (IOException ex) {
            
        }
        
        return salida;
    }
    
}
