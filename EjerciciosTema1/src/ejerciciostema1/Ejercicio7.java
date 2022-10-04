package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducimos las variables, en este caso son las distancias que se piden al usuario
		int milímetros;
	    int centímetros;
	    int metros;
	    double suma;
	    //importamos el scanner
	    Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzcala distancia en milímetros
		System.out.println("Por favor introduzca una distancia en milímetros: ");
        milímetros = sc.nextInt();
        //Le pedimos al usuario que introduzcala distancia en centímetros
		System.out.println("Por favor introduzca una distancia en centímetros: ");
		centímetros = sc.nextInt();
		//Le pedimos al usuario que introduzcala distancia en metros
		System.out.println("Por favor introduzca una distancia en metros: ");
		metros = sc.nextInt();
		// Realizamos la operación para pasar a metros y sumamos las distancias para calcular la distancia total
		suma = (milímetros*0.1)+centímetros+(metros*100);
		// Le mostramos al usuario la suma de las 3 distancias pasadas a metros
		System.out.println("La suma de las 3 distancias es: "+suma+ " cm.");
		
	}

}
