package br.com.divulgatudo.cadastro;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CadastroRelatorio {

	public Double calculaTotalInvestido(Double investimentoDia, String dataInicio, String dataTermino)
			throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date dataUm = formatter.parse(dataInicio);
		Date dataDois = formatter.parse(dataTermino);
		long totalDias = ((dataDois.getTime() - dataUm.getTime()) / 86400000L);
		Double valorTotalInvestido = totalDias * investimentoDia;
		return valorTotalInvestido;
	}

	public String geraRelatorio(Double investimentoDia, String dataInicio, String dataTermino) throws ParseException {
		double vizualizacoesOriginais = calculaTotalInvestido(investimentoDia, dataInicio, dataTermino) * 30;
		double quantidadeMaximaDeCliques = vizualizacoesOriginais * (12.0 / 100.0);
		double quantidadeMaximaDeCompartilhamentos = (quantidadeMaximaDeCliques / 20) * 3;
		double novasVisualizacoes = quantidadeMaximaDeCompartilhamentos * 40;
		int quantidadeMaximaVisualizacoes = (int) (vizualizacoesOriginais + novasVisualizacoes);

		String Relatorio = "Valor total investido: R$"
				+ String.format("%.2f", calculaTotalInvestido(investimentoDia, dataInicio, dataTermino)) + "\n"
				+ "Quantidade máxima de visualizações: " + quantidadeMaximaVisualizacoes + "\n"
				+ "Quantidade máxima de cliques: " + (int) quantidadeMaximaDeCliques + "\n"
				+ "Quantidade máxima de compartilhamentos: " + (int) quantidadeMaximaDeCompartilhamentos + "\n";

		return Relatorio;
	}

	public ArrayList<Cadastro> filtroPorCliente(ArrayList<Cadastro> cadastros, String cliente) throws ParseException {
		ArrayList<Cadastro> cadastrosFiltrados = new ArrayList<Cadastro>();
		for (Cadastro cadastro : cadastros) {
			if (cadastro.getCliente() == cliente) {
				cadastrosFiltrados.add(cadastro);
			}

		}
		for (int i = 0; i < cadastrosFiltrados.size(); i++) {
			System.out.println(geraRelatorio(cadastrosFiltrados.get(i).getInvestimentoDia(), cadastrosFiltrados.get(i).getDataInicio(),
					cadastrosFiltrados.get(i).getDataTermino()));			
		}
		return cadastrosFiltrados;
	}

	public ArrayList<Cadastro> filtroPorData(ArrayList<Cadastro> cadastros, String dataInicio, String dataTermino)
			throws ParseException {
		ArrayList<Cadastro> cadastrosFiltrados = new ArrayList<Cadastro>();
		for (Cadastro cadastro : cadastros) {
			if (cadastro.getDataInicio() == dataInicio) {
				if (cadastro.getDataTermino() == dataTermino) {
					cadastrosFiltrados.add(cadastro);
				}

			}
		}
		for (int i = 0; i < cadastrosFiltrados.size(); i++) {
			System.out.println(geraRelatorio(cadastrosFiltrados.get(i).getInvestimentoDia(), cadastrosFiltrados.get(i).getDataInicio(),
					cadastrosFiltrados.get(i).getDataTermino()));			
		}
		return cadastrosFiltrados;
	}

}
