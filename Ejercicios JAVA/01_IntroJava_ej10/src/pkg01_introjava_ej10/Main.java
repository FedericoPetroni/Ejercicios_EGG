/*
INTRO JAVA - EJERCICIO 10
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/
package pkg01_introjava_ej10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra/frase que contenga al menos 8 caracteres:");
        String frase = sc.next();
        if (frase.length() >= 8) {
            System.out.println("La frase posee " + frase.length() + " caraceteres y es CORRECTA.");
        } else {
            System.out.println("La frase posee " + frase.length() + " caraceteres y es INCORRECTA.");
        }
    }
    
}
