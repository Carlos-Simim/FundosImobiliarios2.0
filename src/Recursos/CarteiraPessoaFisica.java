package Recursos;

import java.time.LocalDate;

public class CarteiraPessoaFisica extends Carteira {

	public CarteiraPessoaFisica(String proprietario, String descricao, String corretora, LocalDate data){		
		super(proprietario, descricao, corretora, data);
		this.taxa = 0.0003;
		
	}
	
	public CarteiraPessoaFisica() {
		super();
		
	}
	
	public double getTaxa(int i) {
		double retorno = 0;
		retorno = (this.getNegociacoes().get(i).getQuantidade() * this.getNegociacoes().get(i).getValor())*this.taxa;
		
		return retorno;
	}	
	
}
