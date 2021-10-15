/*
INTRO JAVA - EJERCICIO 03
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
*/
package pkg01_introjava_ej03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Su nombre es " + nombre);
    }
    
}
