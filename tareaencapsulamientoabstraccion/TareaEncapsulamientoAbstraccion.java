package tareaencapsulamientoabstraccion;


import Encapsulamiento.Ciudadano;

public class TareaEncapsulamientoAbstraccion {

    public static void main(String[] args) {
       
        //1. Parte: Encapsulamiento
        System.err.println("1. Parte ");
        Ciudadano ciudadano=new Ciudadano("Jesus Acosta");
        ciudadano.imprimirCiudadano();
        ciudadano.setedad(19);
        ciudadano.setañosdeExp(5);
        
        System.out.println("edad: " +ciudadano.getedad());
        System.out.println("Años de experencia: " +ciudadano.getañosdeExp());
        System.out.println("******************************************************************************************");
    
    
    }
    
}
