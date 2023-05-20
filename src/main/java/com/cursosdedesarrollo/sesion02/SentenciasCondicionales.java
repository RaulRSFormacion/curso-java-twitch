package com.cursosdedesarrollo.sesion02;

public class SentenciasCondicionales {
  public static void main(String[] args) {

    int i = 0;
    int j = 0;
    // Comparación de igualdad
    if (i == j) {
      System.out.println("Las dos variables son iguales");
    }
    j = 1;
    // Comparación de desigualdad
    if (i != j) {
      System.out.println("Las dos variables son diferentes");
    }
    // Comparación de menor que
    if (i < j) {
      System.out.println("El valor de i es menor que el valor j");
    }
    // Comparación de mayor que
    if (j > i) {
      System.out.println("El valor de j es mayor que el valor i");
    }
    // Comparación de mayor o igual
    j = 0;
    if (j >= i) {
      System.out.println("El valor de j es mayor o igual que el valor i");
    }
    // Comparación de menor o igual
    j = 1;
    if (i <= j) {
      System.out.println("El valor de i es menor o igual que el valor j");
    }

    // Comparación con objetos
    // Cadenas
    String cadena1 = "Hola";
    String cadena2 = "Hola";
    if (cadena1.equals(cadena2)) {
      System.out.println("Las dos cadenas son iguales en su valor");
    }
    // Comparamos las referencias a los objetos
    // Lo que sucede es que se crea una zona de memoria donde se guarda "Hola" y esa referencia se
    // asigna primero
    // a cadena1 y luego a cadena2 porque no hemos usado new para crear el String y en ambos casos
    // tiene el mismo valor
    if (cadena1 == cadena2) {
      System.out.println("Las dos referencias son iguales");
    } else {
      System.out.println("Las dos referencias son diferentes");
    }

    // Creamos otro String con el mismo valor que los anterirores "Hola" pero usamos new para
    // crearlo, asi veremos
    // que esta nueva cadena se crea en otra zona de memoria y por tanto su referecian es distinta
    String cadena3 = new String("Hola");
    // Comparamos por valor
    if (cadena1.equals(cadena3)) {
      System.out.println("Las dos cadenas son iguales en su valor");
    } else {
      System.out.println("Las dos cadenas son distintas en su valor");
    }
    // Comparamos por referencia
    if (cadena1 == cadena3) {
      System.out.println("Las dos referencias son iguales");
    } else {
      System.out.println("Las dos referencias son distintas");
    }

    // Uso sencillo de else
    i = 1;
    j = 1;
    // Se ejecuta el caso del if
    if (i == j) {
      System.out.println("El valor de i es igual al de j");
    } else {
      System.out.println("El valos i NO es igual al de j");
    }
    i = 0;
    j = 1;
    // Se ejecuta el caso del else
    if (i == j) {
      System.out.println("El valor de i es igual al de j");
    } else {
      System.out.println("El valos i NO es igual al de j");
    }

    // Operación AND
    // El resultado será true sólo si las dos variables comparadas son true
    boolean primer = true;
    boolean segundo = true;
    if (primer && segundo) {
      System.out.println("Salida primer && segundo: true");
    } else {
      System.out.println("Salida primer && segundo: false");
    }
    segundo = false;
    if (primer && segundo) {
      System.out.println("Salida primer && segundo: true");
    } else {
      System.out.println("Salida primer && segundo: false");
    }

    // Ejemplo con Strings
    String password = "valoresDeContraseña";
    String nombreUsuario = "pepesan";
    System.out.println(password.length());
    System.out.println(nombreUsuario.length());
    if (password.length() > 15 && nombreUsuario.length() >= 8) {
      System.out.println(
          "La password tiene mas de 15 caracteres y el nombre de usuario tiene 4 o más");
    } else {
      System.out.println("No se cumplem los criterios de la contraseña y el nombre de usuario");
    }

    // Operación OR
    // Si una de las condiciones es true el resultado es true
    if (password.length() > 15 || nombreUsuario.length() >= 4) {
      System.out.println(
          "La password tiene mas de 15 caracteres o el nombre de usuario tiene 4 o más");
    } else {
      System.out.println("No se cumplem los criterios de la contraseña y el nombre de usuario");
    }

    // Operación de tipo NOT
    if (nombreUsuario.isBlank()) {
      System.out.println("El nombre de usuario está en blanco");
    } else {
      System.out.println("El nombre de usuario NO está en blanco");
    }

    // Ahora validamos que NO está en blanco
    if (!nombreUsuario.isBlank()) {
      System.out.println("El nombre de usuario NO está en blanco");
    } else {
      System.out.println("El nombre de usuario está en blanco");
    }

    // Sentencias de tipo Switch con números enteros (int)
    i = 2;
    switch (i) {
      case 1:
        System.out.println("La variable i tiene el valor 1");
        break;
      case 2:
        System.out.println("La variable i tiene el valor 2");
        break;
    }
    // Comparación en base a la edad de una persona
    int edad = 20;
    switch (edad) {
      case 18:
        System.out.println("En España ya puedes votar en las elecciones");
        break;
      case 21:
        System.out.println("En USA ya puedes votar en las elecciones");
        break;
      default:
        System.out.println("Tu edad es: " + edad);
    }
    // A partir de Java 7 podemos usar Switch con Cadenas
    nombreUsuario = "pepesan";
    switch (nombreUsuario) {
      case "pepesan":
        System.out.println("Tu nombre de usuario es pepesan");
        break;
      case "admin":
        System.out.println("El usuario es el administrador");
        break;
      default:
        System.out.println("Tu nombre de usuario NO es pepesan");
    }

    // A partir de Java 12 podemos hacer comprobaciones más complejas
    nombreUsuario = "Natalia";
    switch (nombreUsuario) {
      case "pepesan", "Natalia":
        System.out.println("Eres un usuario normal");
        break;
      case "admin":
        System.out.println("El usuario es el administrador");
        break;
      default:
        System.out.println("No es pepesan, ni Natalia, ni admin");
    }

    // Otra manera diferente de hacer un Switch en Java 12 
    nombreUsuario = "admin";
    switch (nombreUsuario) {
      case "pepesan", "Natalia" -> {
        System.out.println("Eres un usuario normal");
      }
      case "admin" -> {
        System.out.println("El usuario es el administrador");
      }
      default -> {
        System.out.println("No es pepesan, ni Natalia, ni admin");
      }
    }
  }
}
