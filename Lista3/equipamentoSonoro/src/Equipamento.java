package equipamentosom;

public class Equipamento {
	private boolean ligado = false;
	private String nome;
	
	public Equipamento(String nome) {
		this.nome = nome;
	}
	
	public Equipamento() {
		
	}
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void Liga() {
		ligado = true;
	}
	
	public void Desliga() {
		ligado = false;
	}
}
