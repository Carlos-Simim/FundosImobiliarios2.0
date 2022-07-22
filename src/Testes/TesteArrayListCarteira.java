package Testes;

import java.time.LocalDate;
import Recursos.*;

public class TesteArrayListCarteira {

	public static void main(String[] args) {
		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Pra�a de Alimenta��o");
		Carteira c1 = new Carteira("Carlos", "Minha Carteira", "Banco do Brasil",LocalDate.parse("2022-06-24"));
		
		//Inclus�o de elementos na lista
		c1.setNegociacao(LocalDate.parse("2022-01-01"), f1,1, 10, true);
		c1.setNegociacao(LocalDate.parse("2022-01-01"), f1, 1, 20, false);
		
		//Consulta de elementos da lista
		System.out.println("Data: " + c1.getNegociacoes().get(0).getData());
		System.out.println("Fundo negociado: " + c1.getNegociacoes().get(0).getFundoNegociado());
		System.out.println("Quantidade: " + c1.getNegociacoes().get(0).getQuantidade());
		System.out.println("Valor da cota: R$" + c1.getNegociacoes().get(0).getValor());
		System.out.println("Tipo da negocia��o: " + c1.getNegociacoes().get(0).getTipo());
		
	}

}