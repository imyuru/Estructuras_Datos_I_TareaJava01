package TareaJava01;

import java.util.Scanner;

public class ProgSegun {

	public static void main(String[] args) {
		//Declarando la prov
		int prov=0;
		//Declarando el scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una provincia");
		prov=sc.nextInt();
		//Switch
		switch(prov) {
			case 1:
				System.out.println("La provincia es Bocas del toro");
				break;
			case 2:
				System.out.println("La provincia es Cocle");
				break;
			case 3:
				System.out.println("La provincia es Colón");
				break;
			case 4:
				System.out.println("La provincia es Chiriqui");
				break;
			case 5:
				System.out.println("La provincia es Darien");
				break;
			case 6:
				System.out.println("La provincia es Herrera");
				break;
			case 7:
				System.out.println("La provincia es Los Santos");
				break;
			case 8:
				System.out.println("La provincia es Panamá");
				break;
			case 9:
				System.out.println("La provincia es Veragua");
				break;
			case 10:
				System.out.println("Comarca Guna Yala");
				break;
			case 11:
				System.out.println("Otra Comarca");
				break;
			default:
				System.out.println("No es una provincia valida");
				break;
		}

	}

}
