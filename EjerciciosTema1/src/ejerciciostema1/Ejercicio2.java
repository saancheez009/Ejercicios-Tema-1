package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducimos las variables numero entero, resto y el numero final que es el número que hay que sumar para que el numero entero sea múltiplo de 7
        int numeroEntero;
		int resto;
		int numeroFinal;
		//Introducimos el scanner 
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que introduzca un numero entero
		System.out.println("Por favor introduzca un número entero: ");
		
		numeroEntero = sc.nextInt();
		// calculamos el resto de la divion del numero entero entre siete
	    resto = numeroEntero % 7;//cálculo del resto
	    //Para el calculo del numero que hay que sumar , le restamos a 7 el resto
	    numeroFinal = 7 - resto;
	    // Declaramos que si el numero introducido por el usuario es múltiplo de siete el resultado del número que hay que sumar es 0
	    numeroFinal = resto == 0 ? 0 : numeroFinal ;
	    
		// Le mostramos al usuario el número que hay que sumar a su número para que sea múltiplo de siete
	   System.out.println("La cantidad que hay que sumarle para que sea múltiplo de 7 es: "+ numeroFinal );
	    		
	    
		
		
		
	}

}
