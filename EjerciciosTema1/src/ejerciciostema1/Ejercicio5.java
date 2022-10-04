package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //introducimos las variables que vamos a pedir al usuario que les de un valor para realizar la operación
		int a;
		int b;
		int c;
		int x;
		int y;
		//importamos el scanner 
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca un número para darle valor a "a"
		System.out.println("Por favor introduzca un número para darle valor a (a): ");
		
		a = sc.nextInt();
		//Le pedimos al usuario que introduzca un número para darle valor a "b"
		System.out.println("Por favor introduzca un número para darle valor a (b): ");
		
		b = sc.nextInt();
		//Le pedimos al usuario que introduzca un número para darle valor a "c"
		System.out.println("Por favor introduzca un número para darle valor a (c): ");
		
		c = sc.nextInt();
		//Le pedimos al usuario que introduzca un número para darle valor a "x"
		System.out.println("Por favor introduzca un número para darle valor a (x): ");
		x = sc.nextInt();
		//Calculamos y con los valores que nos ha dado el usuario para cada incógnita
		y = (a*x*x)+(x*b)+c;
		// Le mostramos al usuario el valor de y
		System.out.println("El valor de y es "+y);
	}

}
