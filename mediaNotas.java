package aula08ex;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioDeAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe quantos alunos são na turma: ");
		int alunos = scan.nextInt();
		double soma = 0;
		double turma[] = new double[alunos];
		
		for(int i=0; i < turma.length; i++) {
			System.out.println("Informe uma nota: ");
			turma[i] = scan.nextDouble();
			soma = soma + turma[i];
		}
		
		Arrays.sort(turma);
		
		System.out.println("Vetor ordenado: "+Arrays.toString(turma));
		
		System.out.println("Média das notas:"+soma/alunos);
		
	}

}
