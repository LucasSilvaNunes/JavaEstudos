package lista1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, pares = 0, impares = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 0 para parar o programa.");	
		System.out.print("Digite um inteiro: ");
		n = scan.nextInt();	
		
		while(n != 0) {
			if(n%2 == 0){
				pares++;
			}else {
				impares++;
			}		
			System.out.print("Digite um inteiro: ");
			n = scan.nextInt();
		}
		
		System.out.printf("A quantidade de números ímpares é: %d\n", impares);
		System.out.printf("A quantidade de números pares é: %d\n", pares);	
	}
}

/* Faça um programa que, enquanto o usuário desejar, leia números
inteiros. Ao final, o programa deve exibir a quantidade de números pares e
ímpares informados. */
