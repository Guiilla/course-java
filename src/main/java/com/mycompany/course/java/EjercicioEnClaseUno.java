/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course.java;

import java.util.ArrayList;

/**
 *
 * @author ingaa
 */
public class EjercicioEnClaseUno {
    public static void main(String[] args) {
        
        System.out.println("Ejercio 1");
        ejercicioUno();
        
        System.out.println("Ejercio 2");
        ejercicioDos();
        
        System.out.println("Ejercio 3");
        TiposDeHashMap ejercicioTres = new TiposDeHashMap();
        ejercicioTres.buscarCapital("Peru");
        
        TiposDeHashMap ejercicioCuatro = new TiposDeHashMap();
        int[] numeros = {1, 2, 3, 4, 5};
        int resultadoSuma = ejercicioCuatro.sumaArray(numeros);
        System.out.println("La suma del arreglo es: " + resultadoSuma);
        
        
    }
    
    public static void ejercicioUno() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
    
    public static void ejercicioDos() {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Sebastian");
        listaNombres.add("Gustavo");
        listaNombres.add("Carlos");
        listaNombres.add("Anderson");
        listaNombres.add("Manuel");
        
        for (int i = listaNombres.size() - 1; i >= 0; i--) {
            System.out.println(listaNombres.get(i));
        }
    }
    
}
