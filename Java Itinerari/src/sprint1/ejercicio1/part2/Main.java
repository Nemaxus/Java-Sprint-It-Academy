package sprint1.ejercicio1.part2;

public class Main {

	public static void main(String[] args) {
		
		Cotxe cotxe1 = new Cotxe(2.0);
		Cotxe cotxe2 = new Cotxe(2.5);

		
		cotxe1.accelerar();
		Cotxe.frenar();
		cotxe1.accelerar();
		cotxe2.accelerar();
		Cotxe.frenar();
		
		
	}


}
