package modelo;

public class Jogador {
	String nome,posicao,pais;
	double altura,peso;
	
	public Jogador(String nome, String posicao, String pais, double altura, double peso) {
		this.nome = nome;
		this.posicao = posicao;
		this.pais = pais;
		this.altura = altura;
		this.peso = peso;
	}
	
	public Jogador() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double IMC() {
		return(peso/(Math.pow(altura, 2)));
	}
	
	public void showData(){
		System.out.print("Nome: "+nome+"\nPosição: "+posicao+"\nNacionalidade: "+pais+"\nPeso: "+peso+"\nAltura: "+altura);
		System.out.println();
	}
}
