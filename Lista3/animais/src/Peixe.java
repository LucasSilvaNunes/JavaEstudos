package model;

public class Peixe extends Animal {
	private String caract;

	public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double vMedia,
			String caract) {
		super(nome, comprimento, numPatas, cor, ambiente, vMedia);
		this.caract = caract;
	}

	public Peixe(Animal p, String caract) {
		super(p.getNome(), p.getComprimento(), p.getNumPatas(), p.getCor(), p.getAmbiente(), p.getvMedia());
		this.caract = caract;
	}
	
	public Peixe() {
		
	}
	
	public String getCaract() {
		return caract;
	}

	public void setCaract(String caract) {
		this.caract = caract;
	}
	
	public void ExibirDadosPeixe() {
		super.ExibirDados();
		System.out.println("Caracteristica: "+caract);
	}
}
