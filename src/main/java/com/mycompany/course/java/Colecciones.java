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
public class Colecciones {
    public static void main(String[] args) {
        System.out.println("Colecciones");
        
        // Declarar correctamente el ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hola");
        arrayList.add("mundo");
        arrayList.add("Java");
        
        // Imprimir elementos con un bucle for
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        
        // Imprimir elementos con un bucle for-each
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
        
        // Eliminando valores de atrás hacia adelante
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println("Eliminando: " + arrayList.remove(i));
        }
        
        // Elimina todos los elementos
        arrayList.clear();
        
        // Mostrar el estado del ArrayList
        System.out.println("Lista después de eliminar: " + arrayList); // Esto debería mostrar una lista vacía
    }
}
