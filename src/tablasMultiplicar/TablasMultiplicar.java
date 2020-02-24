package tablasMultiplicar;

public class TablasMultiplicar extends Thread {
	
	private int num;

	public TablasMultiplicar(int num) {

		this.num = num;

	}

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " x " + num + " = " + (i * num));

		}

		System.out.println("Fin de la tabla del "+num);
		System.out.println("--------------------------");
	}
}