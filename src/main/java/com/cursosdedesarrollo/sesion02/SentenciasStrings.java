package com.cursosdedesarrollo.sesion02;

public class SentenciasStrings {
  public static void main(String[] args) {
    // Declarar e inicializar un objeto de tipo String
    String usuario = "pepesan";

    // Otra manera diferente de inicializar un String
    usuario = new String("Pepesan");

    System.out.println("Longitud de la cadena: " + usuario.length());
    // Recorrer un String con un bucle for
    System.out.println("Recorrer con un for");
    for (int i = 0; i < usuario.length(); i++) {
      System.out.println(usuario.charAt(i));
    }

    // Operaciones interesantes
    // Converir en mayúsculas
    System.out.println("toUpperCase");
    System.out.println(usuario.toUpperCase());
    // Convertir en minúsculas
    System.out.println("toLowerCase");
    System.out.println(usuario.toLowerCase());
    // Caracter en determinada posición
    System.out.println("charAt");
    System.out.println(usuario.charAt(0));
  }
}
