import java.util.Scanner;

public class ConsumoCarro {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double km,litros,media;
	System.out.println("digite a kilometragem percorrida");
	km=teclado.nextDouble();
	System.out.println("quantos litros");
	litros=teclado.nextDouble();
	media=km/litros;
	System.out.println("a média de consumo é: " +media);
	

}
}
