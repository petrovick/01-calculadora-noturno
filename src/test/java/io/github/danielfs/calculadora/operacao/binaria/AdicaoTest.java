package io.github.danielfs.calculadora.operacao.binaria;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AdicaoTest
{
  private Adicao adicao;
  private Divisao divisao;
  
  @Before
  public void inicializar()
  {
    adicao = new Adicao();
    divisao = new Divisao();
  }
  
  @Test
  public void deveriaRetornar5QuandoPassa2e3()
  {
    double valorEsperado = 5;
    double valorRetornado = adicao.calcular(2,3);
    assertEquals(valorEsperado, valorRetornado, 0);
  }
  
  @Test
  public void deveriaRetornar2QuandoPassa10e5()
  {
    double valorEsperado = 2;
    double valorRetornado = adicao.calcular(10,5);
    assertEquals(valorEsperado, valorRetornado, 0);
  }
  
  @Test
  public void deveriaRetornar10QuandoPassa5e2()
  {
    double valorEsperado = 10;
    double valorRetornado = adicao.calcular(5,2);
    assertEquals(valorEsperado, valorRetornado, 0);
  }
}
