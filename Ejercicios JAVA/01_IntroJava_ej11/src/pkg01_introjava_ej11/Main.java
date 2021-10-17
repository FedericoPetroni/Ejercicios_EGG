/*
INTRO JAVA - EJERCICIO 11
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package pkg01_introjava_ej11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra/frase para validar si comienza con la letra \"A\":");
        String frase = sc.next();
        if (frase.substring(0,1).equalsIgnoreCase("A")) {
            System.out.println("La palabra/frase es CORRECTA.");
        } else {
            System.out.println("La palabra/frase es INCORRECTA.");
        }
    }

}
