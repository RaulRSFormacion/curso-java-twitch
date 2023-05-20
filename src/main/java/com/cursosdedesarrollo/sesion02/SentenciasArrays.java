package com.cursosdedesarrollo.sesion02;

public class SentenciasArrays {
  public static void main(String[] args) {
    System.out.println("Ejemplos de uso de bucles con Arrays");
    // Un array es un conjunto ordenado de elementos o variables del mismo tipo en la memoria
    // Definición de un array
    int[] miArray;
    // Inicialización de un array
    // Debemos definir el número de elementos del array
    miArray = new int[2];
    // Acceso a los elementos del array
    // primera posición del array (posición 0)
    miArray[0] = 5;
    System.out.println("miArray[0] = " + miArray[0]);
    miArray[1] = 7;
    System.out.println("miArray[1] = " + miArray[1]);

    // Recorrer un array, pasamos por todas y cada una de sus posiciones
    System.out.println("Recorrer un array con un for");
    for (int i = 0; i < 2; i++) {
      System.out.println("miArray[" + i + "]= " + miArray[i]);
    }

    // Recorrer un array con u for dinámico
    System.out.println("Recorrer un array con un for dinámico");
    for (int i=0; i<miArray.length;i++){
      System.out.println("miArray[" + i + "]= " + miArray[i]);
    }

    // Recorrer un array usando un forEach
    System.out.println("Recorrer un array con un forEach");
    for (int i: miArray ) {
      System.out.println(i);
    }

    // Array de 6 posiciones inicializado al vuelo
    int[] arrayGrande = {2,8,4,6,1,9};
    System.out.println("Recorrer un array con un forEach en array grande");
    for (int numero : arrayGrande) {
      System.out.println(numero);
    }
    

  }
}
