package exercicios;
import java.util.Scanner;

public class Ex2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 
			System.out.print("Digite a sua capital inicial : ");
			float capital = sc.nextFloat();
			
			System.out.print("Digite a taxa de juros : ");
			float taxa = sc.nextFloat();
			
			System.out.print("Digite o numero de meses : ");
			int meses = sc.nextInt();
			
			double montante = capital * Math.pow(1 + taxa,meses);
			
			System.out.printf("O valor do montante total é de R$ %.2f" , montante);
			
			sc.close();
		}

	}
