package Encapsulamiento;


public class Ciudadano {
    
    public String nombre;
    private int edad;
    private int añosdeExp;
    
    public Ciudadano(String nombre){
        this.nombre=nombre;  
    }
    
    public void imprimirCiudadano(){
        System.out.println("Nombre: " +nombre);
    }
    
    public void setedad(int _edad){
        this.edad= _edad;
    }
    
    public int getedad(){    
        return edad;
    }
    
    public void setañosdeExp(int _añosdeExp){
        this.añosdeExp= _añosdeExp;
    }
    
    public int getañosdeExp(){
        return añosdeExp;
    }
}
