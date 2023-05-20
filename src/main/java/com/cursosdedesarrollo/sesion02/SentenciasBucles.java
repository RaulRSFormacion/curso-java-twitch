package com.cursosdedesarrollo.sesion02;

public class SentenciasBucles {
  public static void main(String[] args) {
    // Bucle de tipo While
    System.out.println("Antes del primer bucle");
    // Ejemplo de bucle While que da dos vueltas
    // Inicializo la variable
    int i = 0;
    // Compruebo que debo entrar o seguir en el bucle con la condición i < 2
    // mientras se cumpla esa condición seguiré dentro del bucle
    while (i < 2) {
      // Sentencia que yo quiero repetir dentro del bucle
      System.out.println(i);
      // Incremento de la variable del bucle
      i++;
    }
    // Fuera del bucle
    System.out.println("Fuera del primer bucle");

    // Bucle que da 3 vueltas
    System.out.println("Bucle de 3 vueltas");
    // Inicialización
    i = 0;
    // Comprobación
    while (i < 3) {
      System.out.println(i);
      // Modificación o incremento de i
      i++;
    }

    // Bucle for
    // Repetir un número de veces
    // for (inicialización;comprobación;incremento)
    System.out.println("Bucle FOR de 3 vueltas");
    for (i = 0; i < 3; i++) {
      System.out.println(i);
    }
    System.out.println("Bucle FOR de 4 vueltas");
    for (i = 0; i < 4; i++) {
      System.out.println(i);
    }

    // Bucle Do While
    System.out.println("Bucle de 3 vueltas con do While");
    // Inicialización
    i = 0;
    do {
      // Código a ejecutar
      System.out.println(i);
      // Modificación
      i++;
      // Comprobación
    } while (i < 3);
  }
}
