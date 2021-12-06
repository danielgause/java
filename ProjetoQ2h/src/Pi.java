import java.util.Scanner;

public class Pi {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double raio, altura, volume;
		System.out.println("Informe a medida do raio: ");
		raio = teclado.nextDouble();
		System.out.println("Informe a altura do cilindro: ");
		altura = teclado.nextDouble();
		volume = 3.14 * raio * raio * altura;
		System.out.println("O volume 	do cilindro é: " + volume);

	}
}
