package model;

public class Animal {
	private String nome;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double vMedia;
	
	public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double vMedia) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.vMedia = vMedia;
	}
	
	public Animal() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getvMedia() {
		return vMedia;
	}

	public void setvMedia(double vMedia) {
		this.vMedia = vMedia;
	}
	
	public void ExibirDados() {
		System.out.println("\nNome: "+nome+"\nComprimento: "+comprimento+"\nNúmero de Patas: "+numPatas+"\nCor: "+cor+"\nAmbiente: "+ambiente+"\nVelocidade média: "+vMedia);
	}
}
