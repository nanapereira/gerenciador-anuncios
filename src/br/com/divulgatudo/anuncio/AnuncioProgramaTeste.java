package br.com.divulgatudo.anuncio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.ArrayList;

import org.junit.Test;

public class AnuncioProgramaTeste {

	AnuncioPrograma anuncioPrograma = new AnuncioPrograma();

	@Test
	public void geraRelatorioTeste() throws ParseException {
		Anuncio anuncioTeste = popularAnuncios().get(0);
		String retornoRelatorio = anuncioPrograma.geraRelatorio(anuncioTeste);
		assertTrue(retornoRelatorio.contains("R$90,00"));
	}

	@Test
	public void filtroPorClienteTeste() throws ParseException {
		ArrayList<Anuncio> anuncios = popularAnuncios();
		ArrayList<Anuncio> anunciosRetornados = anuncioPrograma.filtroPorCliente(anuncios, "Cliente Dois");
		assertEquals(anunciosRetornados.get(0).getCliente(), "Cliente Dois");
	}

	@Test
	public void filtroPorIntervaloTempo() throws ParseException {
		ArrayList<Anuncio> anuncios = popularAnuncios();
		ArrayList<Anuncio> anunciosRetornados = anuncioPrograma.filtroPorIntervaloTempo(anuncios, "23/07/2021",
				"20/12/2022");
		assertEquals(anunciosRetornados.get(0).getNomeAnuncio(), "Anuncio Tres");
	}

	// Populando uma lista de anuncios.
	private ArrayList<Anuncio> popularAnuncios() {
		ArrayList<Anuncio> anuncios = new ArrayList<>();

		Anuncio anuncioUm = new Anuncio();
		anuncioUm.setNomeAnuncio("Anuncio Um");
		anuncioUm.setCliente("Cliente Um");
		anuncioUm.setDataInicio("01/04/2021");
		anuncioUm.setDataTermino("30/06/2021");
		anuncioUm.setInvestimentoDia(1.00);

		Anuncio anuncioDois = new Anuncio();
		anuncioDois.setNomeAnuncio("Anuncio Dois");
		anuncioDois.setCliente("Cliente Dois");
		anuncioDois.setDataInicio("15/04/2021");
		anuncioDois.setDataTermino("20/06/2021");
		anuncioDois.setInvestimentoDia(3.333333333);

		Anuncio anuncioTres = new Anuncio();
		anuncioTres.setNomeAnuncio("Anuncio Tres");
		anuncioTres.setCliente("Cliente Tres");
		anuncioTres.setDataInicio("23/07/2021");
		anuncioTres.setDataTermino("20/12/2022");
		anuncioTres.setInvestimentoDia(0.50);

		anuncios.add(anuncioUm);
		anuncios.add(anuncioDois);
		anuncios.add(anuncioTres);

		return anuncios;

	}

}
