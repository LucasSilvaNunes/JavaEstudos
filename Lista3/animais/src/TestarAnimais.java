package main;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class TestarAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1, a2;
		Peixe p1;
		Mamifero m1;
		
		a1 = new Animal("Pirarucu", 3.50, 0, "Verde", "Lagoa", 15);
		a2 = new Animal("Cachorro", 1.25, 4, "Caramelo", "Terrestre", 30);
		
		p1 = new Peixe(a1, "Barbatana");
		m1 = new Mamifero(a2, "Carne Crua");
		
		p1.ExibirDadosPeixe();
		m1.ExibirDadosMamifero();
	}

}
