package Recursos;

public class Setor {
	private String setorDescricao;
	private String setorId;
	private static int Id = 1;
	
	public Setor(){
		
	}
	
	public Setor (String descricao) {
		this.setorDescricao = descricao;
		this.setorId = "S" + Integer.toString(Id);
		Id = Id + 1;
		
	}
	
	public void setDescricao(String descricao) {
		this.setorDescricao = descricao;
		
	}
	
	public String getDescricao() {
		
		return this.setorDescricao;
	}
	
	@Override
	public String toString() {
		return this.setorDescricao + 
				" - "+this.setorId;
	}
	
}
