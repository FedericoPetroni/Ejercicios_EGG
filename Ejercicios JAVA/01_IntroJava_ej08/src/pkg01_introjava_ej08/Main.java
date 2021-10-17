/*
INTRO JAVA - EJERCICIO 08
Crear un programa que dado un numero determine si es par o impar.
 */
package pkg01_introjava_ej08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es PAR.");
        } else if (num % 2 != 0) {
            System.out.println("El número " + num + " es IMPAR.");
        }
    }
}
