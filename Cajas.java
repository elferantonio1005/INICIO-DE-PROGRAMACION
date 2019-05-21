/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajas;



/**
 *
 * @author PC01-LAB02
 */
public class Cajas {
  
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int an=8;
        int alt=7;
        int prof=6;
        int r,s,d;
        cajasls f=new cajasls();
        f.doble();
        r=f.sumacaras(an,alt,prof);
        s=f.volumen(an,alt,prof);
        System.out.println("el alto es: "+an);
         System.out.println("el alto es: "+alt);
          System.out.println("el profundo es: "+prof);
        
        System.out.println("Suma de caras: "+r);
        System.out.println("el Volumen es: "+s);   
        // TODO code application logic here
    }
    
}
