
public class MiRunnable implements Runnable{
	
	String palabra;
	Thread t;
	
	MiRunnable(String p) {
		this.palabra = p;
		t = new Thread(this);
		t.start();
		try {
			t.join();
			System.out.println("Finaliza el "+palabra);
		} catch (Exception e) {
			System.out.println("Se murió");
		}
		
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i<10; i++) {
				System.out.println("Bienvenido soy el "+palabra+" y estoy en la iteración "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Se murió");
		}
		
	}
}
