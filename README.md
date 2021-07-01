# Desafio Capgemini

## 1ª parte

##### A classe Calculadora.java contém um método que recebe o valor investido em reais e retorne uma projeção aproximada da quantidade máxima de pessoas que visualizarão o mesmo anúncio (considerando o anúncio original + os compartilhamentos).

##### Os métodos que calculam as projecões de cliques, compartilhamentos e novas vizualizações foram implementados induvidualmente para serem utilizados posteriormente para gerar relatorio de cada anúncio.

#### A classe não contém testes unitários no pacote pois os métodos estão sendo chamados na classe AnuncioProgramaTeste.java no método geraRelatorioTeste(), garantindo assim a sua cobertura total.

#### Foi implementada uma função main() para se tornar independente da execução dos testes.

https://github.com/nanapereira/gerenciador-anuncios/tree/master/src/br/com/divulgatudo/calculadora

## 2ª parte

#### No pacote encontram-se três classes.

##### Anuncio.java que contém os atributos da entidade Anuncio, assim como os métodos de getters e setters.

##### A classe AnuncioPrograma.java é responsavél pela regra de negocio e possui os métodos de calcularTotalInvestido(), filtroPorCliente(), filtroPorIntervaloTempo() e geraRelatorio(), ambos recebem anúncios como parâmetros, estão sendo populados na classe de teste.

##### A classe AnuncioProgramaTeste comtém os cenários de testes unitários para os métodos e popula uma lista de anuncios que serão utilizados para testar a classe da regra de negócio.

https://github.com/nanapereira/gerenciador-anuncios/tree/master/src/br/com/divulgatudo/anuncio

## A linguaguem escolhido foi Java 11

## Framework de teste é Junit 5
