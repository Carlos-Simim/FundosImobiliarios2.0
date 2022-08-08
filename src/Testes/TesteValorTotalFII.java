package Testes;

import java.time.LocalDate;

import Recursos.FundoImobiliario;
import Recursos.RankingFundos;

public class TesteValorTotalFII {

	public static void main(String[] args) {

		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Praça de Alimentação");
		
		f1.setRendimento(LocalDate.parse("2022-12-25"), 5000);
		f1.setRendimento(LocalDate.parse("2022-12-25"), 2000);
		
		//System.out.println("Total dos rendimentos de f1: R$" + RankingFundos.getTotalRendimentos(f1));
		System.out.println(RankingFundos.ranking.get(0));
		
	}

}
