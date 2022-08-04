package Recursos;

import java.time.LocalDate;

public class CarteiraPessoaJuridica extends Carteira {

	public CarteiraPessoaJuridica(String proprietario, String descricao, String corretora, LocalDate data, double taxa){		
		super(proprietario, descricao, corretora, data);
		this.taxa = taxa;		
	}
	
	public CarteiraPessoaJuridica() {
		super();
		
	}
	
	public double getTaxa(int i) {
		
		return this.taxa;
	}
		
}
