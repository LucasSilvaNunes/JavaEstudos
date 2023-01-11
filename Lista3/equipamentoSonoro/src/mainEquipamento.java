package equipamentosom;

public class mainEquipamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipamento e1 = new Equipamento("Cebola");
		EquipamentoSonoro es1 = new EquipamentoSonoro(e1, (short)1, true);
		es1.Liga();
		System.out.println(es1.getVolume());
	}
	
}
