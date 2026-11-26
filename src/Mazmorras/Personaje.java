package Mazmorras;

public class Personaje implements Runnable{

	//Atributos
	private String nombre;
	private String tipo;
	
	//Constructor
	public Personaje(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public Personaje() {
		
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
