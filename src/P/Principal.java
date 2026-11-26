package P;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		int opcion = 0;
		while(opcion!= 0) {
			System.out.println("PSP ARCADE"
					+ "1. MAZMORRAS "
					+ "2. CIRCUITO DE RELEVO "
					+ "0. SALIR");
			opcion = sc.nextInt();
			
			if(opcion > 2 || opcion < 0) {
				System.out.println("Introduce una de las opciones indicadas");
			}
			
			
			switch(opcion) {
				case 1:
					
					break;
					
				case 2:
					
					break;
						
			}
			
			
		}

	}
	
	

}
