package model;

public class Mamifero extends Animal {
	private String alimento;

	public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double vMedia,
			String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, vMedia);
		this.alimento = alimento;
	}
	
	public Mamifero(Animal a, String alimento) {
		super(a.getNome(), a.getComprimento(), a.getNumPatas(), a.getCor(), a.getAmbiente(), a.getvMedia());
		this.alimento = alimento;
	}
	
	public Mamifero() {
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void ExibirDadosMamifero() {
		super.ExibirDados();
		System.out.println("Alimento: "+alimento);
	}
}
