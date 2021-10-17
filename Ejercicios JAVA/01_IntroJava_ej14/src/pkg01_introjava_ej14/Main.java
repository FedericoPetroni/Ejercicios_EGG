/*
INTRO JAVA - EJERCICIO 14
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
*/
package pkg01_introjava_ej14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un intérvalo ENTERO máximo POSITIVO: ");
        
        // SE DEBE INGRESAR UN VALIDADOR DE ENTERO POSITIVO
        
        int limMax = sc.nextInt();
        System.out.println("Ahora ingrese números hasta que la suma consecutiva de ellos supere el límite de "
                + limMax + ".");
        int num = sc.nextInt(), suma = num;
        while (suma <= limMax) {
            System.out.println("Suma parcial = " + suma + " // Ingrese otro número:");
            num = sc.nextInt();
            suma = suma + num;
        }
        System.out.println("Ha superado el límite dispuesto [" + limMax + "] // Suma total = " + suma);
    }
    
}
