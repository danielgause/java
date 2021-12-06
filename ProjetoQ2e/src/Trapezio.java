import java.util.Scanner;

public class Trapezio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double base1, base2, altura, area;
		System.out.println("Digite a medida da base maior: ");
		base1 = teclado.nextDouble();
		System.out.println("Digite a medida da base menor: ");
		base2 = teclado.nextDouble();
		System.out.println("Digite a medida da altura: ");
		altura = teclado.nextDouble();
		area = (base1 + base2) * altura / 2;
		System.out.println("A área do trapézio é: " + area);

	}

}
