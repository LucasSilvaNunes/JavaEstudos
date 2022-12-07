package principal;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Contato;

public class mainContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList <Contato> contatos = new ArrayList <Contato>();
		Contato c;
		int resp, cont;
		String nome;
		do {
			System.out.println("1- Cadastrar um contato;");
			System.out.println("2- Buscar por um contato;");
			System.out.println("3- Remover um contato;");
			System.out.println("4- Exibir todos os contatos;");
			System.out.println("5- Finalizar o programa\n");	
			System.out.println("O que deseja fazer?");
			resp = scan.nextInt();
			
			if(resp==1) {
				scan.nextLine();
				c = new Contato();
				System.out.println("Digite o nome do contato: ");
				c.setNome(scan.nextLine());
				System.out.println("Digite o telefone 1 do contato: ");
				c.setTelefone1(scan.nextLine());
				System.out.println("Digite o telefone 2 do contato: ");
				c.setTelefone2(scan.nextLine());
				System.out.println("Digite o endereço do contato: ");
				c.setEndereco(scan.nextLine());
				System.out.println("Digite a relação do contato: ");
				c.setRelacao(scan.nextLine());
				contatos.add(c);
				System.out.println("Usuário cadastrado.\n");
			}else if(resp == 2) {
				scan.nextLine();
				System.out.println("Digite o nome que você quer buscar: ");
				nome = scan.nextLine();
				cont = 0;
				for(int i=0; i<contatos.size(); i++) {
					if(contatos.get(i).comparaNome(nome)) {
						System.out.println(contatos.get(i).toString());
						cont++;
					}
				}
				if(cont == 0) {
					System.out.println("Contato não encontrado.\n");
				}
			}else if(resp == 3) {
				scan.nextLine();
				System.out.println("Digite o nome do contato que você quer remover: ");
				nome = scan.nextLine();
				for(int i=0; i<contatos.size(); i++) {
					if(contatos.get(i).comparaNome(nome)) {
						contatos.remove(i);
						System.out.println("Contato Removido.\n");
					}
				}
			}else if(resp == 4) {
				for(int i=0; i<contatos.size(); i++) {
					System.out.println(contatos.get(i).toString());
				}
			}else {
				System.out.println("Finalizando o programa...");
			}
			
		}while(resp > 0 && resp < 5);
		
	}

}
