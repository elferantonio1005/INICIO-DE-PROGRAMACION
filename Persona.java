/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author PC01-LAB02
 */
public class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String carrera;
    String sede;
    long dirreccion;
   double promedio;
    double not1;
    double not2;
    double not3;
    public void desplegarNombre(){
        System.out.println("nombre: "+nombre);
        System.out.println("Apellido Paterno: "+apellidoPaterno);
        System.out.println("apellido Materno: "+apellidoMaterno);
        System.out.println("sede: "+sede);
        System.out.println("carrera: "+carrera);
        System.out.println("nota 1:"+not1);
        System.out.println("nota 2:"+not2);
        System.out.println("nota 3:"+not3);
        System.out.println("el promedio es"+promedio);
       
        
    }
   public void promedio(){
           
       promedio=(not1+not2+not3)/3;
      
   }
}
