package Testes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Recursos.*;

public class TesteNegociacoesOrdemCronologica {
	
	public static void main(String[] args) {

		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Praça de Alimentação");
		CarteiraPessoaFisica c1 = new CarteiraPessoaFisica("Carlos", "Minha Carteira", "Banco do Brasil",LocalDate.parse("2022-06-24"), 0.0003);
		
		c1.setNegociacao(LocalDate.parse("2022-12-28"), f1,1, 10, true);
		c1.setNegociacao(LocalDate.parse("2022-12-25"), f1,1, 20, false);
		c1.setNegociacao(LocalDate.parse("2022-12-26"), f1,1, 10, true);
		c1.setNegociacao(LocalDate.parse("2022-12-27"), f1,1, 20, false);
				
		
		List<Negociacao> ListaAscendente = c1.getNegociacoesOrdemCronologica(true); //true = ordem ascendente		
		for(Negociacao n: ListaAscendente) {
			System.out.println(n);
		}
		
		System.out.println();
		List<Negociacao> ListaDescendente = c1.getNegociacoesOrdemCronologica(false); //false = ordem descendente
		for(Negociacao n: ListaDescendente) {
			System.out.println(n);
		}
		
	}
	
}
