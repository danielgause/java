import java.util.Scanner;

public class triangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double base, altura, area;
		System.out.println("Digite a medida da base:");
		base = teclado.nextDouble();
		System.out.println("Digite a medida da altura:");
		altura = teclado.nextDouble();
		area = base * altura / 2;
		System.out.println("A �rea do tri�ngulo �: " + area);

	}

}
