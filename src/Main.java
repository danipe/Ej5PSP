
public class Main {

	public static void main(String[] args) {
		/*
		 * Ejercicio 6 hecho con Threads
		 * */
		MiHilo hilo1 = new MiHilo("hilo1");
		MiHilo hilo2 = new MiHilo("hilo2");
		hilo1.start();
		hilo2.start();
		try {
			hilo1.join();
			System.out.println("Finlaza el hilo1");
			hilo2.join();
			System.out.println("Finaliza el hilo2");
		} catch (Exception e) {
			System.out.println("Alguien se ha muerto");
		}
		
		/*
		 * Ejercicio 6 hecho con Runnables
		 * */
//		MiRunnable hilo1 = new MiRunnable("hilo1");
//		MiRunnable hilo2 = new MiRunnable("hilo2");
	}

}
