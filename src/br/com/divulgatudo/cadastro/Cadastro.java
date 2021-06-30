package br.com.divulgatudo.cadastro;

public class Cadastro {

	private String nomeAnuncio;
	private String cliente;
	private String dataInicio;
	private String dataTermino;
	private Double investimentoDia;
	
	public Cadastro() {

	}

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

	public Double getInvestimentoDia() {
		return investimentoDia;
	}

	public void setInvestimentoDia(Double investimentoDia) {
		this.investimentoDia = investimentoDia;
	}
	

}