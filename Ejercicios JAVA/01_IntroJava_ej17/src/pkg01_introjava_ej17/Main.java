/*
INTRO JAVA - EJERCICIO 16
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas
enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
de largo, el primer carácter tiene que ser X y el último tiene que ser una O. Las secuencias leídas que respeten el
formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime
un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
package pkg01_introjava_ej17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los valores de comando del dispositivo RS232. Deben cumplir:");
        System.out.println("1. Cinco (5) caracteres de largo.");
        System.out.println("2. Comenzar con equis \"X\" sin distinguir si es minúscula o mayúscula.");
        System.out.println("3. Comenzar con cero \"0\".");
        System.out.println("4. La secuencia \"&&&&&\" finaliza el programa." );
        String comando = null;
        int i = 0, j = 0;
        do {
            System.out.print("Ingrese un comando: ");
            comando = sc.next();
            if (comando.length() == 5 && comando.substring(0,1).equalsIgnoreCase("x") && comando.substring(4,5).equalsIgnoreCase("0") && !comando.equalsIgnoreCase("&&&&&")) {
                i++;                
            } else if (!comando.equals("&&&&&")) j++;
        } while (!comando.equals("&&&&&"));
        System.out.println("PROGRAMA FINALIZADO.");
        System.out.println("Cant. de comandos CORRECTOS = " + i);
        System.out.println("Cant. de comandos INCORRECTOS = " + j);
    }
    
}
