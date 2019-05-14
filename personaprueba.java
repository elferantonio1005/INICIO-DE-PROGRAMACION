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
public class personaprueba {
    
     public static void main(String args[]){
            Persona p1=new Persona();
       
        
        p1.nombre="juan";
        p1.apellidoPaterno="ramos";
        p1.apellidoMaterno="ramos";
        p1.sede="AV.Independencia";
        p1.carrera="computacion";
        p1.not1=15;
        p1.not2=18;
        p1.not3=20;
        p1.promedio();
        p1.desplegarNombre();
        
    }
}