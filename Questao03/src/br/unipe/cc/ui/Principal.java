package br.unipe.cc.ui;

import java.util.Scanner;

import br.unipe.cc.modelo.Aluno;
import br.unipe.cc.modelo.Curso;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Curso curso = new Curso();
		
		int opcao;
		
		do{
			System.out.printf("\t\tMENU%n%n");
			System.out.println("1. Incluir alunos");
			System.out.println("2. Remover Aluno");
			System.out.println("3. Verificar se um aluno está matriculado");
			System.out.println("4. Listar todos os alunos aprovados");
			System.out.println("5. Listar todos os alunos reprovados por falta");
			System.out.println("6. Listar por ordem alfabética");
			System.out.println("7. Sair");
			opcao = scan.nextInt();
			
			switch(opcao){
				case 1:{
					Aluno aluno = new Aluno();
					System.out.println("*** INCLUIR ALUNO ***");
					System.out.println("MATRICULA: ");
					aluno.setMatricula(scan.nextLong());
					System.out.println("NOME: ");
					aluno.setNome(scan.next());
					System.out.println("MEDIA: ");
					aluno.setMedia(scan.nextDouble());
					System.out.println("FALTAS: ");
					aluno.setFaltas(scan.nextInt());
					curso.addAluno(aluno);
					break;
				}
				case 2:{
					System.out.println("*** REMOVER ALUNO ***");
					System.out.println("INFORME A MATRICULA OU O NOME DO ALUNO: ");
					String aux = scan.next();
					
					if((aux.charAt(0) >= '0') && (aux.charAt(0) <= '9')){ /* REMOVER POR MATRICULA */
						curso.removerAluno(Integer.parseInt(aux));
					}
					else{ /* REMOVER POR NOME */
						curso.removerAluno(aux);
					}
					
					break;
				}
				case 3:{
					System.out.println("*** VERIFICAR SE UM ALUNO ESTÁ MATRICULADO ***");
					long matricula = scan.nextLong();
					System.out.printf("O ALUNO %s MATRICULADO!%n", curso.containsAluno(matricula) ? "ESTÁ" : "NÃO ESTÁ");
					break;
				}
				case 4:{
					System.out.println("*** LISTAR ALUNOS APROVADOS ***");
					curso.listarAprovados();
					break;
				}
				case 5:{
					System.out.println("*** LISTAR ALUNOS REPROVADOS POR FALTA ***");
					curso.listarReprovados();
					break;
				}case 6:{
					System.out.println("*** LISTAR ALUNOS POR ORDEM ALFABÉTICA ***");
					curso.listarOrdem();
					break;
				}
				default:{
					break;
				}
			}
		}while(opcao != 7);
		
		
		scan.close();
	}
}
