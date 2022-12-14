package main;

import model.Data;
import model.DataHora;
import model.Hora;

public class MainData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data dt1;
		Hora h1;
		DataHora dtH1, dtH2;
		
		dt1 = new Data(14, 12, 2022);
		h1 = new Hora(11, 24, 50);
		System.out.println("\nData: "+dt1);
		System.out.println("\nHora: "+h1);
		
		dtH1 = new DataHora(14,12,2022,11,26,15);
		System.out.println("Teste:"+dtH1);
		dtH2 = new DataHora(dt1,h1);
		System.out.println("Teste 2:"+dtH2);
	}

}
