package Testes;

import java.time.LocalDate;

import Recursos.*;

public class TesteExcecao {

	public static void main(String[] args) {

		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Pra�a de Alimenta��o");
		CarteiraPessoaFisica c1 = new CarteiraPessoaFisica("Carlos", "Minha Carteira", "Banco do Brasil",LocalDate.parse("2022-06-24"), 0.0003);
		
		//Negociacao com a data aceitavel
		c1.setNegociacao(LocalDate.parse("2022-12-25"), f1,1, 10, true);
		System.out.println(c1.getNegociacoes().get(0));
		//Negociacao que vai gerar a excecao
		
		try {
			c1.setNegociacao(LocalDate.parse("2021-01-01"), f1, 1, 20, false);
		}catch(DataInvalidaException exc){
			System.out.println("Exceção: " + exc.getMessage());
		}
		
	}

}
