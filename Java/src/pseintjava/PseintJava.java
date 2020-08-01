/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseintjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Se importan librerías de java que permiten verificar los caracteres introducidos

/**
 * Elección del método
 * @author David 23/11/2018
 * @version 1.0
 */
public class PseintJava {

    /**
     * Se elige el programa al que se quiere acceder mediante la selección de un
     * número (del 1 al 10) y en caso de querer salir de la ejecución se elige
     * el número 11.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0; //Se inicializa la variable n, que hace de número
        boolean valido = false; //Se inicializa la variable valido, que permite realizar la verificación y se le da el valor de falso
        String linea; //Se inicializa la variable linea como String, que permite introducir cualquier caracter
        Ejercicios objeto = new Ejercicios(); //Se llama a la otra clase donde se encuentran los ejercicios
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        //Se aplican las librerías introducidas en forma de código para poder hacer uso de ellas
        //Te imprime los enunciados de los ejercicios
        do {
            System.out.println(" 1. Programa que lee el número (N) desde el dispositivo estandar de entrada y\n"
                    + "comprueba e imprime en el dispositivo estandar de salida si es Positivo, si es Negativo o\n"
                    + "si es Nulo. ");
            System.out.println(" 2. Un programa que lee un número que corresponde al radio de una circunferencia\n"
                    + "y calcula e imprime la longitud y el área correspondiente a la misma. ");
            System.out.println(" 3. Un programa que lee dos números y calcu1a e imprime su suma, su resta, s'tt\n"
                    + "producto y su división. ");
            System.out.println(" 4. Un programa que lee 5 números de teclado y devuelve cuantos positivos,\n"
                    + "cuantos negativos y cuantos nu1os. ");
            System.out.println(" 5. Un programa que lee 5 números de teclado y determina cual es el mayor de los\n"
                    + "números introducidos; sean positivos o negativos .. ");
            System.out.println(" 6. Un programa que lee 3 números sobre 3 variables y l9s imprime en orden\n"
                    + "ascendente. ");
            System.out.println(" 7. Un programa que lee 3 números A, B, C sobre 3 variables y 1os imprime en\n"
                    + "orden ascendente. Pero ordenados siempre A;B y C teniendo que permutar sus valores si\n"
                    + "fuese necesario. ");
            System.out.println(" 8. Un programa que calcule la suma de ios 100 primeros numeras naturales (del l\n"
                    + "al lOO}. ");
            System.out.println(" 9. Un programa que calcule la suma de los impares, de los 100 primeros números\n"
                    + "naturales (del -1 al 1OO). ");
            System.out.println(" 10. Un programa que introduce números por teclado hasta que se introduce uno\n"
                    + "negativo y al finalizar da ta suma de los números válidos. ");
            System.out.println("11. Para salir.");
            //Se realiza un método de excepción para establecer un rango dentro de la variable
            do {

                try {
                    System.out.println("¿Qué ejercicio quieres hacer?");
                    linea = teclado.readLine(); //Se lee linea como String
                    n = Integer.parseInt(linea); //Transforma el string en int dentro de la variable n
                    if (n < 1 || n > 11) { //Si el número es menor que 1 o mayor que 11 se hace
                        throw new IllegalArgumentException(); //Una nueva excepción
                    }
                    valido = true; //Se termina con el método de excepción
                } catch (IOException e) {
                    System.out.println("Error al leer el teclado");

                } catch (NumberFormatException e) {
                    System.out.println("Error en la conversión");

                } catch (IllegalArgumentException e) {
                    System.out.println("Debe introducir entre 1 y 10 (u 11 en caso de querer terminar) ");
                }
            } while (valido == false); //Mientras valido sea falso se seguirá realizando el método

            switch (n) { //Dependiendo de lo que hayas elegido dentro de la variable n se eligirá un ejercicio u otro
                case 1:
                    objeto.Ej1();
                    break;
                case 2:
                    objeto.Ej2();
                    break;
                case 3:
                    objeto.Ej3();
                    break;
                case 4:
                    objeto.Ej4();
                    break;
                case 5:
                    objeto.Ej5();
                    break;
                case 6:
                    objeto.Ej6();
                    break;
                case 7:
                    objeto.Ej7();
                    break;
                case 8:
                    objeto.Ej8();
                    break;
                case 9:
                    objeto.Ej9();
                    break;
                case 10:
                    objeto.Ej10();
                    break;
            }
        } while (n != 11); //Mientras n sea distinto de 11 se seguirá realizando el método

    }
}
