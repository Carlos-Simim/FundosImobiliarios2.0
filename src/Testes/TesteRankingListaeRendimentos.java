package Testes;

import java.time.LocalDate;
import java.util.ArrayList;

import Recursos.*;

public class TesteRankingListaeRendimentos {

	public static void main(String[] args) {

		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Praça de Alimentação");
		FundoImobiliario f2 = new FundoImobiliario("CPTS11","Capitania Securities II","Recebível");
		
		f1.setRendimento(LocalDate.parse("2022-12-25"), 10000);
		f2.setRendimento(LocalDate.parse("2022-12-26"), 1000);
		
		ArrayList<FundoImobiliario> ListaFundos = RankingFundos.getFundos();
		
		for(FundoImobiliario fundo : ListaFundos) {
			System.out.println(fundo + " | Total de rendimentos: R$" + fundo.getRendimentosTotal());
		}
		
	}

}
