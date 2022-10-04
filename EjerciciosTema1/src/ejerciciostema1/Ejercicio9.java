package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Introducimos las variales num1 y num2 y con boolean la igualdad
		int num1;
		int num2;
		boolean igualdad;
		// importamos el scanner
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca dos números 
		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num2 = sc.nextInt();
		// con el boolean declaramos que si num1 es igual a num2 dos es true y si no es igual es false
		igualdad= num1==num2 ? true:false;
		// Le mostramos al usuario el resultado
		System.out.println(igualdad);
	}

}
