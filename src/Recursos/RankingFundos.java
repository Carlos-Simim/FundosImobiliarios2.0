package Recursos;

import java.util.HashMap;

public abstract class RankingFundos {

	private static HashMap<FundoImobiliario, String> ranking = new HashMap<FundoImobiliario, String>();
	
	public static void atualizarRanking(FundoImobiliario fundoObj) {
		double totalRendimentos = fundoObj.getRendimentosTotal();
		
		if(totalRendimentos > 0) {
			if(totalRendimentos >= 10000) {
				ranking.put(fundoObj, "A");
			}
			if(totalRendimentos >= 5000 && totalRendimentos < 10000) {
				ranking.put(fundoObj, "B");
			}
			if(totalRendimentos < 5000) {
				ranking.put(fundoObj, "C");
			}
		}
		
	}
	
	public static String getListagemRanking(FundoImobiliario fundoObj) {
		String retorno = "";
		
		retorno = retorno + fundoObj.toString();
		retorno = retorno + " - Categoria: " + ranking.get(fundoObj);
		retorno = retorno + " - Total de rendimentos: R$" + fundoObj.getRendimentosTotal();
		
		return retorno;
	}
	
	public static double getTotalRendimentos(FundoImobiliario fundoObj) {
		return fundoObj.getRendimentosTotal();
	}
	
	public static String getCategoria(FundoImobiliario fundoObj) {
		
		return ranking.get(fundoObj).toString();
	}
	
}
