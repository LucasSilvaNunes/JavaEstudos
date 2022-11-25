package modelo;

public class Paciente {
	private int codigo;
	private String nome, CPF, telefone;
	
	public Paciente(int codigo, String nome, String CPF, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.CPF = CPF;
		this.telefone = telefone;
	}
	
	public Paciente() {
		
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean isEqual(int code) {
		if(getCodigo() == code) {
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "\nCódigo:"+codigo+"\nNome: "+nome+"\nCPF: "+CPF+"\nTelefone: "+telefone;
	}
}
