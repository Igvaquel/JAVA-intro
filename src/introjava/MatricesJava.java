/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class MatricesJava {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        /*EJ1
        int[] arreglo = new int[100];
        for(int i=0;i<100;i++){
            arreglo[i]=(i+1);
        }
        for(int i=99;i>=0;i--){
            System.out.println("[" + arreglo[i] + "]");}*/
        
        
        /*EJ2
        System.out.println("Ingrese el largo del arreglo");
        int num = leer.nextInt();
        int[] arreglo = new int[num];
        boolean bandera = false;
        for(int i=0;i< arreglo.length ;i++){
            arreglo[i] = rand.nextInt(101);
        }
        
        System.out.println("Ingrese un numero a buscar en el arreglo");
        int numB = leer.nextInt();
        
        for(int i=0;i< arreglo.length ;i++){
            if(arreglo[i] == numB && bandera==false){
                System.out.println("El numero se encuentra en la posicion "+i);
                bandera = true;
            }           
        }
        if(bandera==true){
            System.out.println("Y se encontro mas de 1 vez");
        }else{
            System.out.println("No se encontro el numero");
        }*/
        
        /*EJ3
        System.out.println("Ingrese el largo del arreglo");
        int num = leer.nextInt();
        int aux1 = 0,aux2 = 0,aux3 = 0,aux4 = 0,aux5 = 0;
        int[] arreglo = new int[num];
        for(int i=0;i< arreglo.length ;i++){
            //arreglo[i] = leer.nextInt();
            arreglo[i] = rand.nextInt(100000);
        }
        for(int i=0;i< arreglo.length ;i++){
            switch (String.valueOf(arreglo[i]).length()) {
                case 1:
                    aux1 += 1;
                    break;
                case 2:
                    aux2 += 1;
                    break;
                case 3:
                    aux3 += 1;
                    break;
                case 4:
                    aux4 += 1;
                    break;
                case 5:
                    aux5 += 1;
                    break;
            }
        }
        for(int i=0;i< arreglo.length ;i++){
            System.out.println("[" + arreglo[i] + "]");
        }
        
        System.out.println("1."+aux1+" 2."+aux2+ " 3."+aux3+" 4."+aux4+" 5."+aux5 );*/        
        
        /*EJ4
        int[][] arreglo = new int[4][4];
        for(int i=0;i<=3 ;i++){
            for(int j=0;j<=3;j++){
                arreglo[i][j] = rand.nextInt(100);
            }
        }
        for(int i=0;i<=3 ;i++){
            for(int j=0;j<=3;j++){
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }
        for(int i=0;i<=3 ;i++){
            for(int j=0;j<=3;j++){
                System.out.print("[" + arreglo[j][i] + "]");
            }
            System.out.println("");
        }*/
        
        /*EJ5
        boolean esAntisimetrica = true;
        int[][] arreglo = new int[3][3];
        for(int i=0;i<=2 ;i++){
            for(int j=0;j<=2;j++){
                System.out.print("Ingrese el numero que va en la posicion "+i+","+j+" :" );
                arreglo[i][j] = leer.nextInt();
            }
        }

        for(int i=0;i<=2 ;i++){
            for(int j=0;j<=2;j++){
                if (arreglo[i][j] != -arreglo[j][i]) {
                        esAntisimetrica = false;
                    break;
                }
            } 
        }
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        } */
        
        /*EJ6
        int[][] arreglo = new int[3][3];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        
        for(int i=0;i<=2 ;i++){
            for(int j=0;j<=2;j++){
                arreglo[i][j] = leer.nextInt();
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            sumaDiagonalPrincipal += arreglo[i][i];
            sumaDiagonalSecundaria += arreglo[i][3 - i - 1];
        }
        
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += arreglo[i][j];
            }
            if (sumaFila != sumaDiagonalPrincipal) {
                System.out.println("La matriz no es un cuadrado mágico");
                return;
            }
        }
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna += arreglo[i][j];
            }
            if (sumaColumna != sumaDiagonalSecundaria) {
                System.out.println("La matriz no es un cuadrado mágico");
                return;
            }
        }
        System.out.println("La matriz es un cuadrado mágico");*/
        
        /*EJEX1
        System.out.println("Ingrese el largo del arreglo");
        int num = leer.nextInt();
        int total = 0;
        boolean bandera = true;
        int[] arreglo = new int[num];
        for(int i=0;i< arreglo.length ;i++){
            arreglo[i] = rand.nextInt(101);
            total += arreglo[i];
        }
        while(bandera){
            System.out.println("Ingrese un numero a sumar");
            total += leer.nextInt();
            System.out.println("seguimos? s/n");
            String s = leer.next();
            if(s.equals("s")){
                
            }else{
                bandera =false;
            }
        }
        System.out.println(total);*/
        
        /*EJEX2
        System.out.println("Ingrese el largo de los arreglos");
        int num = leer.nextInt();
        boolean bandera = true;
        int[] arreglo1 = new int[num];
        int[] arreglo2 = new int[num];
        int x = 0;
        System.out.println("Ingrese los numeros del primer arreglo");
        for(int i=0;i< num ;i++){
            arreglo1[i] = leer.nextInt();  
        }
        System.out.println("Ingrese los numeros del segundo arreglo");
        for(int j=0;j< num ;j++){
            arreglo2[j] = leer.nextInt();  
        }
        while(arreglo1[x]==arreglo2[x]){
            System.out.println("La posicion "+x+" son iguales");
            x++;
        }*/
        
        /*EJEX3
        int[] vector = new int[10];
        mostrarVector(vector);*/
        
        /*EJEX4
        int[] alumnos = new int[10];
        int aux1,aux2,aux3,aux4;
        int aprobados =0, reprobados=0;
        for(int i =0; i<=9;i++){
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo 10%");
            aux1 = leer.nextInt();
            System.out.println("Ingrese la nota segundo trabajo práctico evaluativo 15%");
            aux2 = leer.nextInt();
            System.out.println("Ingrese la nota Primer Integrador 25%");
            aux3 = leer.nextInt();
            System.out.println("Ingrese la nota Segundo integrador 50%");   
            aux4 = leer.nextInt();
            alumnos[i]= (((aux1*10)+(aux2*15)+(aux3*25)+(aux4*50))/(10+15+25+50));
        }
        for(int i =0; i<=9;i++){
            if(alumnos[i]>=70){
                aprobados+=1;  
            }else{
                reprobados+=1;
            }
        }
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Reprobados: "+reprobados);*/
        
        /*EJEX5
        System.out.println("Ingrese las dimensiones de la matriz");
        int n =leer.nextInt();
        int m =leer.nextInt();
        int aux =0;
        int[][]matriz = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                matriz[i][j] = rand.nextInt(100);
            }
        }       
       for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                aux += matriz[i][j];
            }            
        }     
        System.out.println("La suma de todos los valores de la matriz es: " + aux);*/
        
        /*EJEX6
        char[][] matriz = new char[20][20];
        String palabra;
        int aleatorio;
        
        for (int i = 0; i < 5; i++) {
            aleatorio = rand.nextInt(20);
            do {
                System.out.println("Ingresa una palabra de 3 a 5 caracteres");
                palabra = leer.next();
            } while (palabra.length() > 5 || palabra.length() < 3);
            for (int j = 0; j < palabra.length(); j++) {
                matriz[aleatorio][j] = palabra.charAt(j);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               if (matriz[i][j] == '\u0000') {
                   matriz[i][j] = (char) ('0' + rand.nextInt(10));
               }
               System.out.print(matriz[i][j] + " ");
           }
           System.out.println();
       }*/
        
        /*EJEX7
        System.out.print("Ingresa la cantidad de números de la sucesión de Fibonacci que deseas generar: ");
        int n = leer.nextInt();
        int[] fibonacci = new int[n];
        
        for (int i = 1; i < n; i++) {
            if (i < 2) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        
        System.out.print("Los " + n + " primeros números de la sucesión de Fibonacci son: ");
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }*/
        
        
    }
    
    public static void llenarVector(int[] vector){
        Random rand = new Random();
        for(int i =0; i<=9;i++){
            vector[i]= rand.nextInt(100);
        }
    }
    public static void mostrarVector(int[] vector){
        llenarVector(vector);
        for(int i =0; i<=9;i++){
            System.out.print(vector[i]+",");
        }
        
    }


}
