package Testes;

import java.time.LocalDate;
import Recursos.*;

public class TesteRankingListaeRendimentos {

	public static void main(String[] args) {

		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Pra�a de Alimenta��o");
		FundoImobiliario f2 = new FundoImobiliario("CPTS11","Capitania Securities II","Receb�vel");
		
		f1.setRendimento(LocalDate.parse("2022-12-25"), 7000);
		f1.setRendimento(LocalDate.parse("2022-12-27"), 7000);
		f2.setRendimento(LocalDate.parse("2022-12-26"), 1000);	
		f2.setRendimento(LocalDate.parse("2022-12-29"), 1000);	
		
		
		
		System.out.println(RankingFundos.getListagemRanking(f1));
		System.out.println(RankingFundos.getListagemRanking(f2));
		
	}

}
