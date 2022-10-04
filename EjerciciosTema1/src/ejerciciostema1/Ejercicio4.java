package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Introducimos las variables base, altura y área
		double base; 
		double altura;
		double área;
		//importamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario la base del triángulo
		System.out.println("Por favor introduzca la base de un triángulo: ");
		base = sc.nextDouble();		
		// Le pedimos al usuario que introduzca la altura del triángulo
		System.out.println("Por favor introduzca la altura de un triángulo: ");
		altura = sc.nextDouble();
		// Calculamos el área del triángulo cuya forma es base por altura entre dos
		área = ( base*altura)/2;
		// Le mostramos al usuario el área del triángulo
		System.out.println("El área del triángulo es: " +área);
		// cerramos el scanner
		sc.close();
	}

}
