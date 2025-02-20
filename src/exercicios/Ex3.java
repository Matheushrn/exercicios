package exercicios;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite a primeira nota: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite a primeira nota: ");
		int n2 = sc.nextInt();
		
		System.out.print("Digite a primeira nota: ");
		int n3 = sc.nextInt();

		int notafinal = (n1 + n2 + n3) / 3;
		
		System.out.print("A média final do aluno é de: " + notafinal);
		sc.close();

	}

}
