package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducimos las variables num1,num2, resto y el numero final que es el número que hay que sumar al num 1 para que sea múltiplo del num2
        int num1;
		int num2;
		int resto;
		int numeroFinal;
		// introducimos el scanner
		Scanner sc = new Scanner(System.in);
	// Le pedimos al usuarioque introduzca un número
		System.out.println("Por favor introduzca un número: ");
		
		num1 = sc.nextInt();
		//Le pedimos al usuario que introduzca otro número
		System.out.println("Por favor introduzca otro número: ");
		
		num2 = sc.nextInt();
		// calculamos el resto de la divion del num1 entre el num2
	    resto = num1 % num2;//cálculo del resto
	  //Para el calculo del numero que hay que sumar , le restamos al num2 el resto
	    numeroFinal = num2 - resto;
	 // Declaramos que si el numero introducido por el usuario es múltiplo del num2 el resultado del número que hay que sumar es 0
	    numeroFinal = resto == 0 ? 0 : numeroFinal ;
	    // Le mostramos al usuario la cantidad que hay que sumarle al num1 para ser múltiplo del num2
		
	   System.out.println("La cantidad que hay que sumarle para que sea múltiplo de " +num2+ " es: " + numeroFinal );
	    		
	}

}
