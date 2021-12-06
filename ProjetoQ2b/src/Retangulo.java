import java.util.Scanner;

public class Retangulo {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double base,altura,area;
	System.out.println("digite a medida da base:");
	base=teclado.nextDouble();
	System.out.println("Digite a medida da autura:");
	altura=teclado.nextDouble();
	area=base*altura;
	System.out.println("A área do retângulo é: " +area);
	
	
}
}
