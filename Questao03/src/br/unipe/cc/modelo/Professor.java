package br.unipe.cc.modelo;

public class Professor extends Usuario {

	private String especialidade;

	public Professor(long matricula, String nome, String especialidade) {
		super(matricula, nome);
		this.especialidade = especialidade;
	}
	
	public Professor(){
		this(0, "", "");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
