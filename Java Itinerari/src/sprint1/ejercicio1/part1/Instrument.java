package sprint1.ejercicio1.part1;

public abstract class Instrument {
	
	private String nombre;
	private int precio;	
	
	
	
	public Instrument(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public static void tocar() {
		
	}
	
}
