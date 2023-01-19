package project;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	public Quadrado() {
		
	}
	
	public double calcularArea() {
		return (lado*lado);
	}
	
	public double calcularPerimetro() {
		return (4 * lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public String toString() {
		return ("\nLado: "+lado+"\nÁrea: "+String.format("%.2f",calcularArea())+"\nPerímetro: "+String.format("%.2f", calcularPerimetro()));
	}
}
