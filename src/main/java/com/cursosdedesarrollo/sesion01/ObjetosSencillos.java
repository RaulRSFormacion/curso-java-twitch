package com.cursosdedesarrollo.sesion01;

public class ObjetosSencillos {
    public static void main(String[] args) {
        // Ejemplos de Objetos sencillos en Java
        // Objetos booleanos
        // Declaracion del objeto
        Boolean activo;
        // Inicialización del objeto
        activo = true;
        // Imprimimos el objeto por pantalla
        System.out.println(activo);
        // Cambiamos el valor del objeto
        activo = false;
        // Imprimimos el objeto por pantalla
        System.out.println(activo);

        // Cadena de caracteres
        // Declaración e inicialización de un objeto de tipo String
        String cadena = "Hola Chat";
        System.out.println(cadena);
        // Declaración e inicialización de objeto de tipo String en base a una función constructora
        String nuevaCadena = new String ("Nueva Cadena");
        System.out.println(nuevaCadena);
        // Asignamos un nuevo valor al objeto nuevaCadena
        nuevaCadena = "Nuevo valor de Cadena";
        System.out.println(nuevaCadena);
        // Cuando creamos un objeto se guarda en una parte de la memoria y la referencia a esa porción de memoria es lo
        // se guarda en la variable (en este caso en nuevaCadena).
        // Cuando asignamos un nuevo valor a nuevaCadena lo que sucede es que se crea un nuevo objeto en otro lugar de
        // la memoria, esa referencia a esa nueva porción de memoria se guarda en la variable nuevaCadena y la referencia
        // a la porción de memoria anterior se pierde.
        // El recolector de basura liberará eventualmente esa parte de la memoria ocupada por el primer objeto creado
        // que ha quedado "perdido" al no estar su referencia guardada en ninguna variable

        // Acceder a propiedades del objeto
        System.out.print("Número de caracteres en la cadena: ");
        System.out.println(nuevaCadena.length());

        // Objetos para números
        // Números enteros
        Integer numeroEntero = 12;
        System.out.println(numeroEntero);
        // Números de coma flotante
        Float flotante = 12.3F;
        System.out.println(flotante);
        Double doble = 12.34345;
        System.out.println(doble);

    }
}
