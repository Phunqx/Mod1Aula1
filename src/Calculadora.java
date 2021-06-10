import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("CALCULADORA");
		System.out.println("Digite o primeiro número:");
		valor1= leitor.nextInt();
		System.out.println("Digite o segundo número:");
		valor2 = leitor.nextInt();
		
		soma = valor1+valor2;
		subtracao = valor1-valor2;
		multiplicacao = valor1*valor2;
		divisao = valor1/valor2;
		
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A subtração entre os números é: " + subtracao);
		System.out.println("A multiplicação entre os números é: " + multiplicacao);
		System.out.println("A divisão entre os dois números é: " + divisao);
		
		leitor.close();
	}

}
