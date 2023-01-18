package imoveis;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i=0;
    int num;
    int resp;
    System.out.println("Quantos imóveis deseja cadastrar? ");
    num = keyboard.nextInt();
    Imovel[] imoveis = new Imovel[num];
    while (i < num){
		System.out.println("1- Cadastrar um imovel novo\n2- Cadastrar um imovel usado");
		resp = keyboard.nextInt();
		keyboard.nextLine();
		if(resp ==1) {
			Imovel im = new Imovel();
			System.out.println("Local: ");
			im.setLocalizacao(keyboard.nextLine());
			System.out.println("Valor: ");
			im.setPreco(keyboard.nextDouble());
			System.out.println("Quantidade de quartos: ");
			im.setQtdquartos(keyboard.nextInt());
			keyboard.nextLine();
			System.out.println("Proprietário: ");
			im.setProp(keyboard.nextLine());
			System.out.println("Taxa adicional: ");
			double taxa = keyboard.nextDouble();
			System.out.println("Estado: ");
			String estado = keyboard.next();
			imoveis[i] = new ImovelNovo(im,taxa,estado);
			i++;
		}
		else if(resp == 2) {
			Imovel im = new Imovel();
			System.out.println("Local: ");
			im.setLocalizacao(keyboard.nextLine());
			System.out.println("Valor: ");
			im.setPreco(keyboard.nextDouble());
			System.out.println("Quantidade de quartos: ");
			im.setQtdquartos(keyboard.nextInt());
			System.out.println("Proprietário: ");
			im.setProp(keyboard.nextLine());	
			System.out.println("Taxa de desconto: ");
			double taxa = keyboard.nextDouble();
			System.out.println("Ano: ");
			int ano = keyboard.nextInt();
			keyboard.nextLine();
			imoveis[i] = new ImovelUsado(im,taxa,ano);
		}
    }
	System.out.println("cadastro de imoveis finalizado.");
	for(int j=0;j<num;j++) {
		System.out.println(imoveis[j]);
	}
  }
}
