package Patata;

import java.util.Scanner;
import java.util.Random;

public class Matriu1 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Random rand = new Random();
		
			int [][] matriu = new int [5][5];
		
			int aleatorio = 100;
		
		System.out.println("Que numero quieres que encuentre?: ");
			int patata = scan.nextInt();
		
			for (int i = 0; i < matriu.length; i++) {
				for(int j = 0; j < matriu[0].length; j++) {
					matriu[i][j]=rand.nextInt(aleatorio) + 1;
			}
		}
		for (int i = 0; i < matriu.length; i++) {
			for(int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
