package br.unipe.cc.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String id;
	private String nome;
	private Professor professor;
	private List<Aluno> alunos;
	
	public Curso(String id, String nome, Professor professor, List<Aluno> alunos) {
		this.id = id;
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
	}
	
	public Curso(String id, String nome){
		this(id, nome, new Professor(), new ArrayList<Aluno>());
	}
	
	public Curso() {
		this("", "");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void addAluno (Aluno aluno){
		boolean result = true;
		
		for(int i = 0; i < this.alunos.size(); i++){
			if(aluno.getMatricula() == this.alunos.get(i).getMatricula()){
				result = false;
				break;
			}
		}
		
		if(result){
			this.alunos.add(aluno);
		}
	}

	public Aluno getAluno (int index){
		return this.alunos.get(index);
	}
	
	public boolean containsAluno (long matricula){
		boolean result = false;
		
		for(int i = 0; i < this.alunos.size(); i++){
			if(matricula == this.alunos.get(i).getMatricula()){
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public void removerAluno (String nome){
		for(int i = 0; i < this.alunos.size(); i++){
			if(nome.equals(this.alunos.get(i).getNome())){
				this.alunos.remove(i);
				break;
			}
		}
	}
	
	public void removerAluno (long matricula){
		for(int i = 0; i < this.alunos.size(); i++){
			if(matricula == this.alunos.get(i).getMatricula()){
				this.alunos.remove(i);
				break;
			}
		}
	}
	
	public void listarAprovados (){
		for(int i = 0; i < this.alunos.size(); i++){
			if((this.alunos.get(i).getMedia() > 7.00) && (this.alunos.get(i).getFaltas() <= 15)){
				System.out.printf("MATRICULA: %d - NOME: %s%n", this.alunos.get(i).getMatricula(), this.alunos.get(i).getNome());
			}
		}
	}
	
	public void listarReprovados (){
		for(int i = 0; i < this.alunos.size(); i++){
			if(this.alunos.get(i).getFaltas() > 15){
				System.out.printf("MATRICULA: %d - NOME: %s%n", this.alunos.get(i).getMatricula(), this.alunos.get(i).getNome());
			}
		}
	}
	
	public void listarOrdem (){
		Collections.sort(this.alunos);
		
		for(int i = 0; i < this.alunos.size(); i++){
			System.out.printf("MATRICULA: %d - NOME: %s%n", this.alunos.get(i).getMatricula(), this.alunos.get(i).getNome());
		}
	}
	
}
