package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
        int hora;
        int minuto;
        int segundos;
		int seg;
		int restoH;
		//Importamos el scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca una cantidad de segundos para calcular las horas minutos y segundos que son
		System.out.println("Por favor introduzca una cantidad de segundos: ");
		seg = sc.nextInt();
		//una hora son 3600 segundos por tanto dividimos los segundos entre 3600 para calcular las horas
		hora= seg/3600;
		//calculamos el resto de la division de sengundos entre 3600, pra calcular los minutos
		restoH= seg%3600;
		//los segundos restantes los dividimos entre 60 para calcular los minutos
		minuto= restoH/60;
		// igualamos los segundos al cálculo del resto de la división de minutos entre 60, para mostrar los segundos restantes
		segundos= restoH%60;
		//mostramos al usuario las horas, los minutos y los segundos que resultan
		System.out.println("son "+hora+" horas "+minuto+" minutos "+segundos+" segundos.");
		
	}

}
