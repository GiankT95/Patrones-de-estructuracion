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
public class DocumentoPDF implements Documento{

    protected ComponentePDF herramientaPDF;

    public DocumentoPDF() {
        herramientaPDF = new ComponentePDF();
    }  
    
    @Override
    public void setContenido(String contenido) {
        herramientaPDF.pdfFijaContenido(contenido);
    }

    @Override
    public void imprime() {
        herramientaPDF.pdfEnviaImpresora();
    }

    @Override
    public void dibuja() {
        herramientaPDF.pdfPreparaVisualizacion();
        herramientaPDF.pdfRefresca();
        herramientaPDF.pdfFinalizaVisualizacion();
    }
    
}
