package TareaJava01;

import java.util.Scanner;

public class Ordenar3ValoresConIF {

	public static void main(String[] args) {
		int v1=0;
		int v2=0;
		int v3=0;
		int pos1;
		int pos2;
		int pos3;
		pos1=0;
		pos2=0;
		pos3=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor1");
		v1=sc.nextInt();
		System.out.println("Valor2");
		v2=sc.nextInt();
		System.out.println("Valor3");
		v3=sc.nextInt();
		if(v1<v2 & v1<v3) {
			pos1=v1;
			if(v2<v3) {
				pos2=v2;
				pos3=v3;
			}
			else {
				pos2=v3;
				pos3=v2;
			}
			
		}
		if(v2<v1 & v2<v3) {
			pos1=v2;
			if(v1<v3) {
				pos2=v1;
				pos3=v3;
			}
			else {
				pos2=v3;
				pos3=v1;
			}
			
		}
		if(v3<v1 & v3<v2) {
			pos1=v3;
			if(v1<v2) {
				pos2=v1;
				pos3=v2;
			}
			else {
				pos2=v2;
				pos3=v1;
			}
			
		}
		System.out.println("pos1: "+pos1+" pos2: "+pos2+" pos3: "+pos3);
		

	}

}
