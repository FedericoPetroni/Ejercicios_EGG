/*
INTRO JAVA - EJERCICIO 04
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package pkg01_introjava_ej04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase:");
        String frase = sc.next();
        System.out.println("Su frase en minúsculas: \" " + frase.toLowerCase() + "\"");
        System.out.println("Su frase en mayúsculas: \" " + frase.toUpperCase() + "\"");
    }

}
