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
 * Contiene 10 métodos distintos.
 *
 * @author David 23/11/2018
 * @version 1.0
 */
public class Ejercicios {

    /**
     * Programa que lee el número (N) desde el dispositivo estandar de entrada y
     * comprueba e imprime en el dispositivo estandar de salida si es Positivo,
     * si es Negativo o si es Nulo.
     */
    public void Ej1() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        //Se aplican las librerías introducidas en forma de código para poder hacer uso de ellas
        int N; // Se inicializa una variable n para adoptarla como número a elegir
        N = 0; // Se le da el valor de 0 a la variable n
        String linea; // Se inicializa la variable linea como String para poder introducir cualquier caracter
        boolean valido; //Se inicializa la variable linea como String, que permite introducir cualquier caracter
        valido = false; // Se le da el valor de falso a la variable valido
        System.out.println("Introduzca un número:"); //Se pide que se introduzca un número para realizar el ejercicio
        do { //Se introduce un método de excepción para filtrar este número
            try {
                linea = teclado.readLine(); //Se lee el número como cualquier tipo de carácter
                N = Integer.parseInt(linea); //Se intenta traducir a entero
                valido = true; //En caso de poderse se valido se vuelve verdadero con el fin de salir del método
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelva a introducir un número:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelva a introducir un número:");
            }
        } while (valido == false); //Mientras válido sea falso se seguirá dentro del método

