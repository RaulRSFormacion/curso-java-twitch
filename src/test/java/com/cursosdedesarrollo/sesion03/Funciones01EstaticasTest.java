package com.cursosdedesarrollo.sesion03;

import static com.cursosdedesarrollo.sesion03.Funciones01Estaticas.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Funciones01EstaticasTest {

  @Test
  public void testDevuelveEntero() {
    int res = devuelveEntero();
    assertEquals(3, res);
  }

  // Función que prueba el método suma
  @Test
  public void testSuma() {
    int res = suma(2, 3);
    assertEquals(5, res);
  }

  // Función que prueba el método sumaValores
  @Test
  public void testSumaValores() {
    int[] miArray = {1, 3, 7};
    int res = sumaValores(miArray);
    assertEquals(11, res);
  }

  // El TDD marca que debemos implementar la prueba antes que el código de la app
  // Ej: definir una prueba que sea capara de probar una función/método que reste dos enteros

  // Test que prueba el método resta
  @Test
  public void testResta() {
    // Invocar a la función a probar
    // Recoger el valor
    int res = resta(6, 2);
    assertEquals(4, res);
  }

  // Test que prueba el método producto
  @Test
  public void testProducto() {
    // GIVEN
    float f = 2.0F;
    float f2 = 3.0F;
    // WHEN
    float res = producto(f, f2);
    // THEN
    assertEquals(6.0F, res);
  }
}
