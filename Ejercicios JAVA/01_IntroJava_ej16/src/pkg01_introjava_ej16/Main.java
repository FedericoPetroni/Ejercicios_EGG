/*
INTRO JAVA - EJERCICIO 16
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar
el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el resultado de la suma de los
números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package pkg01_introjava_ej16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 20 Números ENTEROS. Si ingresa 0 el programa cortará.");
        int num, suma = 0, j = 0;
        for (int i = 0; i < 20; i++) {
            j++;
            System.out.print("Ingrese el " + (i + 1) + "° número: ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Ha ingresado 0. Se corta la iteración.");
                break;
            }
            if (num > 0) {
                suma = suma + num;
            }
            System.out.println("SUMA Parciál = " + suma);
        }
        System.out.println("-------------------------------------------");
        System.out.println("El programa ha terminado:");
        System.out.println("SUMA TOTAL DE N° POSITIVOS = " + suma);
        System.out.println("CANTIDAD N° INGRESADOS = " + j);
        System.out.println("-------------------------------------------");
    }

}
