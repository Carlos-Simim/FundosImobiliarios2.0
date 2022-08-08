package Testes;

import java.time.LocalDate;

import Recursos.FundoImobiliario;
import Recursos.RankingFundos;
import Recursos.Rendimento;

public class TesteCategoriaFII {

	public static void main(String[] args) {

		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Praça de Alimentação");
		
		f1.setRendimento(LocalDate.parse("2022-12-25"), 3000);
		f1.setRendimento(LocalDate.parse("2022-12-26"), 2000);
		
		System.out.println("Categoria de f1: " + RankingFundos.getCategoria(f1));
		
		
	}

}
