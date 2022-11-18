import java.util.ArrayList;
import java.util.Scanner;
public class JogadorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogador[] ArrrayList=new Jogador[40];
		System.out.println("Insira o peso do respectivo jogador");
		Scanner a=new Scanner(System.in);
		double peso=a.nextDouble();
		
		
		System.out.println("Insira a altura do respectivo jogador");
		Scanner b=new Scanner(System.in);
		double altura=b.nextDouble();
		
		
		System.out.println("Insira o nome do jogador");
		Scanner name= new Scanner(System.in);
		String nome= name.nextLine();
		
		
		System.out.println("Insira a posicao do jogador");
		Scanner position=new Scanner(System.in);
		String posicao=position.nextLine();
		
		
		System.out.println("Insira a nacionalidade do jogador");
		Scanner nacionalidad=new Scanner(System.in);
		String nacionalidade=nacionalidad.nextLine();
		
		
	  System.out.println( "\nDados do jogador:" + Jogador.toString() + "\nO IMC é: "+ Jogador.CalculaIMC(double altura,double peso));
		}
	

}
