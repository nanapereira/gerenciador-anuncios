package br.com.divulgatudo.anuncio;

public class Anuncio {

	private String nomeAnuncio;
	private String cliente;
	private String dataInicio;
	private String dataTermino;
	private double investimentoDia;

	public String getNomeAnuncio() {
		return nomeAnuncio;
	}

	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getInvestimentoDia() {
		return investimentoDia;
	}

	public void setInvestimentoDia(double investimentoDia) {
		this.investimentoDia = investimentoDia;
	}

}