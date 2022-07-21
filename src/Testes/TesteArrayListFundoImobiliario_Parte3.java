package Testes;

import java.time.LocalDate;
import Recursos.*;

public class TesteArrayListFundoImobiliario_Parte3 {

	public static void main(String[] args) {
		FundoImobiliario f1 = new FundoImobiliario("KNRI11","Kinea Renda Imobiliaria","Praï¿½a de Alimentaï¿½ï¿½o");
		
		//Inclusão de elementos na lista
		f1.setRendimento(LocalDate.parse("2021-01-01"),10);		
		f1.setRendimento(LocalDate.parse("2021-02-01"),15);	
		
		//Consulta de elementos da lista
		System.out.println("Data do rendimento: " + f1.getRendimentos().get(0).getRendimentosData());
		System.out.println("Valor do rendimento: R$" + f1.getRendimentos().get(0).getRendimentosValor());
	}

}
