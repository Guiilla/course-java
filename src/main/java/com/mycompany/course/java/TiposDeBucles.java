/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ingaa
 */
public class TiposDeBucles {
    public static void main(String[] args) {
        
        condicionalesTeoria();
        
        System.out.println("Ejercicios con bucle");
        ejercicioUno();
        ejercicioDos();
        ejercicioTres();
        
    }
    
    public static void condicionalesTeoria() {
        System.out.println("Tipos de Bucles");
        
        System.out.println("Bucle for");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola mundo " + i);
        }
        
        System.out.println("Bucle while");
        int countWhile = 0;
        
        while (countWhile < 10) {            
            System.out.println("Hola mundo desde el while " + countWhile);
            countWhile++;
        }
        
        System.out.println("Bucle do while");
        int countDoWhile = 0;
        
        do {            
            System.out.println("Hola mundo desde el do while " + countDoWhile);
            countDoWhile++;
        } while (countDoWhile < 10);
    }
    
    public static void ejercicioUno() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i: " + i);
        }
        
        int countWhile = 1;
        while (countWhile <= 10) {            
            System.out.println("countWhile: " + countWhile);
            countWhile++;
        }
        
        int countDoWhile = 1;
        do {
            System.out.println("countDoWhile: " + countDoWhile);
            countDoWhile++;
        } while (countDoWhile <= 10);
    }
    
    public static void ejercicioDos() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite un numero entero: ");
        
        int numeroSeleccionado = scan.nextInt();
        int sumaTotal = 0;
        
        for (int i = 1; i <= numeroSeleccionado; i++) {
            sumaTotal += i;
        }
        
        System.out.println("El numero ingresado fue: " + numeroSeleccionado);
        System.out.println("La suma de los N primeros numeros es: " + sumaTotal);
    }
    
    public static void ejercicioTres() {
        // Crear un numero aleatorio entre 1 al 10, el usuario tiene que adivinar el numero
        
        Random randon = new Random();
        Scanner scan = new Scanner(System.in);
        int numeroAleatorio = randon.nextInt(10) + 1;
        int intento;
        
        System.out.println("El numero randon es: " + numeroAleatorio);
        
        do {            
            
            System.out.print("Adivina el numero entre el 1 y el 10: ");
            intento = scan.nextInt();
            
            if (intento < numeroAleatorio) {
                System.out.println("Muy bajo, intenta de nuevo");
            } else if (intento > numeroAleatorio) {
                System.out.println("Muy alto, intenta de nuevo");
            }
            
        } while (intento != numeroAleatorio);
        
        System.out.println("Felicidades, adivinaste el numero");
        scan.close();
        
    }
}
