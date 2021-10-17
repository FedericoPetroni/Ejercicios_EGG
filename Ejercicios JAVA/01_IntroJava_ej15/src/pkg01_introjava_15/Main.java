/*
INTRO JAVA - EJERCICIO 15
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción
5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve
a mostrar el menú.
 */
package pkg01_introjava_15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el 1er número ENTERO POSITIVO: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el 2do número ENTERO POSITIVO: ");
        int num2 = sc.nextInt();
        int menu = 0;
        System.out.println("--------------- MENÚ ---------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Eliga una opción");
        do {
            menu = sc.nextInt();
            while (menu < 1 || menu > 5) {
                System.out.println("la opción ingresada es inválida, seleccione una opción del menú:");
                menu = sc.nextInt();
            }
            switch (menu) {
                case 1:
                    System.out.println("La SUMA de los númers es = " + (num1 + num2));
                    System.out.println("Elija otra opción.");
                    break;
                case 2:
                    System.out.println("La RESTA de los númers es = " + (num1 - num2));
                    System.out.println("Elija otra opción.");
                    break;
                case 3:
                    System.out.println("El PRODUCTO de los númers es = " + (num1 * num2));
                    System.out.println("Elija otra opción.");
                    break;
                case 4:
                    System.out.println("El COCIENTE de los númers es = " + (num1 / num2));
                    System.out.println("Elija otra opción.");
                    break;
            }
        } while (menu != 5);
        System.out.println("Gracias por utilizar nuestro sistema");
    }
}
