/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course.java;

import java.util.Scanner;

/**
 *
 * @author ingaa
 */
public class OperadoresEstructurasCondicionales {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        
        int n1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        
        int n2 = scanner.nextInt();
        
        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        
        try {
            int division = n1 / n2;
            System.out.println("La division es: " + division);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            double resto = n1 / n2;
            System.out.println("El resto es: " + resto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        
        
        areaTriangulo();
        esPar();
        
        HelloWorld hellowWorld = new HelloWorld();
        hellowWorld.helloWorld();
        
        if (n1 > n2) {
            System.out.println("El numero " + n1 + " es mayor que " + n2);
        } else {
            System.out.println("El numero " + n2 + " es mayor que " + n1);
        }
        
        metodoDePago();
    }
    
    
    // Area de un triangulo
    public static void areaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite la base del triangulo: ");
        double base = scanner.nextDouble();
        
        System.out.println("Digite la altura del triangulo: ");
        double altura = scanner.nextDouble();
        
        double area_triangulo = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area_triangulo);
    }
    
    public static void esPar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el numero que desea saber si es par");
        int number = scanner.nextInt();
        
        double esPar = number % 2;
        
        if (esPar == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    
    public static void metodoDePago() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elija su metodo de pago");
        System.out.println("1. Efectivo");
        System.out.println("2. Yape");
        System.out.println("3. Plin");
        
        int metodo = scanner.nextInt();
        
        switch (metodo) {
            case 1:
                System.out.println("Selecciono metodo efectivo");
                break;
            case 2:
                System.out.println("Selecciono metodo Yape");
                break;
            case 3:
                System.out.println("Selecciono metodo Plin");
                break;
            default:
                System.out.println("Metodo de pago no encontrado");
        }
        
    }
}
