 /*
INTRO JAVA - EJERCICIO 02
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
package pkg01_introjava_ej02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int num2 = sc.nextInt();
        System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es = " + (num1 + num2));
    }
    
}
