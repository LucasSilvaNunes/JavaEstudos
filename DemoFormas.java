package project;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoFormas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList <Circulo> circ = new ArrayList <Circulo>();
		ArrayList <Quadrado> quad = new ArrayList <Quadrado>();
		ArrayList <Retangulo> retan = new ArrayList <Retangulo>();
		int resp=0;
		while(resp != 4) {
			System.out.println("1- Cadastrar Circulo;\n2- Cadastrar Retangulo;\n3- Cadastrar Quadrado;\n4- Exibir dados e sair; ");
			resp = scan.nextInt();
			if(resp == 1) {
				Circulo c = new Circulo();
				System.out.println("Digite o raio do círculo: ");
				c.setRaio(scan.nextDouble());
				circ.add(c);
			}else if(resp == 2) {
				Retangulo r = new Retangulo();
				System.out.println("Digite o lado do retângulo: ");
				r.setLado(scan.nextDouble());
				System.out.println("Digite a altura do retângulo: ");
				r.setAltura(scan.nextDouble());
				retan.add(r);
			}else if(resp == 3) {
				Quadrado q = new Quadrado();
				System.out.println("Digite o lado do quadrado: ");
				q.setLado(scan.nextDouble());
				quad.add(q);
			}else {
				System.out.println("\nCírculos: \n");
				for(int i=0; i<circ.size(); i++) {
					System.out.println(circ.get(i));
				}
				
				System.out.println("\nRetangulos: \n");
				for(int i=0; i<retan.size(); i++) {
					System.out.println(retan.get(i));
				}
				
				System.out.println("\nQuadrados: \n");
				for(int i=0; i<quad.size(); i++) {
					System.out.println(quad.get(i));
				}
				
				System.out.println("\nEncerrando...");
				resp = 4;
			}
		}
	}

}
