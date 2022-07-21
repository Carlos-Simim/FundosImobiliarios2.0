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
		// TODO Auto-generated constructor stub
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

		}
		
		public double getRendimentoAno(LocalDate AnoConsultado) {
			double total = 0;
			
			for(int i = 0; i<this.rendimentos.size(); i++) {
				if(this.rendimentos.get(i).getRendimentosData().getYear() == AnoConsultado.getYear()) {
					total = total + this.rendimentos.get(i).getRendimentosValor();
				}
			}
			
			return total;
		}
		
		public double getRendimentoMesAno(LocalDate MesAnoConsultado) {
			double total = 0;
			
			for(int i = 0; i<this.rendimentos.size(); i++) {
				if(this.rendimentos.get(i).getRendimentosData().getYear() == MesAnoConsultado.getYear()) {
					if(this.rendimentos.get(i).getRendimentosData().getMonth() == MesAnoConsultado.getMonth()) {
						total = total + this.rendimentos.get(i).getRendimentosValor();
					}
				}
			}
			
			return total;
		}

		public double getRendimentoPeriodo(LocalDate inicioPeriodo, LocalDate finalPeriodo) {
			double total = 0;
			
			for(int i = 0; i<this.rendimentos.size(); i++) {
				
				if(this.rendimentos.get(i).getRendimentosData().compareTo(inicioPeriodo) >=0){
					if(this.rendimentos.get(i).getRendimentosData().compareTo(finalPeriodo) <=0) {
						total = total + this.rendimentos.get(i).getRendimentosValor();
					}	
				}
			}
			
			return total;
		}
		
		public ArrayList<Rendimento> getRendimentos(){
			
			return this.rendimentos;
		}
		
		@Override
		public String toString() {
			return this.Ticker+
					" - "+this.Descricao+
					" - "+this.setor.getDescricao();
		}
	
}