/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSerialKey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/**
 *
 * @author Asus
 */
public class ServiciosDD implements InterfazDDServicios{

    @Override
    public String obtenerSerialDD(String key) {
        
        String serial = "";
        
        try {
              
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(key.getBytes());
            byte[] digest = md.digest();
            
            for (byte b : digest) {
                serial = serial + b;
            }    
            
        } 
        
        catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ServiciosDD.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return serial;
        
    }

    @Override
    public boolean validarSerial(String serialCifrado) {
        
        Boolean validar = false;
        String cifrado = "";
        
        try {
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(this.obtenerLlave().getBytes());
            byte[] digest = md.digest();
            
            for (byte b : digest) {
                cifrado = cifrado + b;
            }
           
        }
        
        catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ServiciosDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(serialCifrado.equals(cifrado)){
            validar = true;
        }
        
        return validar;
    }

    @Override
    public String obtenerLlave() {
        
        String comando = "wmic diskdrive get serialnumber";
        String salida = "";
        String llave = "";
        
        try {
            
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
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(serial.getBytes());
            byte[] digest = md.digest();
            
            for (byte b : digest) {
                llave = llave + b;
            }
            
            
            
        } catch (IOException ex) {
            
        } 
        
        catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ServiciosDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return llave;
    }
    
    
    
}
