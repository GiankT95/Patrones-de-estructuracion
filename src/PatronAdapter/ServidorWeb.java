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
public class ServidorWeb {

    Documento pdf;
    
    public ServidorWeb() {
        pdf = new DocumentoPDF();
    }

    public Documento getPdf() {
        return pdf;
    }

    public void setPdf(Documento pdf) {
        this.pdf = pdf;
    }
    
    
    
}
