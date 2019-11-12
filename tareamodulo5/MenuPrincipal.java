
package com.mycompany.tareamodulo5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;


public class MenuPrincipal {
   
    
    public static void  main( String[] args)  {
        Circulo circulo= new Circulo();
        Linea linea= new Linea();
        Triangulo triangulo= new Triangulo();
        Cuadrado cuadrado= new Cuadrado();
        
        
       
        System.out.println(circulo.getInformacionFiguras());
        System.out.println("Color: " +circulo.getColor());
        System.out.println("El radio del circulo: " +circulo.getRadio());
        System.out.println("********************************************************************");
        System.out.println(linea.getInformacionFiguras());
        System.out.println("Color: " +linea.getColor());
        System.out.println("El largo de la linea " +linea.getLargo());
        System.out.println("********************************************************************");
        System.out.println(triangulo.getInformacionFiguras());
        System.out.println("Color: " +triangulo.getColor());
        System.out.println("El area del triangulo: " +triangulo.getAngulo());
        System.out.println("********************************************************************");
        System.out.println(cuadrado.getInformacionFiguras());
        System.out.println("Color: " +cuadrado.getColor());
        System.out.println("El area del cuadrado: " +cuadrado.getArea());
        
    
}
}