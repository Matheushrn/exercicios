package exercicios;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em celsius: ");
		double celsius = sc.nextDouble();
		
		double fah = (celsius * 9/5) + 32;
		
		double kelvin = celsius + 273.15;
		
		System.out.print("Os graus celcius convertido em Fahrenheit fica " + fah + " e em kelvin fica " + kelvin);
		
		
		sc.close();
	}

}
