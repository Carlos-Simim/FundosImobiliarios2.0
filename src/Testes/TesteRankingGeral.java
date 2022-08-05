package Testes;

import java.util.Iterator;
import java.util.List;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

import Recursos.*;

public class TesteRankingGeral {

	public static void main(String[] args) {
		
		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Pra�a de Alimenta��o");
		FundoImobiliario f2 = new FundoImobiliario("CPTS11","Capitania Securities II","Receb�vel");
		FundoImobiliario f3 = new FundoImobiliario("BRCO11","Bresco Log�stica","Galp�o log�stico");
		
		f1.setRendimento(LocalDate.parse("2022-12-25"), 10000); //Ranking A
		f2.setRendimento(LocalDate.parse("2022-12-26"), 5000); //Ranking B
		f3.setRendimento(LocalDate.parse("2022-12-27"), 4000); //Ranking C
		
		System.out.println(RankingFundos.getRankingsGeral());
		
	}

}
