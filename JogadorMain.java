package principal;

import java.util.Scanner;

import modelo.Jogador;

public class mainJogador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String nome, posicao, pais;
		double peso = 0.0, altura = 0.0;
		
		Jogador[] jogadores;
		jogadores = new Jogador[40];
		
		for(int i=0; i<40; i++) {
			jogadores[i] = new Jogador();
		}
		
		for(int i=0; i<40; i++) {
			
			System.out.println("Insira o nome do jogador: ");
			nome = scan.nextLine();
			jogadores[i].setNome(nome); 
			
			System.out.println("Insira a posicao do jogador: ");
			posicao = scan.nextLine();
			jogadores[i].setPosicao(posicao);
			
			System.out.println("Insira a nacionalidade do jogador: ");
			pais = scan.nextLine();
			jogadores[i].setPais(pais);
			
			System.out.println("Insira o peso do respectivo jogador: ");
			peso = scan.nextDouble();
			jogadores[i].setPeso(peso);
			
			System.out.println("Insira a altura do respectivo jogador:");
			altura = scan.nextDouble();
			jogadores[i].setAltura(altura);
			
			// QUER PARAR? "S" >> i = 40; pra parar o for.
			
		}
		
		for(int i=0; i<40; i++) {
			jogadores[i].showData();
			System.out.println(jogadores[i].IMC());
		}
		
	}

}

/* 2. Crie uma classe para representar um jogador de futebol, com os
atributos nome, posição, nacionalidade, altura e peso. Crie os métodos de
acesso aos atributos (setters e getters) e também um método para imprimir
todos os dados do jogador. Além disso, defina um método para calcular o
IMC do jogador. Em seguida, crie uma classe com o método main utilizando
array de objetos para armazenar os dados de até 40 jogadores, de acordo
com o desejo do usuário. Ao final, o programa deve exibir todos os dados
dos jogadores, bem como o IMC de cada um deles.*/
