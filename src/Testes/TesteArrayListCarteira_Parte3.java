package Testes;

import java.time.LocalDate;
import Recursos.*;

public class TesteArrayListCarteira_Parte3 {

	public static void main(String[] args) {
		Carteira c1 = new Carteira("Carlos", "Minha Carteira", "Banco do Brasil",LocalDate.parse("2022-06-24"));
		c1.setNegociacao(LocalDate.parse("2022-01-01"), "KNRI11",1, 10, true);
		c1.setNegociacao(LocalDate.parse("2022-01-01"), "KNRI11", 1, 20, false);
		
		System.out.println("Data: " + c1.getNegociacoes().get(0).getData());
		System.out.println("Fundo negociado: " + c1.getNegociacoes().get(0).getTicker());
		System.out.println("Quantidade: " + c1.getNegociacoes().get(0).getQuantidade());
		System.out.println("Valor da cota: " + c1.getNegociacoes().get(0).getValor());
		System.out.println("Tipo da negociação: " + c1.getNegociacoes().get(0).getTipo());
		
	}

}
