//Ejercicio 1:

//Calculo de tablas de multiplicar en paralelo. Crear una aplicación java que cree 3 hilos para calcular y visualizar de forma paralela 3 tablas de multiplicar.
//Al crear los hilos les pasamos los valores o los podéis pedir previamente por el teclado.
//Podéis jugar también con las prioridades para ver como se comportan los diferentes hilos.


package tablasMultiplicar;

import pideDatos.PideDatos;

public class Main {

	public static void main(String[] args) {
		int num1, num2, num3;

		System.out.println("Introduzca 3 número para el cálculo de sus tablas de multiplicar:\n");

		num1 = PideDatos.pideEntero("1er número:\n");

		num2 = PideDatos.pideEntero("2do número:\n");

		num3 = PideDatos.pideEntero("3er número:\n");

		TablasMultiplicar tm1 = new TablasMultiplicar(num1);

		TablasMultiplicar tm2 = new TablasMultiplicar(num2);

		TablasMultiplicar tm3 = new TablasMultiplicar(num3);

		
		try {System.out.println("Tabla de multiplicar del nº: " + num1 + "\n");

			tm1.start();

			tm1.join();
			
			System.out.println("Tabla de multiplicar del nº: " + num2 + "\n");

			tm2.start();

			tm2.join();
			
			System.out.println("Tabla de multiplicar del nº: " + num3 + "\n");

			tm3.start();

			tm3.join();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		System.out.println("Programa finalizado. Puede consultar las tablas.");
	}

}
