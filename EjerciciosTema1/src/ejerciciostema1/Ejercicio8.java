package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introducimos las variables con double ya que se utilizan decimales al ser precios
        double infantil;
        double adulto;
        double entradaInf;
        double entradaAdulto;
        double suma;
        double descuento;
        //importamos el scanner 
        Scanner sc = new Scanner(System.in);
        // Le pedimos qal usuario que introduzca el numero de entradas infantiles que quiere comprar
		System.out.println("Por favor introduzca el número de entradas infantiles que desea comprar: ");
		infantil = sc.nextDouble();
		// Le pedimos qal usuario que introduzca el numero de entradas adultas que quiere comprar
		System.out.println("Por favor introduzca el número de entradas de adulto que desea comprar: ");
		adulto = sc.nextDouble();
		// calculamos el precio depende de que entradas y que número de entradas compre el cliente
		entradaInf = infantil*15.50;
		
		entradaAdulto = adulto*20;
		// realizamos la suma total del precio de las entradas
		
		suma = entradaInf+entradaAdulto;
		//hacemos el descuento a las entradas si el monto de dinero es mayor a 100 euros
		descuento= suma - (suma *0.05);
		suma = suma>=100 ? descuento: suma ;
		// mostramos al usuario el precio total y se le aplica el descuento si supera los 100 euros
		System.out.println("El importe total es: "+suma+ " euros");
		
		
		
		
		
		
		
	}

}
