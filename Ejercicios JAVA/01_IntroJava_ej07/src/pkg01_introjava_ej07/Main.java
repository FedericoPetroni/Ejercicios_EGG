 /*
INTRO JAVA - EJERCICIO 07
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
package pkg01_introjava_ej07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el 1er Número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el 2d Número entero: ");
        int num2 = sc.nextInt();
        System.out.println("El número mayor es: " + Math.max(num2, num1));
        System.out.println("El número menor es: " + Math.min(num2, num1));
    }
}
