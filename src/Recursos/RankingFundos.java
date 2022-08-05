package Recursos;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class RankingFundos {

	private static HashSet<FundoImobiliario> CategoriaA = new HashSet<FundoImobiliario>();
	private static HashSet<FundoImobiliario> CategoriaB = new HashSet<FundoImobiliario>();
	private static HashSet<FundoImobiliario> CategoriaC = new HashSet<FundoImobiliario>();
	//static RankingFundos ranking = new RankingFundos();
	
	public static void adicionarRanking(FundoImobiliario fundoObj) {
		double distribuicao = fundoObj.getRendimentosTotal();
		
		if(distribuicao > 0) {
			
			if(distribuicao>=10000) {
				CategoriaA.add(fundoObj);
			}
			if(distribuicao>=5000 && distribuicao<10000) {
				CategoriaB.add(fundoObj);
			}
			if(distribuicao<5000) {
				CategoriaC.add(fundoObj);
			}
			
		}
		
		limparRanking(fundoObj);
	}
	
	private static void limparRanking(FundoImobiliario fundoObj) {
		if(CategoriaA.contains(fundoObj)) {
			CategoriaB.remove(fundoObj);
			CategoriaC.remove(fundoObj);
			return;
		}
		if(CategoriaB.contains(fundoObj)) {
			CategoriaC.remove(fundoObj);
		}
	}
	
	public static ArrayList<FundoImobiliario> getFundos(){
		ArrayList<FundoImobiliario> retorno = new ArrayList<FundoImobiliario>(CategoriaA);
		retorno.addAll(new ArrayList<FundoImobiliario>(CategoriaB));
		retorno.addAll(new ArrayList<FundoImobiliario>(CategoriaC));
		
		return retorno;
	}
	
	public static String getCategoria(FundoImobiliario fundoObj) {
		if(CategoriaA.contains(fundoObj)) {
			return "Categoria A";
		}
		if(CategoriaB.contains(fundoObj)) {
			return "Categoria B";
		}
		if(CategoriaC.contains(fundoObj)) {
			return "Categoria C";
		}
		return null;
	}
	
	public static String getRankingsGeral() {
		return "A: " + CategoriaA.toString() + 
				"\nB: " + CategoriaB.toString() + 
				"\nC: " + CategoriaC.toString();			
	}
	
}
