package com.cursosdedesarrollo.sesion01;

public class Operadores {
    public static void main(String[] args) {
        // Declarar varias variables en una misma línea
        int i = 1, j = 2;
        System.out.println(i);
        System.out.println(j);
        // Suma
        int resultado = i + j;
        System.out.println(resultado);
        // Resta
        resultado = j - i;
        System.out.println(resultado);
        // Producto
        resultado = i * j;
        System.out.println(resultado);
        // División
        resultado = j / i;
        System.out.println(resultado);

        i = 3;
        j = 4;
        // División no entera
        // La división entre números enteros da como resultado un entero, no tendremos la parte decimal
        float resultadoFlotante = i / j;
        System.out.println(resultadoFlotante);
        // División con resultado float
        // Podemos hacer un Casting de las dos variables antes de realizar la operación
        resultadoFlotante = (float) i / (float) j;
        System.out.println(resultadoFlotante);

        // Resto, da el resto de una división. Esta operación es exclusiva de números enteros
        i = 7;
        j = 2;
        resultado =  i % j;
        System.out.println(resultado);

        // Operadores de comparación
        // Es mejor darlos con las sentencias condicionales

        i = 1;
        // Preincremento
        ++i;
        System.out.println(i);
        // Postincremento
        i++;
        System.out.println(i);
        // Predecremento
        --i;
        System.out.println(i);
        // Postdecremento
        i--;
        System.out.println(i);

        // Operadores de asignación con operación incluida
        i = 1;
        // Incremento de una variable en un número
        i = i + 2;
        System.out.println(i);
        // Manera reducida
        i += 2;
        System.out.println(i);
        // Resta
        i -= 2;
        System.out.println(i);
        // Producto
        i *= 2;
        System.out.println(i);

        // Uso con cadenas de caracteres (Strings)
        String cadena1 = "Hola";
        String cadena2 = " chat!";
        // Concatenación de cadenas de caracteres
        String cadenaResultado = cadena1 + cadena2;
        System.out.println(cadenaResultado);

         cadenaResultado = cadena1 + i;
        System.out.println(cadenaResultado);

    }
}
