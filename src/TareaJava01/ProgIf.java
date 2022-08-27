package TareaJava01;
import java.util.Scanner;
public class ProgIf {

	public static void main(String[] args) {
		//declarando variables
		String mensaje;
		int val=0;
		//declarando scanner
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduzca un valor");
		val=sc.nextInt();
		//Proceso
		if(val==0) {
			mensaje="El valor es cero";
		}
		
		else {
			if (val<0) {
				mensaje="El valor es negativo";
				
			}
			else {
				mensaje="El valor es positivo";
			}
			
		}
		System.out.println(mensaje);
		

	}

}
