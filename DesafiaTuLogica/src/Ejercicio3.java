public class Ejercicio3 {

	public static void main(String[] args) {
		
		int cuenta = 0;
		int multiplo2 = 0;
		int multiplo3 = 0;
		
		
		System.out.print("Resultado de los múltiplos de 2 o de 3 entre 1-100:");
		System.out.println();
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				multiplo2 = i;
				System.out.print(multiplo2 + " ");
				cuenta++;
			} else if (i % 3 == 0) {
				multiplo3 = i;
				System.out.print(multiplo3 + " ");
				cuenta++;
			}

		}
		
		System.out.println();
		System.out.print("Hay un total de " + cuenta + " múltiplos de 2 o de 3 entre 1-100.");
	
	}

}
