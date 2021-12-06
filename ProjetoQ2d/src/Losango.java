import java.util.Scanner;

public class Losango {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double diag1, diag2, area;
		System.out.println("Digite a medida da primeira diagonal:");
		diag1 = teclado.nextDouble();
		System.out.println("Digite a medida da segunda diagonal:");
		diag2 = teclado.nextDouble();
		area = diag1 * diag2;
		System.out.println("A área do losango é: " + area);

	}

}
