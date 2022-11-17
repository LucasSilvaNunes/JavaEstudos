package modelo;

public class Conta {
	int num;
	String dono;
	int tipo;
	double saldo;
	double limite;
	
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

	public double Saque(double valor) {
		saldo = saldo - valor;
		return saldo;
	}
	
	public double Depositar(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public void MostrarSaldo(double saldo) {
		System.out.println("Seu saldo é: "+saldo);
	}
	
	public void Transfere(Conta c2, double valor) {
		if(valor > getLimite() || valor > c2.getLimite()) {
			System.out.println("TRANSFERÊNCIA INVÁLIDA");
		}else {
			setSaldo(getSaldo()-valor);
			c2.setSaldo(c2.getSaldo()+valor);
		}
	}
}
