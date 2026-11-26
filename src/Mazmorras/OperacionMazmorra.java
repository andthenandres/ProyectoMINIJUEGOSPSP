package Mazmorras;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Mazmorras.Personaje;


public class OperacionMazmorra {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String nombre = "";
		String tipo;
		Personaje p1 = new Personaje();
		p1.setTipo("mago");
		Personaje p2 = new Personaje();
		p2.setTipo("guerrero");
		
		
		Personaje  personajes [] = {p1,p2};
		short tiempoP1;
		short tiempoP2;
			
			
		//validacion nombres	
		for(int i = 0; i < personajes.length; i++) {
			
			while(nombre.trim() == "") {
				
				System.out.println("Introduce un nombre para el personaje " + i + ":");
				nombre = sc.nextLine();

				if (nombre.trim() == "") {
					System.out.println("Introduce algo en el nombre");
				}
			
			}
			//Le seteo el nombre y vacio la variable para volver a hacer la comprobacion
			personajes[i].setNombre(nombre);
			nombre = "";
		}
		
		System.out.println("COMIENZA LA COMPETICION!");
		
		
		//Creo bucle para las salas
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("SALA 1");
			
			Thread h1 = new Thread(p1, p1.getNombre());
			Thread h2 = new Thread(p2, p2.getNombre());
			
			if(i % 2 != 0) {
				//genero tiempo rapido para el guerrero
				tiempoP2 = (short) (Math.random() * (1000 - 500 + 1) + 500);
				//y genero el tiempo lento para el mago
				tiempoP1 = (short) (Math.random() * (1700 - 1200 + 1) + 1200);
			}
			else {
				//genero tiempo lento para guerrero
				tiempoP2 = (short) (Math.random() * (1700 - 1200 + 1) + 1200);
				//genero tiempo rapdio para mago
				tiempoP1 = (short) (Math.random() * (1000 - 500 + 1) + 500);
			}
			
			
			
			h1.start();
			(tiempoP1, TimeUnit.MILLISECONDS);
			//Muestro nombre y estado
			System.out.println(p1.getNombre() + ": " + h1.getState());
			//imprimo cuando empiece y muestro su tipo de personaje
			if(h1.isAlive()){
				System.out.println(p1.getNombre() +  " comienza la sala " + i + ":" +
						"Hilo de " + p1.getNombre()  + " :" + p1.getTipo());
			}
			
			
			
			
		}
		
		
			
			
			
			
		
		
		

	}

	
	
	
}
