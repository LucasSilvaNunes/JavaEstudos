package modelo;

public class Produto {
	int codigo;
	String nome;
	double preco;
	int qtEst;
	
	public Produto(int codigo, String nome, double preco, int qtEst) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.qtEst = qtEst;
	}
	
	public Produto() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtEst() {
		return qtEst;
	}

	public void setQtEst(int qtEst) {
		this.qtEst = qtEst;
	}
	
	public String toString() {
		return "\nNome:"+nome+"\nCódigo: "+codigo+"\nPreço: "+preco+"\nEstoque: "+qtEst+"\n";
	}
	
}
