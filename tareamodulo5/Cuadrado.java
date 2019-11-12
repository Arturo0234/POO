/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Usuario1
 */
public class Cuadrado extends Formas {
    
    public Cuadrado(){
        setColor("Amarillo");
        setArea(5);
    }

    @Override
     public String getInformacionFiguras() {

    return "Información del Cuadrado";       
    }
}
