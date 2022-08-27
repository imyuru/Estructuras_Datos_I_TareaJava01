package TareaJava01;

import java.util.Scanner;

public class NombreProvincia {

	public static void main(String[] args) {
		int provincia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el codigo de la provincia");
		provincia=sc.nextInt();
		//If anidados
		if(provincia==01) {
			System.out.println("Bocas del toro");
		}
		else {
			if(provincia==02) {
				System.out.println("Cocle");
			}
			else{
				if(provincia==03) {
					System.out.println("Colón");	
				}
				else{
					if(provincia==04) {
						System.out.println("Chiriqui");
						
					}
					else {
						if(provincia==05) {
							System.out.println("Darien");
						}
						else {
							if(provincia==06){
								System.out.println("Herrera");
								
							}
							else {
								System.out.print("Otra provincia");
							}
							
						}
						}
					
				}
			}
		}

	}

}
