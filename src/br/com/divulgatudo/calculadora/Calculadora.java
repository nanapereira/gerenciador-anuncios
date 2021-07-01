package br.com.divulgatudo.calculadora;

public class Calculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int projecaoMaximaVisualizacoes = calculadora.calculaMaximoVisualizacoes(1.00);
		System.out.println("A projeção aproximada da quantidade máxima de pessoas que visualizarão o mesmo anúncio é: "
				+ projecaoMaximaVisualizacoes);
	}

	public double calculaCliques(double valorTotalInvestido) {
		double vizualizacoesOriginais = valorTotalInvestido * 30;
		double projecaoCliques = vizualizacoesOriginais * (12.0 / 100.0);
		return projecaoCliques;
	}

	public double calculaCompartilhamentos(double valorTotalInvestido) {
		double projecaoCompartilhamentos = (calculaCliques(valorTotalInvestido) / 20) * 3;
		return projecaoCompartilhamentos;
	}

	public double calculaNovasVisualizacoes(double valorTotalInvestido) {
		double projecaoNovasVisualizacoes = calculaCompartilhamentos(valorTotalInvestido) * 40;
		return projecaoNovasVisualizacoes;
	}

	public int calculaMaximoVisualizacoes(double valorTotalInvestido) {
		int projecaoMaximaVisualizacoes = (int) ((valorTotalInvestido * 30)
				+ calculaNovasVisualizacoes(valorTotalInvestido));
		return projecaoMaximaVisualizacoes;
	}

}