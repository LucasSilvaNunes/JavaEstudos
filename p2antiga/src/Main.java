package imoveis;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int resp=0, ano;
    double taxa;
    String estado;
    ArrayList <ImovelNovo> novos = new ArrayList<ImovelNovo>();
    ArrayList <ImovelUsado> usados = new ArrayList<ImovelUsado>();
    
    while (resp != 3){
		System.out.println("1- Cadastrar um imovel novo;\n2- Cadastrar um imovel usado;\n3- Exibir dados e sair;");
		resp = keyboard.nextInt();
		keyboard.nextLine();
		if(resp == 1) {
			Imovel im = new ImovelNovo();
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
			taxa = keyboard.nextDouble();
			System.out.println("Estado: ");
			estado = keyboard.next();
			ImovelNovo in = new ImovelNovo(im, taxa, estado);
			novos.add(in);
		}
		else if(resp == 2) {
			Imovel im = new ImovelUsado();
			System.out.println("Local: ");
			im.setLocalizacao(keyboard.nextLine());
			System.out.println("Valor: ");
			im.setPreco(keyboard.nextDouble());
			System.out.println("Quantidade de quartos: ");
			im.setQtdquartos(keyboard.nextInt());
			keyboard.nextLine();
			System.out.println("Proprietário: ");
			im.setProp(keyboard.nextLine());
			System.out.println("Taxa de desconto: ");
			taxa = keyboard.nextDouble();
			System.out.println("Ano: ");
			ano = keyboard.nextInt();
			keyboard.nextLine();
			ImovelUsado iu = new ImovelUsado(im,taxa,ano);
			usados.add(iu);
		}
    }
    System.out.println("\nImoveis Usados:\n");
    for(int i=0; i<usados.size(); i++) {
    	System.out.println(usados.get(i).toString());
    }
    
    System.out.println("\nImoveis Novos:\n");
    for(int i=0; i<novos.size(); i++) {
    	System.out.println(novos.get(i).toString());
    }
    
	keyboard.close();
  }
}
