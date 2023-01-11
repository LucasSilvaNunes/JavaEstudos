package main;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, media;
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1:", "Info", 3));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2:", "Info", 3));
		media = (n1+n2)/2;
		JOptionPane.showMessageDialog(null, "Sua média final é: "+media);
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado com média "+media);
		}else{
			JOptionPane.showMessageDialog(null, "Reprovado com média "+media);
		}
	}

}

/*Faça um programa para ler duas notas, calcular e exibir a média desses valores. Utilize caixas de diálogo para obter os valores e para exibir o valor da média, bem como o resultado do aluno.
  Considere que o aluno está aprovado se a média for maior ou igual a 7,0. Caso contrário, ele está reprovado.*/
