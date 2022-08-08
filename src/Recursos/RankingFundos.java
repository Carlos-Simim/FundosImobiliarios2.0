package Recursos;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class RankingFundos {

	public static HashMap<FundoImobiliario, Categoria> ranking = new HashMap<FundoImobiliario, Categoria>();
	private static Categoria categoriaA = new Categoria("A");
	private static Categoria categoriaB = new Categoria("B");
	private static Categoria categoriaC = new Categoria("C");
	
	public static void atualizarRanking(FundoImobiliario fundoObj) {
		double totalRendimentos = fundoObj.getRendimentosTotal();
		
		if(totalRendimentos > 0) {
			if(totalRendimentos >= 10000) {
				ranking.put(fundoObj, categoriaA);
			}
			if(totalRendimentos >= 5000 && totalRendimentos < 10000) {
				ranking.put(fundoObj, categoriaB);
			}
			if(totalRendimentos < 5000) {
				ranking.put(fundoObj, categoriaC);
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
