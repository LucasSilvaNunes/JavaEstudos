package project;

public class Retangulo implements Forma{
	private double lado;
	private double altura;
	
	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}

	public Retangulo() {
		
	}
	
	public double calcularArea() {
		return (lado*altura);
	}
	
	public double calcularPerimetro() {
		return ((lado*2) + (altura*2));
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return ("\nLado: "+lado+"\nAltura: "+altura+"\nÁrea: "+String.format("%.2f",calcularArea())+"\nPerímetro: "+String.format("%.2f", calcularPerimetro()));
	}
}
