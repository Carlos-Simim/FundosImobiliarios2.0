package Testes;

import java.time.LocalDate;
import Recursos.*;

public class TesteExtrato_Parte4 {

	public static void main(String[] args) {

		CarteiraPessoaFisica c1 = new CarteiraPessoaFisica("Carlos", "Minha Carteira", "Banco do Brasil",LocalDate.parse("2022-06-24"));
		c1.setNegociacao(LocalDate.parse("2022-01-01"), "KNRI11",1, 10, true);
		c1.setNegociacao(LocalDate.parse("2022-01-01"), "KNRI11", 1, 20, false);
		
		System.out.println(ExtratoCarteira.getExtrato(c1));
		
	}

}