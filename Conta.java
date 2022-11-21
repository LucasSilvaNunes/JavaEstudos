package modelo;

public class Conta {
	private int num;
	private String dono;
	private int tipo;
	private double saldo;
	private double limite;
	
	public Conta(int num, String dono, int tipo, double saldo, double limite){
		this.num = num;
		this.dono = dono;
		this.tipo = tipo;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public Conta(){
		
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void Saque(double valor) {
		if(getSaldo() < valor) {
			System.out.println("SAQUE INVÁLIDO.");
		}else {
			setSaldo(getSaldo() - valor);
		}
	}
	
	public void Depositar(double valor) {
		setSaldo(getSaldo() + valor);
	}
	
	public void MostrarSaldo() {
		System.out.println("Seu saldo é: "+saldo);
	}
	
	public void Transfere(Conta contaDestino, double valor) {
		if(valor > getLimite()) {
			System.out.println("TRANSFERÊNCIA INVÁLIDA");
		}else {
			setSaldo(getSaldo() - valor);
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		}
	}
}
