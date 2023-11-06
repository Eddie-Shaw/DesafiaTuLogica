import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Introduce un número entero positivo (mayor o igual a 0):");
			
			numero = sc.nextInt();
			
		} while (numero < 0);
				
		System.out.print("Resultado: ");
		
		for (int i = 0; i < 20; i++) {
			numero++;
			System.out.print(numero + " ");
		}
		
		sc.close();
		
	}

}
