package unico;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 Realiza un programa que resuelva una 
		 ecuación de segundo grado (del tipo: ax2 + bx + c = 0).
		 */
		
		Scanner leer = new Scanner (System.in);
		
		double a;
		double b;
		double c;
		double x1;
		double x2;
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo: ax2 + bx + c = 0");
		System.out.println("Por favor, introduzca el valor de a:");
		a = leer.nextDouble();
		System.out.println("Ahora introduzca el valor de b:");
		b = leer.nextDouble();
		System.out.println("Por último introduzca el valor de c");
		c = leer.nextDouble();
		
		x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;


		if (x1 != x2) {
			System.out.println("Las soluciones son " + x1 + " y " + x2);
		}
		if (x1 == x2) {
			System.out.println("La solucion es doble " + x1);
		}

		
	
	}

}
