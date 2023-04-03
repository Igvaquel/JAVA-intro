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
public class EstructurasControlJava {
    
    public static void main(String[] args) {
        
        /*EJ1
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        if ( num%2 != 0) {
            System.out.println("Su numero es impar");  
         
        }else{ System.out.println("Su numero es par");  }*/
        
        /*EJ2
        Scanner leer = new Scanner(System.in);
        String frase ;
        String correcta = "eureka";
        System.out.println("Ingrese la palabra eureka ");
        frase = leer.nextLine();
        if (correcta.equals(frase)) {
            System.out.println("Correcto!");
        }else if (correcta.equals(frase.toLowerCase())) {
            System.out.println("Proba en minuscula!");
        }else{
            System.out.println("Incorrecto!");
        }*/
        
        /*EJ3
        Scanner leer = new Scanner(System.in);
        String frase ;
        System.out.println("Ingrese una palabra/frase de mas de 8 caracteres ");
        frase = leer.nextLine();
        if ( frase.length() == 8 ) {
            System.out.println("Correcto!");    
        }else{
            System.out.println("Incorrecto!");
        }*/
        /*EJ4        
        Scanner leer = new Scanner(System.in);
        String frase ;
        String letra = "a";
        System.out.println("Ingrese una palabra/frase que comience con a ");
        frase = leer.nextLine();
        
        if ( letra.equals(frase.substring(0,1))) {
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }*/
        
        
        /*EJ5
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int limite;
        int pivote;
        System.out.println("Ingrese el limete");
        limite = leer.nextInt();
        
        while(num <= limite ){
            System.out.println("Ingrese un numero");
            pivote = leer.nextInt();
            num = num+pivote;
        }
        System.out.println("se paso del limite " + num);            */
        
        /*EJ6
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        String letra = "n";
        System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        
        System.out.println("Menu" + "\n" + "1. Sumar" + "\n" + "2. Restar" + "\n" + "3. Multiplicar" + "\n" + "4. Dividir" + "\n" + "5. Salir" + "\n" + "Elija una opcion:" );
        opcion = leer.nextInt();
        
        while(letra.equalsIgnoreCase("n")){
            switch(opcion) {
            case 1:
            System.out.println(num1+num2);
            letra="s";
            break;
            case 2:
            System.out.println(num1-num2);
            letra="s";
            break;
            case 3:
            System.out.println(num1*num2);
            letra="s";
            break;
            case 4:
            System.out.println(num1/num2);
            letra="s";
            break;
            case 5:
            System.out.println("¿Está seguro que desea salir del programa (s/n)?");
            letra = leer.next();
            if(letra.toLowerCase().equals("s")){
               System.out.println("Muchas gracias!!!");
               
            }else{
              System.out.println("Menu" + "\n" + "1. Sumar" + "\n" + "2. Restar" + "\n" + "3. Multiplicar" + "\n" + "4. Dividir" + "\n" + "5. Salir" + "\n" + "Elija una opcion:" );
               opcion = leer.nextInt();                         
            }                
            break;
            default:
            System.out.println("Eilja una opcion disponible");
            } 
        }*/
        
        /*EJ7
        Scanner leer = new Scanner(System.in);
        int aux, aux1, aux2, correcta, incorrecta;
        correcta=0;
        incorrecta=0;
        aux1=0;
        aux2=0;
        String cadena;
        System.out.println("Ingrese una cadena de 5 caracteres como minimo" + "\n" + "El primer caracter tiene que ser una x y la ultima una o");
        cadena = leer.nextLine();
        
        while(!cadena.equals("&&&&&")){
        
        if(cadena.substring(0,1).equalsIgnoreCase("x") && cadena.endsWith("o") && cadena.length()>=5 ){
            correcta++;
        }else{
            incorrecta++;
        }
        System.out.println("Ingrese una cadena de 5 caracteres como minimo" + "\n" + "El primer caracter tiene que ser una x y la ultima una o");
        cadena = leer.nextLine();    
        }
        
        System.out.println("Correctas: " + correcta );
        System.out.println("Incorrectas: " + incorrecta);*/
        
        
        /*EJ7
        Scanner leer = new Scanner(System.in);
        int lado;
        System.out.print("Ingrese el largo de los lados");
        lado = leer.nextInt();
        
        for(int i =0; i < lado; i++){
            System.out.print("*");
        }
        
        System.out.println();
         
        for(int i=0; i < lado-2 ; i++){
            System.out.print("*");
            for(int j = 0; j < lado-2 ; j++){
               System.out.print(" "); 
            }
            System.out.println("*");
        }
        
        for(int i =0; i < lado; i++){
            System.out.print("*");
        }*/
        
        
        /*EJEX 1
        Scanner leer = new Scanner(System.in);
        int minutos, horas, dias, iniciales ;
        
        System.out.print("Ingrese una cantidad x de minutos");
        minutos = leer.nextInt(); 
        
        iniciales = minutos;
        
        horas = minutos/60;
        minutos = minutos % 60;
        dias = horas / 24 ;
        horas = horas % 24;
       
        System.out.print("Sus minutos " + iniciales + " son: " + dias + " dias y " + horas+ " horas y " + minutos + " minutos");*/
        
            
        /*EJEX 2
        Scanner leer = new Scanner(System.in);
        int A, B, C, D, aux ;
        
        System.out.print("Ingrese 4 numeros");
        A = leer.nextInt(); 
        B = leer.nextInt(); 
        C = leer.nextInt(); 
        D = leer.nextInt(); 
        System.out.println("Valores iniciales");                                                                  
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
       
        System.out.println("Valores finales");
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C = " + C);
        System.out.println("A toma el valor de D -> A = " + A);
        System.out.println("D toma el valor de B -> D = " + D);*/
        
        /*EJEX 3
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        
        if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
           System.out.println("Su letra es vocal"); 
        }else{
            System.out.println("Su letra es consonante");
        }*/
        
        /*EJEX 4
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entre 1 al 10");
        num = leer.nextInt();

        switch(num) {
         case 1:
         System.out.println("I");
         break;
         case 2:
         System.out.println("II");
         break;
         case 3:
         System.out.println("III");
         break;
         case 4:
         System.out.println("IV");
         break;
         case 5:
         System.out.println("V");
         break;
         case 6:
         System.out.println("VI");
         break;
         case 7:
         System.out.println("VII");
         break;
         case 8:
         System.out.println("VIII");
         break;
         case 9:
         System.out.println("IX");
         break;
         case 10:
         System.out.println("X");
         break;
         
         default:
         System.out.println("Numero no apto");
        }*/

        /*EJEX 5
        Scanner leer = new Scanner(System.in);
        String letra;
        int trata = 500;
        System.out.println("Ingrese su clase de socio");
        letra = leer.next();
           
        switch(letra) {
         case "a":
         System.out.println("el precio del tratamiento es de: " + trata + " pero le en un total de " + trata*0.5);
         break;
         case "b":
         System.out.println("el precio del tratamiento es de: " + trata + " pero le en un total de " + trata*0.65);
         break;
         case "c":
         System.out.println("el precio del tratamiento es de: " + trata );
         break;
        
         
         default:
         System.out.println("Valor no apto");}*/
        
        /*EJEX 6
        Scanner leer = new Scanner(System.in);
        float num, altura, aux1 =0 ,aux2 = 0,j=0,x=0;
        System.out.println("Ingrese la cantidad de gente a medir");
        num = leer.nextInt();
        
        for(int i = 1 ; i <= num ; i++){
            System.out.println("Altura de la persona (en metros): " + i);
            altura = leer.nextFloat();
            
            if(altura<1.60){
                aux1 = aux1 + altura;
                j++;
            }
            
            aux2 = aux2 + altura;
            x++;   
        }
        
        System.out.println("El promedio por debajo de 1.60 es " + aux1/j + " m y en total " + aux2/x + " m");*/
        
        /* EJEX7
        Scanner leer = new Scanner(System.in);
        int num,i=0,num1, prom=0 , may=0, men =0;
        System.out.println("Ingrese la cantidad de numeros");
        num = leer.nextInt();
       
        while(num>i) {
            System.out.println("Ingrese 1 numero mayor a 0");
            num1 = leer.nextInt();
            
            prom = num1 + prom;
            
            if(num1>may){
                may=num1;
            }
            
            if(i==0) {
                men = num1;
            }
            
            if(num1<men){
                men=num1;
            }
            
            i++;
        }
        
        do {
            System.out.println("Ingrese 1 numero mayor a 0");
            num1 = leer.nextInt();
            
            prom = num1 + prom;
            
            if(num1>may){
                may=num1;
            }
            
            if(i==0) {
                men = num1;
            }
            
            if(num1<men){
                men=num1;
            }
            
            i++;
        } while( num> i);
        
        System.out.println("Promedio: " +prom/i+ " , Mayor: " +may+ " ,Menor: " + men);*/
     
        /* EJEX8
        Scanner leer = new Scanner(System.in);
        int num=0, p=0,inp=0, i=0 ;
        boolean  bandera = false;
        
        while(bandera==false){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if( (num % 5) == 0) {
                bandera=true;
                break;
                
            }           
            i++;
            if((num%2)==0){
                p++;
            }else{
                inp++;
            }           
        }
         System.out.println("Numeros leidos: "+i+" ,Pares: "+p+" Impares: "+inp  );*/
        
        /* EJEX9
        Scanner leer = new Scanner(System.in);
        int num1=0,num2=0,i=0 ,aux;
        System.out.println("Ingrese 2 numeros pare restar, primero el mayor");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        while(num1>=num2){
            aux = num1 - num2;
            num1 = aux;
            i++;
        }
        
        System.out.println("dado que "+num1+ " es menor que " + num2 + " , entonces: el residuo es "+num1+" y el cociente es " +i);*/
        
        /* EJEX10
        Scanner leer = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random()*10+0), num;
        System.out.println("Adivina el numero secreto entre el 0 y el 10");
        num = leer.nextInt();
        
        if(numeroAleatorio==num){
            System.out.println("Correcto!!!");
        }else{
            System.out.println("Incorrecto :( , Otro intento ");
            num = leer.nextInt();
            if(numeroAleatorio==num){
                System.out.println("Correcto!!!");  
            }else{
                System.out.println("Incorrecto :( ");
            }
        }*/
        
        /*EJEX 11
        Scanner leer = new Scanner(System.in);
        int num,d=0;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        while(num !=0){
            num=num/10;
            d++;
        }
        System.out.println("Su numero tiene "+d+" de digitos");*/
        
        /*EJEX 12
        int x=0,j=0,i=0;
        for(x = 0; x<10; x++){
            for(j=0; j<10;j++){
                for(i=0;i<10;i++){
                    System.out.print(x != 3 ? x : "E");
                    System.out.print(j != 3 ? j : "E");
                    System.out.print(i != 3 ? i : "E");
                    System.out.println("");                    
                }
            }            
        }*/
        
        /*EJEX 13
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese la cantidad de escalones");
        num = leer.nextInt();
        for(int x=0; x<=num;x++){
            for(int i=1; i<=x;i++){
                System.out.print(i);
            }
            System.out.println("");
        }*/
        
        Scanner leer = new Scanner(System.in);
        int n,m,aux, total=0, hijos=0;
        
        System.out.println("Ingrese la cantidad de familias");
        n = leer.nextInt();
        
        
        for(int x=1; x<=n;x++){
           System.out.println("Ingrese la cantidad de hijos");
           m = leer.nextInt();
           for(int j=1; j<=m;j++){
               System.out.println("Que edad tiene su hijo/a;");
               aux = leer.nextInt();
               total = aux + total;
               hijos++;
           }
        }
     
        System.out.println("Promedio de edad de todos los hijos/as: "+total/hijos);
        
        
        
    }
}
