/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerialKey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class ServiciosDD implements InterfazDDServicios{

    @Override
    public String obtenerSerialDD() {
        
        
        
        
        try {
            
            String comando = "wmic diskdrive get serialnumber";
            String salida = "";
            
            
            Process proceso = Runtime.getRuntime().exec(comando);
            
            InputStreamReader input = new InputStreamReader(proceso.getInputStream());
            BufferedReader stdInput = new BufferedReader(input);

            String aux = null;
       
            while((aux=stdInput.readLine()) != null){
                
                salida = salida + aux;
            }

            String serial = "";
            
            for(int i=16; i<salida.length()-2; i++){
                serial = serial + salida.charAt(i);
            }
            
            char array[]=serial.toCharArray(); 
         
            for(int i=0;i<array.length;i++){ 
                array[i]=(char)(array[i]+(char)10);
            }
            
            String cifrado = String.valueOf(array);
            return cifrado;
            
        } catch (IOException ex) {
            
        }
        
        return null;
        
    }
    
}
