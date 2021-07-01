package br.com.divulgatudo.anuncio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.divulgatudo.calculadora.Calculadora;

public class AnuncioPrograma {

	public ArrayList<Anuncio> filtroPorCliente(ArrayList<Anuncio> anuncios, String cliente) throws ParseException {
		ArrayList<Anuncio> anunciosFiltrados = new ArrayList<Anuncio>();
		for (Anuncio anuncio : anuncios) {
			if (anuncio.getCliente() == cliente) {
				anunciosFiltrados.add(anuncio);
				System.out.println(geraRelatorio(anuncio));
			}

		}
		return anunciosFiltrados;
	}

	public ArrayList<Anuncio> filtroPorIntervaloTempo(ArrayList<Anuncio> anuncios, String dataInicio,
			String dataTermino) throws ParseException {
		ArrayList<Anuncio> anunciosFiltrados = new ArrayList<Anuncio>();
		for (Anuncio anuncio : anuncios) {
			if (anuncio.getDataInicio() == dataInicio && anuncio.getDataTermino() == dataTermino) {
				anunciosFiltrados.add(anuncio);
				System.out.println(geraRelatorio(anuncio));
			}

		}
		return anunciosFiltrados;
	}

	private double calculaTotalInvestido(Anuncio anuncio) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date dataUm = formatter.parse(anuncio.getDataInicio());
		Date dataDois = formatter.parse(anuncio.getDataTermino());
		long totalDias = ((dataDois.getTime() - dataUm.getTime()) / 86400000L);
		double valorTotalInvestido = totalDias * anuncio.getInvestimentoDia();
		return valorTotalInvestido;
	}

	public String geraRelatorio(Anuncio anuncio) throws ParseException {
		Calculadora calculadora = new Calculadora();
		double totalInvestido = calculaTotalInvestido(anuncio);
		double maximoVisualizacoes = calculadora.calculaMaximoVisualizacoes(totalInvestido);
		double maximoCliques = calculadora.calculaCliques(totalInvestido);
		double maximoCompartilhamentos = calculadora.calculaCompartilhamentos(totalInvestido);
		String Relatorio = "Valor total investido: R$" + String.format("%.2f", totalInvestido) + "\n"
				+ "Quantidade máxima de visualizações: " + (int) maximoVisualizacoes + "\n"
				+ "Quantidade máxima de cliques: " + (int) maximoCliques + "\n"
				+ "Quantidade máxima de compartilhamentos: " + (int) maximoCompartilhamentos + "\n";
		return Relatorio;
	}

}
