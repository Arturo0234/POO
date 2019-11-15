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
public class Triangulo extends Formas {
    public Triangulo(){
        setColor("Azul");
        setAngulo(6,4);
    }

    @Override
   public String getInformacionFiguras() {
     return"Información del Triangulo";
       }
    
    
}
