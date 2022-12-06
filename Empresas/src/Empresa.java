package modelo;

public class Empresa {
	private String nome, cnpj, endereco, cidade, estado, telefone;
	private int qtdFunc;
	
	public Empresa(String nome, String cnpj, String endereco, String cidade, String estado, String telefone, int qtdFunc) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.qtdFunc = qtdFunc;
	}
	
	public Empresa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQtdFunc() {
		return qtdFunc;
	}

	public void setQtdFunc(int qtdFunc) {
		this.qtdFunc = qtdFunc;
	}
	
	public String toString() {
		return "\nNome: "+nome+"\nCNPJ: "+cnpj+"\nEndereço: "+endereco+"\nCidade: "+cidade+"\nEstado: 				"+estado+"\nTelefone: "+telefone+"\nQuantidade de funcionários: "+qtdFunc;
	}
	
	public boolean comparaNome(String nome) {
		return (this.nome.equals(nome));
	}
	
	public int comparaValor(int valor) {
		if(qtdFunc > valor) {
			return qtdFunc;
		}else {
			return valor;
		}
	}
	
	
}
