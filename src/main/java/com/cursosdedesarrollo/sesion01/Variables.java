package com.cursosdedesarrollo.sesion01;

public class Variables {
  public static void main(String[] args) {
    System.out.println("Ejemplos de variables");
    // Declaración de la variable
    int numero;
    // Inicialización de la variable
    numero = 12;
    // Imprimir variable por pantalla
    System.out.println(numero);

    // Tipos de variables
    System.out.println("Ejemplos de variables Booleanas");
    // com.cursosdedesarrollo.sesion01.Variables booleanas
    boolean activo = true;
    // Cambiar el valor de la variable
    activo = false;
    System.out.println(activo);

    // com.cursosdedesarrollo.sesion01.Variables numéricas
    // Números enteros
    int natural = 12;
    System.out.println(natural);
    long largo = 2131234154;
    System.out.println(largo);
    // Byte -128 +127
    byte unByte = 125;
    System.out.println(unByte);
    // Short 2 byte de tamaño
    short corto = 225;
    System.out.println(corto);

    // Números de coma flotante
    float temperatura = 12.3F;
    System.out.println(temperatura);
    double valorDePi = 3.141597;
    System.out.println(valorDePi);

    // Carácteres (Unicode)
    // ref: https://es.wikipedia.org/wiki/Unicode
    char arbol = '木';
    System.out.println(arbol);
  }
}
