package br.com.divulgatudo.cadastro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CadastroTest {

	CadastroRelatorio calculadoraRelatorio = new CadastroRelatorio();

//// Cenarios de testes unitarios ////	
	@Test
	public void calculaTotalInvestidoTest() throws ParseException {
		Cadastro cadastroTeste = populaCadastro();
		Double retornoTotalInvestido = calculadoraRelatorio.calculaTotalInvestido(cadastroTeste.getInvestimentoDia(),
				cadastroTeste.getDataInicio(), cadastroTeste.getDataTermino());
		assertEquals(1456.0, retornoTotalInvestido);
	}

	@Test
	public void geraRelatorioTest() throws ParseException {
		Cadastro cadastroTeste = populaCadastro();
		String retornoRelatorio = calculadoraRelatorio.geraRelatorio(cadastroTeste.getInvestimentoDia(),
				cadastroTeste.getDataInicio(), cadastroTeste.getDataTermino());
		System.out.println(retornoRelatorio);
		assertEquals("Anuncio Teste", "Anuncio Teste");
	}

	@Test
	public void filtroPorClienteTest() throws ParseException {
		ArrayList<Cadastro> cadastros = popularCadastros();
		ArrayList<Cadastro> retornoClientes = calculadoraRelatorio.filtroPorCliente(cadastros, "Cliente Um");
		assertEquals("Anuncio Um", retornoClientes.get(0).getNomeAnuncio());
		assertEquals(1, retornoClientes.size());
	}

	@Test
	public void filtroPorNomeInexistenteTest() throws ParseException {
		ArrayList<Cadastro> cadastros = popularCadastros();
		ArrayList<Cadastro> retornoClientes = calculadoraRelatorio.filtroPorCliente(cadastros, "Cliente Quatro");
		assertEquals(0, retornoClientes.size());
	}

	@Test
	public void filtroPorDataTest() throws ParseException {
		ArrayList<Cadastro> cadastros = popularCadastros();
		ArrayList<Cadastro> retornoClientes = calculadoraRelatorio.filtroPorData(cadastros, "15/04/2021", "20/06/2021");
		assertEquals("Cliente Dois", retornoClientes.get(0).getCliente());
	}

//// Metodos utilitarios para popular cadastros ////
	private Cadastro populaCadastro() {
		Cadastro cadastroTeste = new Cadastro();
		cadastroTeste.setNomeAnuncio("Anuncio Teste");
		cadastroTeste.setCliente("Cliente Teste");
		cadastroTeste.setDataInicio("01/01/2021");
		cadastroTeste.setDataTermino("31/12/2021");
		cadastroTeste.setInvestimentoDia(4.00);

		return cadastroTeste;
	}

	private ArrayList<Cadastro> popularCadastros() {
		ArrayList<Cadastro> cadastros = new ArrayList<>();

		Cadastro cadastroUm = new Cadastro();
		cadastroUm.setNomeAnuncio("Anuncio Um");
		cadastroUm.setCliente("Cliente Um");
		cadastroUm.setDataInicio("01/04/2021");
		cadastroUm.setDataTermino("30/06/2021");
		cadastroUm.setInvestimentoDia(1.00);

		Cadastro cadastroDois = new Cadastro();
		cadastroDois.setNomeAnuncio("Anuncio Dois");
		cadastroDois.setCliente("Cliente Dois");
		cadastroDois.setDataInicio("15/04/2021");
		cadastroDois.setDataTermino("20/06/2021");
		cadastroDois.setInvestimentoDia(3.333333333);

		cadastros.add(cadastroUm);
		cadastros.add(cadastroDois);

		return cadastros;

	}

}
