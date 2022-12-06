package principal;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Empresa;

public class DemoEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp = 0, aux = 0;
		Scanner scan = new Scanner(System.in);
		ArrayList <Empresa> empresas = new ArrayList<Empresa>();
		Empresa emp;
		
		do {
			emp = new Empresa();
			
			System.out.println("Digite o nome da Empresa: ");
			emp.setNome(scan.nextLine());
			
			System.out.println("Digite o cnpj da Empresa: ");
			emp.setCnpj(scan.nextLine());
			
			System.out.println("Digite o endereço da Empresa: ");
			emp.setEndereco(scan.nextLine());
			
			System.out.println("Digite a cidade da Empresa: ");
			emp.setCidade(scan.nextLine());;
			
			System.out.println("Digite o Estado da Empresa: ");
			emp.setEstado(scan.nextLine());
			
			System.out.println("Digite o telefone da Empresa: ");
			emp.setTelefone(scan.nextLine());
			
			System.out.println("Digite a quantidade de funcionários da Empresa: ");
			emp.setQtdFunc(scan.nextInt());
			scan.nextLine();
			
			empresas.add(emp);
			
			System.out.println("Deseja continuar cadastrando?\n1- Sim;\n2- Não;");
			resp = scan.nextInt();
			scan.nextLine();
		}while(resp == 1 && empresas.size() < 50);
		
		for(int i=0; i<empresas.size(); i++) {
			System.out.println(empresas.get(i).toString());
		}
		
		//Descobrindo o maior valor para quantidade de funcionários.
		for(int i=0; i<empresas.size(); i++) {
			if(empresas.get(i).getQtdFunc() > aux) {
				aux = empresas.get(i).getQtdFunc();
			}
		}
		
		//Percorrendo a lista de novo para saber se possuem mais de uma empresa com a mesma quantidade de funcionários.
		for(int i=0; i<empresas.size(); i++) {
			if(empresas.get(i).getQtdFunc() == aux) {
				System.out.println("\nEmpresa(s) com mais funcionários: \n");
				System.out.println(empresas.get(i).toString());
			}
		}
		
	}

}


/*Considere um sistema para gerenciamento de empresas de uma região. 
Toda empresa tem nome, CNPJ, endereço, cidade, estado, telefone e a 
quantidade de funcionários. Para uma dada empresa, deve ser possível 
inserir e obter seus dados. Você deve projetar e implementar uma 
classe Empresa, definindo os atributos e os métodos que atendam às 
solicitações acima, e outra classe DemoEmpresa definindo um array de 
empresas com o limite de 50 posições para cadastramento de 
empresas. Nesse contexto, você deve:

a) Criar seu projeto utilizando a estrutura de pacotes para organizar 
as classes modelo e classes de execução (principal);
b) Definir a classe Empresa e seus atributos com modificadores de 
acesso;
c) Gerar os métodos necessários de acesso aos atributos;
d) Criar um método de exibição/impressão para os dados da classe;
e) Implementar um método que recebe uma string e compara com o 
nome da empresa, retornando o resultado da comparação;
f) Definir um método que recebe um valor inteiro e retorna como 
resultado o maior valor ao compará-lo com a quantidade de 
funcionários;
g) Definir a classe DemoEmpresa e um array de empresas com o 
limite de 50 posições;
h) Permitir que o usuário efetue o cadastro das empresas enquanto 
ele desejar ou até que atinja o limite de empresas;
i) Ao final, as seguintes impressões devem ser feitas:
i. Os dados de cada empresa;
ii. O(s) nome(s) da(s) empresa(s) que possui(em) o maior 
número de funcionários vinculados.*/
