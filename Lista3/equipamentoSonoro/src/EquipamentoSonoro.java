package equipamentosom;

public class EquipamentoSonoro extends Equipamento {
	private short volume;
	private boolean stereo;
	
	public EquipamentoSonoro(String nome, short volume, boolean stereo) {
		super(nome);
		this.volume = volume;
		this.stereo = stereo;
	}
	
	public EquipamentoSonoro(Equipamento e1, short volume, boolean stereo) {
		super(e1.getNome());
		this.volume = volume;
		this.stereo = stereo;
	}
	
	public short getVolume() {
		return volume;
	}
	public void setVolume(short volume) {
		this.volume = volume;
	}
	public boolean isStereo() {
		return stereo;
	}
	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}
	
	public void ativarMono() {
		stereo = false;
	}
	
	public void ativarStereo() {
		stereo = true;
	}
	
	public void Liga() {
		super.Liga();
		volume = 5;
	}
	
}
