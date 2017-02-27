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
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Comision f=new Comision ();
     double com= f.computeCommision(10, 50);
        System.out.println(com);  
    double com1= f.computeCommision(50);
        System.out.println(com1);  

    }
    
}
