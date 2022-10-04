package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaramos las variables
        double longitudMetros;
        int longitudCent;
        //importamos el scanner
        Scanner sc = new Scanner(System.in);
        //le pedimos al usuario que introduzca una longitud en metros
        System.out.println("Por favor introduzca la longitud en metros de un lanzamiento: ");
        longitudMetros=sc.nextDouble();
        //pasamos esa longitud de metros a segundos y la truncamos con cast
        longitudCent = (int) (longitudMetros*100);
		//Le mostramos al usuario la longitud en centímetros
        System.out.println("La longitud en centímetros es "+longitudCent+ " cm.");
	}

}
