
public class Jogador {
	String nome,posicao,nacionalidade;
	double altura,peso;
	
	public String getNome() {
		return nome;
	}
	public Jogador(){

	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicaoo() {
		return posicao;
	}
	public void setPosicaoo(String posicao) {
		this.posicao = posicao;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String toString() {
		return ( "\nNome: "+ nome+ "\nPosicao: "+ posicao+ "\nNacionalidade: "+nacionalidade+ "\nAltura: "+ altura + "\nPeso:" +peso );
	}
	public static double CalculaIMC(double altura, double peso) {
		return(peso/Math.pow(altura, 2));
	}

}
