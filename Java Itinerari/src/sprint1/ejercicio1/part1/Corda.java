package sprint1.ejercicio1.part1;

public class Corda extends Instrument{
	
	static {
		tocar();
	}

	public Corda(String nombre, int precio) {
		super(nombre, precio);
		tocar();
	}

	public static void tocar() {
		System.out.println("Esta sonant un instrument de corda");
	}
}
