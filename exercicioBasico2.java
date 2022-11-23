package lista1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=0, b=0, maior=0;	
		for(int i=1; i<=15; i++){
			System.out.print("Digite um número inteiro: ");
			a = scan.nextInt();
			if(a >= b){
				maior = a;
				b = maior;
			}else {
				maior = b;
				a = maior;
			}
		}	
		System.out.printf("O maior número é: %d\n", maior);
	}

}

/* Faça um programa que leia 15 números inteiros e exiba na tela qual
é o maior dos números lidos */ 
