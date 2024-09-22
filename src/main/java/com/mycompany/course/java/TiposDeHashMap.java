/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course.java;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ingaa
 */
public class TiposDeHashMap {
    public static void main(String[] args) {
        System.out.println("HashMap");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Uno", 100);
        map.put("Sebastian", 958658475);
        map.put("Carlos", 958658475);
        map.put("Gustavo", 958658475);
        
        Integer valor = map.get("Uno");
        
        System.out.println("Valores de map: " + map);
        System.out.println("Valore de map: " + valor);
        
        Set<String> nombreContactos = map.keySet();
        
        System.out.println("Tus contactos");
        System.out.println(nombreContactos);
        
        for (String nombreContacto : nombreContactos) {
            System.err.println(nombreContacto);
        }
        
        
        System.out.print("Ingrese el nombre del contacto: ");
        Scanner scan = new Scanner(System.in);
        
        String nombreContacto = scan.next();
        Integer numero = map.get(nombreContacto);
        
        if (numero == null) {
            System.out.println("El contacto no existe");
        }
        
        System.out.println("El numero de " + nombreContacto + " es " + numero);
        
    }
    
    public static void buscarCapital(String pais) {
        HashMap<String, String> capitalPaises = new HashMap<>();
        capitalPaises.put("Peru", "Lima");
        capitalPaises.put("Chile", "Santiago");
        capitalPaises.put("Canada", "Ottawa");
        
        Set<String> nombrePaises = capitalPaises.keySet();
        
        System.out.println("Los Paises son: ");
        
        for (String nombrePais : nombrePaises) {
            System.out.println("Pais->" + nombrePais);
        }
        
        System.out.print("Ingrese el nombre del pais: ");
        Scanner scan = new Scanner(System.in);
        
        String nombrePaisEscaneado = scan.next();
        String paisSeleccionado = capitalPaises.get(nombrePaisEscaneado);
        
        if (paisSeleccionado == null) {
            System.out.println("El pais no existe");
        } else {
            System.out.println("La capital de " + nombrePaisEscaneado + " es " + paisSeleccionado);
        }
        
        
    }
    
    public static int sumaArray(int[] numeros) {
        
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        return suma;
    }
}
