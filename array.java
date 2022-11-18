package aula08ex;

import java.util.Arrays;
import java.util.Scanner;

public class mainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[10];
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Informe um número: ");
			numeros[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(numeros));
		
		// Arrays.equals(arr1, arr2); ->  Checar se os vetores são iguais.
		// Arrays.copyOfRange(arr1, x, y); -> Faz cópia do array da posição x até y.
		// Arrays.copyOf(arr1, arr1.length); -> Faz cópia do array a partir da posição inicial.
		// Arrays.sort(arr1): Ordenação em ordem crescente do array.
	}

}
