package exercicios;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua capital inicial : ");
		double capital = sc.nextDouble();
		
		System.out.print("Digite a taxa de juros mensal: ");
		float taxa = sc.nextFloat();
		
		System.out.print("Digite o numero de meses : ");
		int meses = sc.nextInt();
		
		double juros = capital * taxa * meses;
		double montante = capital * Math.pow(1 + taxa,meses);
		
		System.out.printf("A taxa de juros é de R$ %.2f" , juros) ;
		System.out.printf(" E o montante total é de R$ %.2f" , montante);
		
		sc.close();
	}
}
