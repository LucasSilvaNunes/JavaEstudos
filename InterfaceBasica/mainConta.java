package main;

import model.Poupanca;

public class mainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poupanca p1 = new Poupanca(0);
		p1.depositar(1000);
		System.out.println(p1);
		p1.sacar(500);
		System.out.println(p1);
		p1.depositar(200);
		System.out.println(p1);
	}

}
