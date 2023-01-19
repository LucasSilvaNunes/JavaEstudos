package project;

public class Circulo {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public Circulo() {
		
	}
	
	public double calcularArea() {
		return (3.14 * raio * raio);
	}
	
	public double calcularPerimetro() {
		return (2 * 3.14 * raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public String toString() {
		return ("\nRaio: "+raio+"\nÁrea: "+String.format("%.2f",calcularArea())+"\nPerímetro: "+String.format("%.2f", calcularPerimetro()));
	}
}
