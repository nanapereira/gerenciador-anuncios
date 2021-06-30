package br.com.divulgatudo.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Calculadora {

	public int calculaAlcanceAnuncio(Double valorInvestido) {
		double vizualizacoesOriginais = valorInvestido * 30;
		double novosCliques = vizualizacoesOriginais * (12.0 / 100.0);
		double novosCompartilhamentos = (novosCliques / 20) * 3;
		double novasVisualizacoes = novosCompartilhamentos * 40;
		int projecaoVisualizacoes = (int) (vizualizacoesOriginais + novasVisualizacoes);
		return projecaoVisualizacoes;
	}

	@Test
	public void calculaAlcanceAnuncioTeste() {
		int pessoasQueVizualizam = calculaAlcanceAnuncio(1.00);
		assertEquals(51, pessoasQueVizualizam);

	}

	@Test
	public void calculaAlcanceAnuncioZeroTest() {
		int pessoasQueVizualizam = calculaAlcanceAnuncio(0.0);
		assertEquals(0, pessoasQueVizualizam);
	}
	
	@Test
	public void calculaAlcanceAnuncioDoisTest() {
		int pessoasQueVizualizam = calculaAlcanceAnuncio(3.333333333);
		assertEquals(171, pessoasQueVizualizam);
	}

}