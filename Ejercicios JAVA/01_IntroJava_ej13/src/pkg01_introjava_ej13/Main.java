/*
INTRO JAVA - EJERCICIO 13
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package pkg01_introjava_ej13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un número del 1 al 10: ");
        int num = sc.nextInt();
        while (num < 0 || num > 10) {
            System.out.println("El número NO ESTá entre el 1 al 10.");
            System.out.print("Ingrese un número dentro del rango");
            num = sc.nextInt();
        }
        System.out.println("El valor es CORRECTO y se encuentra dentro del Rango.");
    }
    
}
