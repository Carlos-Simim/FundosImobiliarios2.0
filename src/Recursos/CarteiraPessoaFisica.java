package Recursos;

import java.time.LocalDate;

public class CarteiraPessoaFisica extends Carteira {

	public CarteiraPessoaFisica(String proprietario, String descricao, String corretora, LocalDate data, double taxa){		
		super(proprietario, descricao, corretora, data);
		this.taxa = taxa;		
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
