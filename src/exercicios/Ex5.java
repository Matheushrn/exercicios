package exercicios;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double raio = sc.nextDouble();
		
		double Area = Math.PI * raio * 2;
		double perimetro = 2 + Math.PI * raio;
		
		System.out.printf("A área é de %.2f" , Area);
		System.out.printf(" E o perímetro é de %.2f" , perimetro);
		
		
		sc.close();
	}
}
