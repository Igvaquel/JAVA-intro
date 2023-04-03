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
public class Subprogramas {
    public static void main(String[] args){
        
        /*EJ1
        Scanner leer = new Scanner(System.in);
        int op,num1,num2;
        System.out.println("Ingrese los 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("Para sumar ingrese 1");
        System.out.println("Para restar ingrese 2");
        System.out.println("Para multiplicar ingrese 3");
        System.out.println("Para dividir ingrese 4");
        op = leer.nextInt();
        
        int retorno1= sumar(num1,num2);
        int retorno2= resta(num1,num2);
        int retorno3= multiplicar(num1,num2);
        int retorno4= dividir(num1,num2);

        switch(op) {
         case 1:
         System.out.println("La suma de ambos es de: "+ retorno1);
         break;
         case 2:
         System.out.println("La resta de ambos es de: "+ retorno2);
         break;
         case 3:
         System.out.println("La multiplicacion de ambos es de: "+ retorno3);
         break;
         case 4:
         System.out.println("La division de ambos es de: "+ retorno4);
         break;
        
         
         default:
         System.out.println("Numero no apto");
        }*/
        
        /*EJ2
        Scanner leer = new Scanner(System.in);
        int personas;
        System.out.println("Ingrese la cantidad de personas");
        personas = leer.nextInt();
        reconocimiento(personas);*/
        
        /*EJ3
        Scanner leer = new Scanner(System.in);
        int moneda,cambio;
        System.out.println("Ingrese la de euros para convetir");
        moneda = leer.nextInt();
        System.out.println("A que otra moneda desea convetir? "+"\n"+"1.Libras "+"\n"+"2.Dolares "+"\n"+"3.Yenes");
        cambio = leer.nextInt();
        convertir(moneda,cambio);*/
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        if(primo(num) == true){
            System.out.println("Numero primo");
        }else{
            System.out.println("No numero primo");
        }
    }
    
    
    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }
    public static int resta(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }
    public static int multiplicar(int num1, int num2) {
        int multiplicar;
        multiplicar = num1 * num2;
        return multiplicar;
    }
    public static int dividir(int num1, int num2) {
        int dividir;
        dividir = num1 / num2;
        return dividir;
    }
    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
        }
    }

    return true;
    }
    
    public static void convertir(int moneda, int cambio){
        switch(cambio){
            case 1 :
            System.out.println(moneda +" en Libras es "+ moneda*0.86 );
            break;
            case 2 :
            System.out.println(moneda +" en Dolares es "+ moneda*1.28611 );
            break;
            case 3 :
            System.out.println(moneda +" en Yenes es "+ moneda*129.852 );
            break;
            default:
              System.out.println("Numero ingresado no coincide con las opciones");  
        }
    }

    
    public static void reconocimiento(int personas) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String opcion;
        for(int i=0;i<personas;i++){
        System.out.println("Ingrese el nombre completo de la persona");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        edad = leer.nextInt();
        if(edad>=18){
            System.out.println("La persona en la posocion "+(i+1)+" se llama "+nombre+" y tiene "+edad+ " años, es mayor de edad");
        }else{
            System.out.println("La persona en la posocion "+(i+1)+" se llama "+nombre+" y tiene "+edad+ " años, es menor de edad");
        }
        
        System.out.print("Desea continuar?");
        leer.nextLine();
        opcion = leer.nextLine();
        if(opcion.equalsIgnoreCase("no")){
            break;
        }
        
    }
     
        
    
        
    }
    
    
}
