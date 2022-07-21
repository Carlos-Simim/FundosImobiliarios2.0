package Recursos;

import java.time.LocalDate;

public class CarteiraPessoaJuridica extends Carteira {

	public CarteiraPessoaJuridica(String proprietario, String descricao, String corretora, LocalDate data){		
		super(proprietario, descricao, corretora, data);
		this.taxa = 5.55;
		
	}
	
	public CarteiraPessoaJuridica() {
		super();
		
	}
	
	public double getTaxa(int i) {
		
		return this.taxa;
	}
		
}
