package br.unipe.cc.modelo;

public class Aluno extends Usuario implements Comparable<Aluno> {
	
	private double media;
	private int faltas;
	
	public Aluno(long matricula, String nome, double media, int faltas) {
		super(matricula, nome);
		this.media = media;
		this.faltas = faltas;
	}
	
	public Aluno (){
		this(0, "", 0.00, 0);
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int compareTo (Aluno aluno){
		return this.getNome().compareTo(aluno.getNome());
	}
}
