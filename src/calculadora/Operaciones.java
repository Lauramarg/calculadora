/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Estudiante
 */
public class Operaciones {
    
    private  int p;
    private int d;

    public Operaciones(int a, int b) {
        this.p = p;
        this.d = d;
    }
     int suma(int p,int d){
         int resultado=0;
         
         
         resultado = p+d;
         
          return resultado;
     }
    
     
     int resta(int p , int d){
         
         int respuesta=0;
         
         respuesta=p-d;
         
         return respuesta;
         
     } 
     
     int multiplicacion(int p, int d){
         
         int respuesta=0;
         
         respuesta= p*d;
         
         return respuesta;
     } 
     
         
         float div(int p, int d)throws Cero{
             
             float respuesta=0;
             
             if(d==0){
                 throw new Cero( " no se puede resalizar la operacion");
             }
             
             respuesta= p/d;
             
             return respuesta;
             
             
         
         
     } 
     
    
     
}
