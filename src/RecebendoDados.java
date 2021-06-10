import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		System.out.println("Este programa lê dados");
		System.out.println("Por favor, digite seu nome:");
		nome = leitor.next();
		System.out.println("Olá " + nome + "!");
		leitor.close();
	}

}