        if (N > 0) {
            System.out.println(N + " es positivo"); //Si el número es mayor que 0 entonces es positivo
        } else {
            if (N == 0) {
                System.out.println(N + " es nulo"); //Si el número es 0 entonces es nulo
            } else {
                System.out.println(N + " es negativo"); //Si el número es menor que 0 entonces es negativo
            }
        }
    }

    /**
     * Un programa que lee un número que corresponde al radio de una
     * circunferencia y calcula e imprime la longitud y el área correspondiente
     * a la misma.
     */
    public void Ej2() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        double radio; // Se inicializa la variable radio como real
        double longitud; // Se inicializa la variable longitud como real
        double area; // Se inicializa la variable area como real
        String linea;
        Boolean valido;
        valido = false;
        radio = 0; //Se le da el valor de 0
        System.out.println("Define el radio de la circunferencia"); //Se imprime un texto que te pide el radio de la circunferencia
        do {
            try {
                linea = teclado.readLine();
                radio = Double.parseDouble(linea);
                if (radio <= 0) { //Si el radio es menor o igual que 0 se genera una nueva excepción
                    throw new IllegalArgumentException();
                }
                valido = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir el radio de la circunferencia");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir el radio de la circunferencia");
            } catch (IllegalArgumentException e) { //En esta excepción te pide un número positivo
                System.out.println("Debe introducir un número positivo");
                System.out.println("Vuelve a introducir el radio de la circunferencia");
            }
        } while (valido == false);
        longitud = 2 * radio * 3.14; //Gracias a la fórmula de la longitud, esta se calcula
        area = 3.14 * Math.pow(radio, 2); //Gracias a la fórmula del área, esta se calcula
        System.out.println("La longitud de la circunferencia es " + longitud + ", y el área es " + area); //Se imprime la longitud y el área de la circunferencia
    }

    /**
     * Un programa que lee dos números y calcu1a e imprime su suma, su resta, su
     * producto y su división.
     */
    public void Ej3() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        double num1 = 0; //Se establece el primer número como real
        double num2 = 0; //Se establece el segundo número como real
        String linea;
        String linea2; //Se establecen 2 variables línea como String, puesto que van a haber 2 excepciones
        Boolean valido;
        valido = false;
        Boolean valido2;
        valido2 = false; //Se establecen 2 variables válido como boolean con el fin de usar distintas excepciones al mismo tiempo
        System.out.println("Escribe dos números:"); //Se imprime un texto en el que te pide 2 números
        do {
            try {
                linea = teclado.readLine();
                num1 = Double.parseDouble(linea);
                valido = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir dos números:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir dos números:");
            }
        } while (valido == false);
        do {
            try {
                linea2 = teclado.readLine();
                num2 = Double.parseDouble(linea2);
                valido2 = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir dos números:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir dos números:");
            }
        } while (valido2 == false);
        System.out.println("La suma de estos números es " + (num1 + num2) + ", su resta es " + (num1 - num2) + ", su multiplicación es " + (num1 * num2) + ", y su división es " + (num1 / num2));
        //Se realizan distintos cálculos con ambos números
    }

    /**
     * Un programa que lee 5 números de teclado y devuelve cuantos positivos,
     * cuantos negativos y cuantos nu1os hay.
     */
    public void Ej4() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        double N = 0, I; //Se crea la variable I con el fin de hacer un "para" posteriormente
        int positivos, negativos, nulos; //Se crean 3 tipos de números para poder saber cuantos hay de cada tipo posteriormente
        positivos = 0;
        negativos = 0;
        nulos = 0; //Los 3 se inicializan a 0
        String linea;
        boolean valido;
        valido = false;
        for (I = 1; I <= 5; I++) { //Se hace una función para que te pidan 5 números 
            System.out.println("Introduzca un número:");
            do {
                try {
                    linea = teclado.readLine();
                    N = Double.parseDouble(linea);
                    valido = true;
                } catch (IOException e) {
                    System.out.println("Error al leer el teclado");
                    System.out.println("Vuelve a introducir el número:");
                } catch (NumberFormatException e) {
                    System.out.println("Error en la conversión");
                    System.out.println("Vuelve a introducir el número:");
                }
            } while (valido == false);
            if (N < 0) { //Si el número es negativo se suma 1 a la variable negativos
                negativos++;
            } else {
                if (N > 0) { //Si el número es positivo se suma 1 a la variable positivos
                    positivos++;

                } else { //Si el número es nulo se suma 1 a la variable nulos
                    nulos++;
                }
            }
            valido = false;
        }
        System.out.println("Ha introducido " + negativos + (" números negativos, ") + positivos + (" números positivos, y ") + nulos + (" números nulos"));
        //Imprime cuantos tipos de números has introducido
    }

    /**
     * Un programa que lee 5 números de teclado y determina cual es el mayor de
     * los números introducidos; sean positivos o negativos.
     */
    public void Ej5() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int N = 0, I, mayor, mayorNegativo; //Se crea una variable mayor con el fin de guardar la variable n más grande dentro de la variable mayor
        mayor = 0;
        mayorNegativo = 0;
        String linea;
        boolean valido;
        valido = false;
        for (I = 1; I <= 5; I++) {
            do {
                try {
                    System.out.println("Introduce un número:");
                    linea = teclado.readLine();
                    N = Integer.parseInt(linea);
                    valido = true;
                } catch (IOException e) {
                    System.out.println("Error al leer el teclado");
                    System.out.println("Vuelve a introducir el número:");
                } catch (NumberFormatException e) {
                    System.out.println("Error en la conversión");
                    System.out.println("Vuelve a introducir el número:");
                }
            } while (valido == false);
            if (mayorNegativo == 0) {
                mayor = N;
                mayorNegativo = 1;
            }
            if (N > mayor) { //Si n es mayor que la variable mayor entonces mayor toma el valor de la variable n
                mayor = N;
            }
            valido = false;
        }
        System.out.println("El número mayor es " + mayor);
    }

    /**
     * Un programa que lee 3 números sobre 3 variables y los imprime en orden
     * ascendente.
     */
    public void Ej6() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int A = 0, B = 0, C = 0; //Se crean 3 variables para cada número
        String linea;
        String linea2;
        String linea3;
        boolean valido;
        boolean valido2;
        boolean valido3;
        valido = false;
        valido2 = false;
        valido3 = false; //Se crean las variables necesarias para crear las 3 excepciones distintas
        System.out.println("Escribe 3 números");
        do {
            try {
                linea = teclado.readLine();
                A = Integer.parseInt(linea);
                valido = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir el número:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir el número:");
            }
        } while (valido == false);
        do {
            try {
                linea2 = teclado.readLine();
                B = Integer.parseInt(linea2);
                valido2 = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir el número:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir el número:");
            }
        } while (valido2 == false);
        do {
            try {
                linea3 = teclado.readLine();
                C = Integer.parseInt(linea3);
                valido3 = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir el número:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir el número:");
            }
        } while (valido3 == false);
        if (A > B) {
            if (B > C) { //Si C<B<A
                System.out.println(C + " " + B + " " + A);
            } else {
                if (C > A) { //Si B<A<C
                    System.out.println(B + " " + A + " " + C);
                } else { //Si B<C<A
                    System.out.println(B + " " + C + " " + A);
                }
            }
        } else {
            if (C > B) { //Si A<B<C
                System.out.println(A + " " + B + " " + C);
            } else {
                if (A > C) { //Si C<A<B
                    System.out.println(C + " " + A + " " + B);
                } else { //Si A<B<C
                    System.out.println(A + " " + B + " " + C);
                }
            }
        }
    }

    /**
     * Un programa que lee 3 números A, B, C sobre 3 variables y 1os imprime en
     * orden ascendente. Pero ordenados siempre A, B y C teniendo que permutar
     * sus valores si fuese necesario.
     */
    public void Ej7() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int A = 0, B = 0, C = 0, aux; //Se hace lo mismo que en el ejercicio anterior y además se crea una variable auxiliar para guardar una variable dentro
        String linea;
        String linea2;
        String linea3;
        boolean valido;
        boolean valido2;
        boolean valido3;
        valido = false;
        valido2 = false;
        valido3 = false;
        System.out.println("Escribe 3 números:");
        do {
            try {
                linea = teclado.readLine();
                A = Integer.parseInt(linea);
                valido = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir el número:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir el número:");
            }
        } while (valido == false);
        do {
            try {
                linea2 = teclado.readLine();
                B = Integer.parseInt(linea2);
                valido2 = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir el número:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir el número:");
            }
        } while (valido2 == false);
        do {
            try {
                linea3 = teclado.readLine();
                C = Integer.parseInt(linea3);
                valido3 = true;
            } catch (IOException e) {
                System.out.println("Error al leer el teclado");
                System.out.println("Vuelve a introducir el número:");
            } catch (NumberFormatException e) {
                System.out.println("Error en la conversión");
                System.out.println("Vuelve a introducir el número:");
            }
        } while (valido3 == false);
        if (A > B) { //Se guarda la auxiliar en la variable A para pasarla a la variable B
            aux = A;
            A = B;
            B = aux;
        }
        if (B > C) { //Se guarda la auxiliar en la variable B para pasarla a la variable C
            aux = B;
            B = C;
            C = aux;
        }
        if (A > B) { //Se guarda la auxiliar en la variable A para pasarla a la variable C
            aux = A;
            A = B;
            B = aux;
        }
        System.out.println(A + " " + B + " " + C);
    }

    /**
     * Un programa que calcule la suma de los 100 primeros numeras naturales
     * (del l al lOO}.
     */
    public void Ej8() {
        int I, suma;
        suma = 0;
        for (I = 1; I <= 100; I++) {
            suma = suma + I;
            //La variable suma guarda todos los valores de I del 1 al 100 para sumarlos entre sí
        }
        System.out.println(suma);
    }

    /**
     * Un programa que calcule la suma de los impares, de los 100 primeros
     * números naturales (del l al 1OO).
     */
    public void Ej9() {
        int I, suma;
        suma = 0;
        for (I = 1; I <= 100; I = I + 2) {
            suma += I;
            //La variable suma guarda todos los valores de impares de I del 1 al 100 para sumarlos entre sí
        }
        System.out.println(suma);
    }

    /**
     * Un programa que introduce números por teclado hasta que se introduce uno
     * negativo y al finalizar da la suma de los números válidos.
     */
    public void Ej10() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int N, suma;
        suma = 0;
        N = 0;
        String linea;
        boolean valido;
        valido = false;
        System.out.println("Escribe un número:");
        while (N >= 0) { //Mientras n sea mayor o igual que 0 se hará
            do {
                try {
                    linea = teclado.readLine();
                    N = Integer.parseInt(linea);
                    System.out.println("Escribe otro número para sumar:");
                    //Te pedirá otro número para sumar mientras no pongas un número negativo
                    valido = true;
                } catch (IOException e) {
                    System.out.println("Error al leer el teclado");
                    System.out.println("Vuelve a introducir el número:");
                } catch (NumberFormatException e) {
                    System.out.println("Error en la conversión");
                    System.out.println("Vuelve a introducir el número:");
                }

            } while (valido == false);
            if (N >= 0) { //Si el número es mayor o igual que 0
                suma += N; //La variable suma irá conteniendo todos los valores de N sumados entre sí
                valido = false;
            }
        }
        System.out.println(suma);
    }

}
