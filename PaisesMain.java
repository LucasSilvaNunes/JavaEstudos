package main;

import java.util.Scanner;

import modelo.Pais;

public class MainPaises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, check = 0;
		Scanner scan = new Scanner(System.in);
		Pais[] paises;
		paises = new Pais[200];
		
		while(check != -1) {
			paises[i] = new Pais();
			
			System.out.println("Digite a sigla do país: ");
			paises[i].setSigla(scan.nextLine());
			
			System.out.println("Digite o nome do país: ");
			paises[i].setNome(scan.nextLine());
			
			System.out.println("Digite a população do país: ");
			paises[i].setPopulacao(scan.nextInt());
			
			System.out.println("Digite a dimensão do país");
			paises[i].setDimensao(scan.nextDouble());
			
			i++;
			
			scan.nextLine();
			
			//Checar a condição de parada do usuário.
			System.out.println("País cadastrado! (Digite -1 para parar o cadastro e 1 para continuar cadastrando.)");
			check = scan.nextInt();
			
			scan.nextLine();
			
		}
		
		
		for(int j=0; j<i; j++) {
			System.out.println(paises[j].toString());
			System.out.println(paises[j].densiPop());
		}

	}

}
