package principal;

import java.util.Scanner;

import modelo.Conta;

public class mainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Conta conta1, conta2;
		conta1 = new Conta(123, "Carlos Augusto", 1, 8000.0, 200);
		conta2 = new Conta(321, "Miguel Soares", 1, 2000.0, 450);
		
		conta1.Depositar(1000);
		
		System.out.println("Conta depois do depósito: "+conta1.getSaldo());

		conta1.Saque(3000);
		
		System.out.println("Conta depois do saque: "+conta1.getSaldo());
		
		conta1.Transfere(conta2, 200);
		
		System.out.println("Conta1 depois da transferencia: "+conta1.getSaldo());
		System.out.println("Conta2 depois da transferencia: "+conta2.getSaldo());
		
	}

}

/*Considere um novo projeto para a implementação de parte de um sistema
bancário. Seu programa deve definir uma classe Conta com os seguintes
atributos: número da conta, nome do proprietário, tipo de conta (1- conta corrente
e 2- poupança), saldo e limite. Defina os métodos get e set, conforme seja
necessário e conveniente.
Uma conta poderá ter os seguintes métodos: sacar, depositar, consultar o saldo e
transferir um valor entre duas contas. Faça as devidas verificações relacionadas
ao saldo, de acordo com o tipo de conta!
Crie a classe principal do programa para instanciar duas classes do tipo Conta e
faça operações de depósito, saque, transferências. Ao final, exiba o saldo de cada
conta.*/
