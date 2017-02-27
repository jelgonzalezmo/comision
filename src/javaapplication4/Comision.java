/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Estudiante
 */
public class Comision {
    private double ventas;
    private double comision;
    
    
public double computeCommision(double a,double b){
   a=this.ventas;
   b=this.comision;
   return(a*b);
}    
   public double computeCommision(double c){
   c=this.ventas;
   comision=(ventas*0.075);
   return comision;
}    
}
