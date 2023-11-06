import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		String orden;
		
		System.out.println("Introduce 3 números enteros.");
		System.out.println();
		
		System.out.println("Primer número: ");
		num1 = sc.nextInt();
		
		System.out.println("Segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("Tercer número: ");
		num3 = sc.nextInt();
		
		System.out.println("Escribe 'desc' para ordenarlos de mayor a menor o 'asc' para ordenarlos de menor a mayor.");
		orden = sc.next();
		
		switch (orden) {
			case "desc": {
				
				if (num1 > num2 && num1 > num3) {
					if (num2 > num3) {
						System.out.print("Resultado: " + num1 + " " + num2 + " " + num3);
					} else {
						System.out.print("Resultado: " + num1 + " " + num3 + " " + num2);
					}
				} else if (num2 > num1 && num2 > num3) {
					if (num1 > num3) {
						System.out.print("Resultado: " + num2 + " " + num1 + " " + num3);
					} else {
						System.out.print("Resultado: " + num2 + " " + num3 + " " + num1);
					}
				} else {
					if (num1 > num2) {
						System.out.print("Resultado: " + num3 + " " + num1 + " " + num2);
					} else {
						System.out.print("Resultado: " + num3 + " " + num2 + " " + num1);
					}
				} 
				
				break;
			
			}
			
			case "asc": {
				
				if (num1 < num2 && num1 < num3) {
					if (num2 < num3) {
						System.out.print("Resultado: " + num1 + " " + num2 + " " + num3);
					} else {
						System.out.print("Resultado: " + num1 + " " + num3 + " " + num2);
					}
				} else if (num2 < num1 && num2 < num3) {
					if (num1 < num3) {
						System.out.print("Resultado: " + num2 + " " + num1 + " " + num3);
					} else {
						System.out.print("Resultado: " + num2 + " " + num3 + " " + num1);
					}
				} else {
					if (num1 < num2) {
						System.out.print("Resultado: " + num3 + " " + num1 + " " + num2);
					} else {
						System.out.print("Resultado: " + num3 + " " + num2 + " " + num1);
					}
				} 
				
				break;
			
			}
		}
		
		sc.close();
		
	}
}
