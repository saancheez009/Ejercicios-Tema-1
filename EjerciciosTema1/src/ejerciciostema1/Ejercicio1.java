package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primero, introducimos las variables que vamos a utilizar, en este caso NumeroD que el numero decimal y el numeroE que es el numero entero
		double numeroD; //número decimal
		double numeroE;// número entero
		//ahora importamos el scanner
		Scanner sc = new Scanner(System.in);
		//le pedimos al usuario que introeduzca un númerocon decimales
        System.out.println("Por favor introduzca un número con decimales: ");
        numeroD = sc.nextDouble(); // Número con decimal que escribe el usuario
        numeroE = numeroD + 0.5; //realizamos la operación sumandole 0,5 al número decimal para truncarlo
        System.out.println("Su número redondeado al entero más proximo es: " + (int)  numeroE);
        // Le mostramos al usuario el número truncado
	}

}
