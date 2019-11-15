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
public class Linea extends Formas{
    public Linea(){
        setColor("Verde");
        setLargo(10);
    }

    @Override
   public String getInformacionFiguras() {
    return "Información de la Linea";
    }
    
}
