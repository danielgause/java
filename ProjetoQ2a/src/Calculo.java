import java.util.Scanner;

public class Calculo {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double l,area;
		System.out.println("Qual a medida do lado?");
		l=teclado.nextDouble();
		area=l*l;
		System.out.println("A área do quadrado é: "+area);
		

		
	}
	

}
