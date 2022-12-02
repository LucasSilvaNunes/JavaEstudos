package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;

public class MainAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check;
		double soma=0;
		String nome;
		Scanner scan = new Scanner(System.in);
		ArrayList <Aluno> alunosLista = new ArrayList <Aluno>();
		
		System.out.println("\n1- Cadastrar um aluno;"
				+ "\n2- Buscar um aluno pelo nome;"
				+ "\n3- Exibir a lista de alunos;"
				+ "\n4- Calcular a média da turma;"
				+ "\n5- Sair;");
		check = scan.nextInt();
		
		while(check > 0 && check < 5) {
			
			if(check == 1) {
				Aluno aluno = new Aluno();
				
				System.out.println("Digite a matrícula do Aluno: ");
				aluno.setMatricula(scan.nextLong());
				scan.nextLine();
				System.out.println("Digite o nome do Aluno: ");
				aluno.setNome(scan.nextLine());
				System.out.println("Digite a primeira nota do Aluno: ");
				aluno.setNota1(scan.nextDouble());
				System.out.println("Digite a segunda nota do Aluno: ");
				aluno.setNota2(scan.nextDouble());
				aluno.setMedia();
				
				alunosLista.add(aluno);
				
				System.out.println("\n1- Cadastrar um aluno;"
						+ "\n2- Buscar um aluno pelo nome;"
						+ "\n3- Exibir a lista de alunos;"
						+ "\n4- Calcular a média da turma;"
						+ "\n5- Sair;");
				check = scan.nextInt();
				
			}else if(check == 2) {
				scan.nextLine();
				System.out.println("Digite o nome que queira procurar: ");
				nome = scan.nextLine();
				for(int i=0; i<alunosLista.size(); i++) {
					if(alunosLista.get(i).comparaNome(nome)) {
						System.out.println(alunosLista.get(i).toString());
					}
				}
				System.out.println("Aluno não consta no sistema!");
				System.out.println("\n1- Cadastrar um aluno;"
						+ "\n2- Buscar um aluno pelo nome;"
						+ "\n3- Exibir a lista de alunos;"
						+ "\n4- Calcular a média da turma;"
						+ "\n5- Sair;");
				check = scan.nextInt();
				
			}else if(check == 3) {
				for(int i=0; i<alunosLista.size(); i++) {
					System.out.println(alunosLista.get(i).toString());
				}
				System.out.println("\n1- Cadastrar um aluno;"
						+ "\n2- Buscar um aluno pelo nome;"
						+ "\n3- Exibir a lista de alunos;"
						+ "\n4- Calcular a média da turma;"
						+ "\n5- Sair;");
				check = scan.nextInt();
				
			}else if(check == 4) {
				for(int i=0; i<alunosLista.size(); i++) {
					soma = soma + alunosLista.get(i).getMedia();
				}
				System.out.println("A média da turma é: "+(soma/alunosLista.size()));
				System.out.println("\n1- Cadastrar um aluno;"
						+ "\n2- Buscar um aluno pelo nome;"
						+ "\n3- Exibir a lista de alunos;"
						+ "\n4- Calcular a média da turma;"
						+ "\n5- Sair;");
				check = scan.nextInt();
			}
		}
		
		System.out.println("\nTerminando o programa...");
	}

}

/*Escreva uma classe que represente um aluno de um curso X. Os dados do aluno são:
matrícula, nome, nota1, nota2 e média. Escreva a classe em Java contendo:
a) Construtor padrão e outro com a matrícula, nome, nota1 e nota2;
b) Métodos de acesso (getter/setter);
c) Um método que retorne a média do aluno(deve ser utilizado no construtor);
d) Um método para comparação de dois nomes, retornando o resultado da comparação;
e) Um método que permita exibir os dados aluno.
Em seguida, você deve criar a classe MainTurma que cria uma lista de alunos e permita:
1- Cadastrar um aluno;
2- Buscar um aluno pelo nome;
3- Exibir a lista de alunos;
4- Calcular a média da turma;
5- Sair;*/
