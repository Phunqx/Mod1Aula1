import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("CALCULADORA");
		System.out.println("Digite o primeiro n�mero:");
		valor1= leitor.nextInt();
		System.out.println("Digite o segundo n�mero:");
		valor2 = leitor.nextInt();
		
		soma = valor1+valor2;
		subtracao = valor1-valor2;
		multiplicacao = valor1*valor2;
		divisao = valor1/valor2;
		
		System.out.println("A soma dos valores �: " + soma);
		System.out.println("A subtra��o entre os n�meros �: " + subtracao);
		System.out.println("A multiplica��o entre os n�meros �: " + multiplicacao);
		System.out.println("A divis�o entre os dois n�meros �: " + divisao);
		
		leitor.close();
	}

}
