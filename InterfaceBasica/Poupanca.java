package model;

public class Poupanca implements Conta {
	private double saldo;
	
	public Poupanca(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo = saldo + valor;
	}

	@Override
	public void sacar(double sacar) {
		// TODO Auto-generated method stub
		if(saldo >= sacar){
			saldo = saldo - sacar;
		}
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	
	public String toString() {
		return("\nSaldo: "+saldo);
	}

}
