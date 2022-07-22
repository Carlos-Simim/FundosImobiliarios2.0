package Recursos;

public abstract class ExtratoCarteira {

	public static String getExtrato(Carteira carteira) {
		String retorno = "";
		
		retorno = retorno + carteira;
		
		retorno = retorno + carteira.listaNegocios()
		+"\n\nTotal acumulado de taxas: R$" + carteira.getTotalTaxas()
		+"\nTotal de compras: R$" + carteira.getTotalNegociacoes(true)
		+"\nTotal de vendas: R$" + carteira.getTotalNegociacoes(false);

		return retorno;
	}
	
}
