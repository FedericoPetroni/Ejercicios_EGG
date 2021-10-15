/*
INTRO JAVA - EJERCICIO 05
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package pkg01_introjava_ej05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la temperatura en °C para convertir en °F: ");
        double grados = sc.nextDouble();
        System.out.println(grados + " °C // " + (32 + ((9 * grados) / 5)) + " °F");
    }

}
