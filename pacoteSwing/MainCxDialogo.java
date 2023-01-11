package main;

import javax.swing.JOptionPane;

public class MainCxDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String resp;
		resp = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Info", 3);
		JOptionPane.showMessageDialog(null, "Olá, "+resp, "Boas vindas", 1);*/
		
		String[] alt = {"Atrasado", "Em dia", "Adiantado"};
		 int resp;
		 resp = JOptionPane.showOptionDialog(null, "Como você se considera nas atividades de LP2?", "LP2", JOptionPane.DEFAULT_OPTION, 3, null,alt,"1");
		 if(resp == 0) {
			 JOptionPane.showMessageDialog(null, "Não desanime! Vamos voltar a fazer os atividades?");
		 }else if(resp == 1) {
			 JOptionPane.showMessageDialog(null, "Muito bom! continue se dedicando.");
		 }else if(resp == 2) {
			 JOptionPane.showMessageDialog(null, "Excelente! Parabéns");
		 }else {
			 JOptionPane.showMessageDialog(null, "Você não respondeu :(");
		 }
	}

}
