/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class Introjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Scanner leer = new Scanner(System.in);
        String nombre ;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");*/
        
        /* EJ 1
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();        
        System.out.println(num1 + num2); */
       
        /* EJ 2
        Scanner leer = new Scanner(System.in);
        String nombre ;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Hola " + nombre);*/
        
        /* EJ 3
        Scanner leer = new Scanner(System.in);
        String frase ;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println("frase en minuscula: " + frase.toLowerCase());
        System.out.println("frase en mayusculas: " + frase.toUpperCase());*/        
        
        /* EJ 4
        Scanner leer = new Scanner(System.in);
        int temp;
        System.out.println("Ingrese la temperatura ");
        temp = leer.nextInt();
                
        System.out.println("La temperatura en Fahrenheit es: " + (32 + (9 *  temp / 5)) );*/
        
        
        //EJ 5
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese 1 numero");
        num = leer.nextInt();       
        System.out.println("El doble: " + num*2  + " ,el triple: " + num*3 + " ,la raiz cuadrada: " + Math.sqrt(num) ); 
        
        
    }
    
}
