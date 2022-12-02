package model;

public class Aluno {
	private long matricula;
	private String nome;
	private double nota1, nota2, media;
	
	public Aluno(long matricula, String nome, double nota1, double nota2) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = this.calcMedia();
	}
	
	public Aluno() {
		
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia() {
		this.media = calcMedia();
	}
	
	public double calcMedia() {
		return ((nota1+nota2)/2);
	}
	
	public boolean comparaNome(String nome) {
		if(this.nome.equalsIgnoreCase(nome)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "\nNome: "+nome+"\nMatricula: "+matricula+"\nNota 1: "+nota1+"\nNota 2: "+nota2+"\nMédia: "+calcMedia();
	}
}
