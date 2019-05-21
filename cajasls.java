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
public class cajasls {
int ancho;
int alto;
int prof;
    int caja (int ancho, int alto, int prof)//
    {
        this.ancho=ancho;
        this.alto=alto;
        this.prof=prof;
    return 0;
        
    }
    int volumen(int ancho, int alto, int prof)
    {
        return ancho*alto*prof;
    }
    void doble()
    {
        this.ancho=this.ancho*2;
        this.alto=this.alto*2;
        this.prof=this.prof*2;
    }
    int area()
    {   
        return ancho*alto;
    }
    int sumacaras(int ancho, int alto, int prof)
    {
        int a,p,s;
       a=alto*ancho;
       a=a*2;
       p=alto*prof;
       p=p*4;
       s=a+p;
       return s;
    }
    
    
}