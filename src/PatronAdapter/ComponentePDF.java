/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronAdapter;

/**
 *
 * @author Fuller 101
 */
public class ComponentePDF {
    
    public void pdfFijaContenido(String contenido){
        System.out.println(contenido);
    }
    
    public void pdfPreparaVisualizacion(){
        System.out.println("Preparando visualizacion....");
    }
    
    public void pdfRefresca(){
        System.out.println("Visualizacion refrescada.");
    }
    
    public void pdfFinalizaVisualizacion(){
        System.out.println("Visualizacion finalizada.");
    }
    
    public void pdfEnviaImpresora(){
        System.out.println("Enviando contenido a impresora....");
    }
}
