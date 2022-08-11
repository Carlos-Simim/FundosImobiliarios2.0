package Recursos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	
	public static List<FundoImobiliario> getListagemRanking() {
		List<FundoImobiliario> retorno = new ArrayList<FundoImobiliario>();
		
		for(int i = 0; i<ranking.size(); i++) {
			retorno.add((FundoImobiliario) ranking.keySet().toArray()[i]);
		}
		
		return retorno;
	}
	
	public static double getTotalRendimentos(FundoImobiliario fundoObj) {
		return fundoObj.getRendimentosTotal();
	}
	
	public static String getCategoria(FundoImobiliario fundoObj) {
		
		return ranking.get(fundoObj).toString();
	}
	
}
