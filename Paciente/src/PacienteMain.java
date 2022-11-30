//FALTA: colocar enunciado e checar se o código já foi utilizado na hora do cadastro.

package principal;

import java.util.Scanner;

import modelo.Paciente;

public class mainPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu = 0, i = 0, code;
		
		Paciente[] pacientes;
		pacientes = new Paciente[50];
		
		System.out.println("O que você deseja fazer? ");
		System.out.println("\n1- Cadastrar paciente\n2- Buscar cliente pelo código\n3- Exibir dados dos pacientes\n4- Sair");
		menu = scan.nextInt();
		
		while(menu > 0 && menu != 4 && menu < 5) {
			if(menu == 1) {
				pacientes[i] = new Paciente();
				
				System.out.println("Digite o código do novo paciente: ");
				pacientes[i].setCodigo(scan.nextInt());
				scan.nextLine();
				
				System.out.println("Digite o nome do novo paciente: ");
				pacientes[i].setNome(scan.nextLine());
				
				System.out.println("Digite o CPF do novo paciente: ");
				pacientes[i].setCPF(scan.nextLine());
				
				System.out.println("Digite o telefone do novo paciente: ");
				pacientes[i].setTelefone(scan.nextLine());
				
				i++;
				
				//Para não deixar o while em loop.
				System.out.println("\nO que você deseja fazer? ");
				System.out.println("\n1- Cadastrar paciente\n2- Buscar cliente pelo código\n3- Exibir dados dos pacientes\n4- Sair");
				menu = scan.nextInt();
				
			}else if(menu == 2) {
				
				System.out.println("Digite o código do paciente que deseja buscar: ");
				code = scan.nextInt();
				for(int j=0; j<i; j++) {
					if(pacientes[j].isEqual(code)) {
						System.out.println(pacientes[j].toString());
					}
				}
				
				//Para não deixar o while em loop.
				System.out.println("\nO que você deseja fazer? ");
				System.out.println("\n1- Cadastrar paciente\n2- Buscar cliente pelo código\n3- Exibir dados dos pacientes\n4- Sair");
				menu = scan.nextInt();
				
			}else { //menu == 3
				
				for(int j=0; j<i; j++) {
					System.out.println(pacientes[j].toString());
				}
				
				//Para não deixar o while em loop.
				System.out.println("\nO que você deseja fazer? ");
				System.out.println("\n1- Cadastrar paciente\n2- Buscar cliente pelo código\n3- Exibir dados dos pacientes\n4- Sair");
				menu = scan.nextInt();
			}
		}
		
		System.out.println("Terminando o programa...");
		
	}

}
