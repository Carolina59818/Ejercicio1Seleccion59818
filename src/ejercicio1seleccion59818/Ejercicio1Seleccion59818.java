/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion59818;

import java.util.Scanner;

/**
 *
 * @author caroc
 */
public class Ejercicio1Seleccion59818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Elabore un programa que lea tres números enteros e imprima el mayor de ellos        
        Scanner entrada = new Scanner(System.in);
        int valor1 ; 
        int valor2 ;
        int valor3 ;
       
        System.out.println("Escriba valor 1 ");
             valor1 = entrada.nextInt(); 
        System.out.println("Escriba valor 2 ");
             valor2 = entrada.nextInt();
        System.out.println("Escriba valor 3 ");
             valor3 = entrada.nextInt();  
         
        if (valor1 > valor2 && valor1 > valor3) {
             System.out.println("el valor mayor es  = " + valor1 );
        } else  if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("el valor mayor es  = " + valor2 );
               } else  {          
                 System.out.println("el valor mayor es  = " + valor3 ); 
                                 
                 
             }
            
        }
        
}
    
