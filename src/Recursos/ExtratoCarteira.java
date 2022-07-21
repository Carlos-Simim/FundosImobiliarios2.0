package Recursos;

public abstract class ExtratoCarteira {

	public static String getExtrato(Carteira carteira) {
		String retorno = "";
		
		retorno = retorno + carteira;
		
		retorno = retorno + "\n\nData - Fundo - Quantidade - Valor - Tipo - Taxa" 		 
		+ carteira.listaNegocios()
		+"\nTotal acumulado de taxas: R$" + carteira.getTotalTaxas()
		+"\nTotal de compras: R$" + carteira.getTotalNegociacoes(true)
		+"\nTotal de vendas: R$" + carteira.getTotalNegociacoes(false);

		return retorno;
	}
	
}
