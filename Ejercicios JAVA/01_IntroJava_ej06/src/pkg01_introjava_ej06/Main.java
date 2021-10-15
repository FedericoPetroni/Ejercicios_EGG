 /*
INTRO JAVA - EJERCICIO 06
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/
package pkg01_introjava_ej06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        System.out.println("El DOBLE es = " + (num * 2));
        System.out.println("El TRIPLE es = " + (num * 3));
        System.out.println("La RAIZ CUADRADA es = " + Math.sqrt(num));
    }  
}
