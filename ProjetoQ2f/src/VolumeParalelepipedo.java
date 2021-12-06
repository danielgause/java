import java.util.Scanner;

public class VolumeParalelepipedo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double largura, altura, profundidade, volume;
		System.out.println("Digite a largura: ");
		largura = teclado.nextDouble();
		System.out.println("Digite a altura: ");
		altura = teclado.nextDouble();
		System.out.println("Digite a profundidade: ");
		profundidade = teclado.nextDouble();
		volume = largura * altura * profundidade;
		System.out.println("O volume do paralelepípedo é: " + volume);
	}

}
