package Recursos;

import java.time.LocalDate;
import java.util.ArrayList;

public class FundoImobiliario {

	private String Ticker;
	private String Descricao;
	private Setor setor;
	private ArrayList<Rendimento> rendimentos = new ArrayList<Rendimento>();
	
	public FundoImobiliario(String ticker, String descricao, String descricaoSetor){
		this.setor = new Setor(descricaoSetor);
		this.Ticker = ticker;
		this.Descricao = descricao;			
	}
	
		public FundoImobiliario() {

		}

		public String getTicker() {
			
			return this.Ticker;
		}
		
		public String getDescricao() {
			
			return this.Descricao;			
		}
		
		public String getSetorDescricao() {
			
			return this.setor.getDescricao();			
		}
	
		public void setRendimento(LocalDate data, double valor) {
			this.rendimentos.add(new Rendimento(data, valor));
			RankingFundos.adicionarRanking(this);
		}
		
		public double getRendimentoAno(LocalDate AnoConsultado) {
			double total = 0;
			
			for(int i = 0; i<this.rendimentos.size(); i++) {
				if(this.rendimentos.get(i).getRendimentoData().getYear() == AnoConsultado.getYear()) {
					total = total + this.rendimentos.get(i).getRendimentoValor();
				}
			}
			
			return total;			
		}
		
		public double getRendimentoMesAno(LocalDate MesAnoConsultado) {
			double total = 0;
			
			for(int i = 0; i<this.rendimentos.size(); i++) {
				if(this.rendimentos.get(i).getRendimentoData().getYear() == MesAnoConsultado.getYear()) {
					if(this.rendimentos.get(i).getRendimentoData().getMonth() == MesAnoConsultado.getMonth()) {
						total = total + this.rendimentos.get(i).getRendimentoValor();
					}
				}
			}
			
			return total;			
		}

		public double getRendimentoPeriodo(LocalDate inicioPeriodo, LocalDate finalPeriodo) {
			double total = 0;
			
			for(int i = 0; i<this.rendimentos.size(); i++) {
				
				if(this.rendimentos.get(i).getRendimentoData().compareTo(inicioPeriodo) >=0){
					if(this.rendimentos.get(i).getRendimentoData().compareTo(finalPeriodo) <=0) {
						total = total + this.rendimentos.get(i).getRendimentoValor();
					}	
				}
			}
			
			return total;			
		}
		
		public ArrayList<Rendimento> getRendimentos(){
			
			return this.rendimentos;			
		}
		
		public double getRendimentosTotal() {
			double soma = 0;
			
			for(Rendimento d : this.rendimentos) {
				soma = soma + d.getRendimentoValor();
			}
			
			return soma;
		}
		
		public String getCategoria() {
			return RankingFundos.getCategoria(this);
		}
		
		@Override
		public String toString() {
			return this.Ticker+
					" - "+this.Descricao+
					" - "+this.setor.getDescricao();			
		}
	
}