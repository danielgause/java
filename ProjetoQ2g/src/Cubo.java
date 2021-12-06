import java.util.Scanner;

public class Cubo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double lado, volume;
		System.out.println("Digite a medida do lado do cubo: ");
		lado = teclado.nextDouble();
		volume = lado * lado * lado;
		System.out.println("O volume do cubo é: " + volume);

	}
}
