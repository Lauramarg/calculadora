/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;


public class Calculadora {

    
    public static void main(String[] args) throws Cero {
        
       Scanner teclado = new Scanner(System.in);
       
       int p; 
       int d;
        
       p=teclado.nextInt();
       d = teclado.nextInt();
       
       System.out.println("ingrese primer numero ");
       p= teclado.nextInt();
       
       System.out.println("ingrese segundo numero ");
       d= teclado.nextInt();
       
       Operaciones c= new Operaciones(p, d);
       
       
       try{
           System.out.println("division"+c.div(p, d));
       
       }catch(Cero e){
           
            System.out.println(e.getLocalizedMessage());
            
           
           
       }finally{
           
       }
       
       
       System.out.println("suma"+c.suma(p, d));
        System.out.println("resta"+c.resta(p, d));
         System.out.println("multiplicacion"+c.multiplicacion(p, d));
       
      
    }

   
    }
    

