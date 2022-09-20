package sprint1.ejercicio1.part2;

public class Cotxe {
	
	private static final String marca = "Opel";
	private static String model;
	private final double potencia;
	
	public Cotxe(double potencia) {
		this.potencia = potencia;
	}

	public static String getModel() {
		return model;
	}
	
	public static void setModel(String model) {
		Cotxe.model = model;
	}
	
	public static String getMarca() {
		return marca;
	}
	
	public double getPotencia() {
		return potencia;
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	public static void frenar() {
	System.out.println("El vehicle està frenant");	
	}
}
