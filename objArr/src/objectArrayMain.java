package main;

import java.util.Scanner;

import modelo.Produto;

public class mainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Produto[] produtos = new Produto[2];
		
		for(int i=0; i<produtos.length; i++) {
			produtos[i] = new Produto();
			
			System.out.println("Informe o código do produto: ");
			produtos[i].setCodigo(scan.nextInt());
      
			scan.nextLine();
      
			System.out.println("Informe o nome do produto: ");
			produtos[i].setNome(scan.nextLine());
			
			System.out.println("Informe o preço do produto: ");
			produtos[i].setPreco(scan.nextDouble());
			
			System.out.println("Informe o quantidade em estoque do produto: ");
			produtos[i].setQtEst(scan.nextInt());
			
			System.out.println("Próximo produto...");
			
		}
		
		System.out.println("Produtos: ");
		for(int i=0; i<produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
		
	}

}
