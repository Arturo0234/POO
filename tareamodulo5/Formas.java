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
public abstract class Formas {
    
    private String color;
    private double radio;
    private double largo;
    private double angulo;
    private double area;
   
    
    public Formas(){    
    }
    public void setColor(String color){
        this.color=color;
    }public String getColor(){
        return color;
    }
    
    public void setRadio(double radio){
        this.radio=radio/2;  
    }
    public double getRadio(){
        return this.radio;

    }
    
    public void setLargo(double largo ){
        this.largo= largo;
    }
    public double getLargo(){
        return this.largo;
    }
    
    public void setAngulo(double angulo,double base){
        this.angulo=angulo*base/2;
        
    }
    public double getAngulo(){
        return this.angulo;
    }
    
    public void setArea(double area){
        this.area= area*4;
    }
    public double getArea(){
        return this.area;
    }
   
    abstract String getInformacionFiguras();
         
     
  
}
