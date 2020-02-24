package tablasMultiplicar;

import pideDatos.PideDatos;

public class Main {

	public static void main(String[] args) {
		int num1, num2, num3;

		System.out.println("A continuaci�n se le pedir�n 3 numeros enteros para calcular sus respectivas tablas de multiplicar:\n");

		num1 = PideDatos.pideEntero("Valor del 1er n�mero:\n");

		num2 = PideDatos.pideEntero("Valor del 2do n�mero:\n");

		num3 = PideDatos.pideEntero("Valor del 3er n�mero:\n");

		TablasMultiplicar tm1 = new TablasMultiplicar(num1);

		TablasMultiplicar tm2 = new TablasMultiplicar(num2);

		TablasMultiplicar tm3 = new TablasMultiplicar(num3);

		
		try {System.out.println("Tabla de multiplicar del n�: " + num1 + "\n");

			tm1.start();

			tm1.join();
			
			System.out.println("Tabla de multiplicar del n�: " + num2 + "\n");

			tm2.start();

			tm2.join();
			
			System.out.println("Tabla de multiplicar del n�: " + num3 + "\n");

			tm3.start();

			tm3.join();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		System.out.println("Programa finalizado. Puede consultar las tablas.");
	}

}
