/*
INTRO JAVA - EJERCICIO 09
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
*/
package pkg01_introjava_ej09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase y se verificará si es igual a *eureka*: ");
        String frase = sc.next();
        if (frase.equals("eureka")) {
            System.out.println("La frase escrita ES IGUAL a *eureka*.");
        } else {
            System.out.println("La frase NO ES IGUAL a *eureka*.");
        }
    }
}
