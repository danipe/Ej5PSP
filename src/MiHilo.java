
public class MiHilo extends Thread {
	
	String palabra;
	
	MiHilo(String p) {
		this.palabra = p;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i<10 ; i++) {
				System.out.println("Bienvenido, soy el "+palabra+" y estoy en la iteraci�n "+i);
				sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("David est� muerto");
		}
	}
}
