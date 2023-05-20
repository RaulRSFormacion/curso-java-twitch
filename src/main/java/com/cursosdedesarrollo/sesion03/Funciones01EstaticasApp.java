package com.cursosdedesarrollo.sesion03;

import static com.cursosdedesarrollo.sesion03.Funciones01Estaticas.*;

public class Funciones01EstaticasApp {
  public static void main(String[] args) {

    // Invocación del procedimiento
    nombreFuncion();

    // Invocar a función que devuelve un valor entero (int)
    int i = devuelveEntero();
    System.out.println("Valor de i: " + i);

    // Invocar a función que suma
    i = suma(2, 3);
    System.out.println("Sumando 2 y 3: " + i);
    i = 4;
    int j = 5;
    int resultado;
    resultado = suma(i, j);
    System.out.println("Sumando " + i + " y " + j + ": " + resultado);

    // Invocar una función que sume los valores de un array
    int[] unArray = new int[2];
    unArray[0] = 1;
    unArray[1] = 2;
    resultado = sumaValores(unArray);
    System.out.println("Sumando los valores del array unArray: " + resultado);

    int[] otroArray = {1, 2, 3, 4};
    resultado = sumaValores(otroArray);
    System.out.println("Sumando los valores del array otroArray: " + resultado);
  }
}
