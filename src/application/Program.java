package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo rect = new Retangulo();
		System.out.println("Digite largura e altura do retangulo:");
		rect.largura = sc.nextDouble();
		rect.altura = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();


	}

}
