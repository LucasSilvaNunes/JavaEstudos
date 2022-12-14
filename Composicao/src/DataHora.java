package model;

public class DataHora {
	private Data dt;
	private Hora hora;
	
	public DataHora() {
		
	}
	
	public DataHora(int d, int m, int a, int h, int min, int seg) {
		this.dt = new Data(d, m, a);
		this.hora = new Hora(h, min, seg);
	}
	
	public DataHora(int d, int m, int a) {
		dt = new Data(d, m, a);
		hora = new Hora(0,0,0);
	}
	
	public DataHora(Data d, Hora h) {
		this.dt = d;
		this.hora = h;
	}
	
	public String toString() {
		return "\nData:"+dt+"\nHora:"+hora;
	}
}
