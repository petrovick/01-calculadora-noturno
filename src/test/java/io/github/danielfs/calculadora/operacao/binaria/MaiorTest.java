package io.github.danielfs.calculadora.operacao.binaria;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MaiorTest
{
  private Maior maior;
  
  @Before
  public void inicializar()
  {
    maior = new Maior();
  }
  
  @Test
  public void deveriaRetornar3QuandoPassa3e2()
  {
    double valorEsperado = 3;
    double valorRetornado = maior.calcular(3,2);
    assertEquals(valorEsperado, valorRetornado, 0);
  }
}
